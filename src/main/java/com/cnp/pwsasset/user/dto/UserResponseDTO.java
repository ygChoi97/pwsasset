package com.cnp.pwsasset.user.dto;

import com.cnp.pwsasset.user.entity.UserEntity;
import lombok.*;

@Setter @Getter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

    private String userid;
    private String username;
    private String role;
    private String token; // 인증 토큰

    public UserResponseDTO(UserEntity entity) {
        this.userid = entity.getUserid();
        this.username = entity.getUsername();
        this.role = entity.getRole();
    }
}
