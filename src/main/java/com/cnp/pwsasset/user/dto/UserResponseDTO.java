package com.cnp.pwsasset.user.dto;

import com.cnp.pwsasset.user.entity.UserEntity;
import lombok.*;

@Setter @Getter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

    private String email;
    private String username;
    private String token; // 인증 토큰

    public UserResponseDTO(UserEntity entity) {
        this.email = entity.getEmail();
        this.username = entity.getUsername();
    }
}
