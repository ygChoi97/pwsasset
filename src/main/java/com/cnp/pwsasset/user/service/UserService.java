package com.cnp.pwsasset.user.service;

import com.cnp.pwsasset.user.entity.UserEntity;
import com.cnp.pwsasset.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    // 회원 가입 기능
    public UserEntity createServ(final UserEntity userEntity) throws RuntimeException {
        if (userEntity == null || userEntity.getUserid() == null) {
            throw new RuntimeException("Invalid args!");
        }

        // 패스워드 인코딩
        String rawPw = userEntity.getPassword();
        userEntity.setPassword(encoder.encode(rawPw));

        boolean flag = userRepository.register(userEntity);

        return flag
                ? getByCredential(userEntity.getUserid())
                : null;
    }

    public UserEntity getByCredential(String userid) {
        return userRepository.findUserByUserId(userid);
    }

    // 로그인 검증 메서드
    public UserEntity validateLogin(final String userid, final String password) {

        // 회원가입을 했는가?
        UserEntity user = getByCredential(userid);

        if (user == null) throw new RuntimeException("가입된 회원이 아닙니다.");

        // 패스워드가 일치하는가?
        if (!encoder.matches(password, user.getPassword())) {
            throw new RuntimeException("비밀번호가 틀렸습니다.");
        }

        return user; // 로그인 성공시 회원정보 리턴
    }

    // userid 중복체크
    public boolean isDuplicate(String userid) {
        return userRepository.existsByUserId(userid);
    }


    // 프로필 찾기
    public String getProfilePath(String userId) {
        String profile = userRepository.findProfile(userId);
        log.info("find profile path - {}", profile);
        return profile;
    }
}








