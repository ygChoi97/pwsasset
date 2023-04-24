package com.cnp.pwsasset.user.repository;

import com.cnp.pwsasset.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    // userid를 통해 회원정보 조회하기
    UserEntity findUserByUserId(String userid);

    // userid가 중복인지 조회하기
    boolean existsByUserId(String userid);

    // 회원 가입하기
    boolean register(UserEntity entity);

    // 회원의 프로필 사진 경로 조회
    String findProfile(String userId);
}
