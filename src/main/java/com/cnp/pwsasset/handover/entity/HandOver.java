package com.cnp.pwsasset.handover.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class HandOver {
    private String applicant_team;      // 팀명
    private String applicant;           // 신청자
    private Date applicant_date;        // 신청일
    private String area;                // 지역
    private String it_admin_id;         // 사번 (팀 전산담당자)
    private String it_admin_name;       // 이름 (팀 전산담당자)
    private String it_admin_phone;      // 전화번호 (팀 전산담당자)
    private String asset_admin_id;      // 사번 (팀 자산담당자)
    private String asset_admin_name;    // 이름 (팀 자산담당자)
    private String asset_admin_phone;   // 전화번호 (팀 자산담당자)
}
