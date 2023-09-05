package com.cnp.pwsasset.return_equipment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ReturnEquipment {
    private int id;                     // 번호
    private String user_id;             // 사번
    private String user;                // 사용자
    private String position;            // 직위
    private Date retireedate;           // 퇴직일
    private String idasset;             // 자산번호
    private String assetno;             // 관리번호
    private String sn;                  // S/N
    private String model;               // 모델명
    private String location;            // 사무실위치 (동 층)
    private String monitor;             // 모니터1
    private String keyboard;            // 키보드
    private String mouse;               // 마우스
    private String sticker;             // 보안스티커
    private String cam_headset;         // 캠/헤드셋
    private String note;                // 비고
    private String department;          // 부서명
    private String writer;              // 작성자
    private Date returndate;            // 반납일자

}
