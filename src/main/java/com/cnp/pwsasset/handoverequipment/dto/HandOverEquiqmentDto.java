package com.cnp.pwsasset.handoverequipment.dto;

import com.cnp.pwsasset.handoverequipment.entity.HandOverEquiqment;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HandOverEquiqmentDto {
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
//    private String num;                 // 번호 (pk)
//    private String applicant_team;      // 팀명   (fk_handover_ref_idx)
//    private String applicant;           // 신청자 (fk_handover_ref_idx)

    public HandOverEquiqmentDto(HandOverEquiqment handOverEquiqment) {
        applicant_date = handOverEquiqment.getApplicant_date();
        area_code = handOverEquiqment.getArea_code();
        area = handOverEquiqment.getArea();
        career_type = handOverEquiqment.getCareer_type();
        joinning_date = handOverEquiqment.getJoinning_date();
        id = handOverEquiqment.getId();
        position = handOverEquiqment.getPosition();
        user = handOverEquiqment.getUser();
        headquerters = handOverEquiqment.getHeadquerters();
        center = handOverEquiqment.getCenter();
        teamcode = handOverEquiqment.getTeamcode();
        team = handOverEquiqment.getTeam();
        business = handOverEquiqment.getBusiness();
        phone = handOverEquiqment.getPhone();
        location = handOverEquiqment.getLocation();
        keyboard = handOverEquiqment.getKeyboard();
        mouse_type = handOverEquiqment.getMouse_type();
        mouse_direction = handOverEquiqment.getMouse_direction();
        headset = handOverEquiqment.getHeadset();
        webcam = handOverEquiqment.getWebcam();
        purpose = handOverEquiqment.getPurpose();
        it_admin_id = handOverEquiqment.getIt_admin_id();
        it_admin_name = handOverEquiqment.getIt_admin_name();
        it_admin_phone = handOverEquiqment.getIt_admin_phone();
        asset_admin_id = handOverEquiqment.getAsset_admin_id();
        asset_admin_name = handOverEquiqment.getAsset_admin_name();
        asset_admin_phone = handOverEquiqment.getAsset_admin_phone();
//        num = handOverEquiqment.getNum();
//        applicant_team = handOverEquiqment.getApplicant_team();
//        applicant = handOverEquiqment.getApplicant();
    }
}
