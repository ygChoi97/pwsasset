package com.cnp.pwsasset.handoverequipment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class HandOverEquiqment {
    private Date applicant_date;        // 신청일
    private String area_code;           // 지역코드
    private String area;                // 지역
    private String career_type;         // 구분 (경력/신입)
    private Date joinning_date;         // 입사일
    private String id;                  // 사번
    private String position;            // 직급/직책
    private String user;                // 성명
    private String headquerters;        // 본부소속
    private String center;              // 센터
    private String teamcode;            // 팀코드
    private String team;                // 팀명
    private String business;            // 업무명
    private String phone;               // 전화번호
    private String location;            // 건물(동)(층/위치)
    private String keyboard;            // 키보드
    private String mouse_type;          // 마우스타입
    private String mouse_direction;     // 마우스구분
    private String headset;             // 헤드셋
    private String webcam;              // 웹캠
    private String purpose;             // 장비용도
    private String it_admin_id;         // 사번 (팀 전산담당자)
    private String it_admin_name;       // 이름 (팀 전산담당자)
    private String it_admin_phone;      // 전화번호 (팀 전산담당자)
    private String asset_admin_id;      // 사번 (팀 자산담당자)
    private String asset_admin_name;    // 이름 (팀 자산담당자)
    private String asset_admin_phone;   // 전화번호 (팀 자산담당자)
    private String num;               // 번호 (pk)
    private String applicant_team;      // 팀명   (fk_handover_ref_idx)
    private String applicant;           // 신청자 (fk_handover_ref_idx)
}
