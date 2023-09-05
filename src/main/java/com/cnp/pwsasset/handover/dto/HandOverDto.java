package com.cnp.pwsasset.handover.dto;

import com.cnp.pwsasset.handover.entity.HandOver;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HandOverDto {
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

    public HandOverDto(HandOver handOver) {
        applicant_team = handOver.getApplicant_team();
        applicant = handOver.getApplicant();
        applicant_date = handOver.getApplicant_date();
        area = handOver.getArea();
        it_admin_id = handOver.getAsset_admin_id();;
        it_admin_name = handOver.getIt_admin_name();
        it_admin_phone = handOver.getIt_admin_phone();
        asset_admin_id = handOver.getAsset_admin_id();
        asset_admin_name = handOver.getAsset_admin_name();
        asset_admin_phone = handOver.getAsset_admin_phone();
    }
}
