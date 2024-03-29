package com.cnp.pwsasset.user.dto;

import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {

    private String userid;
    private String password;
    private String username;
    private String role;
}
