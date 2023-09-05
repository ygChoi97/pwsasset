package com.cnp.pwsasset.return_equipment.dto;

import com.cnp.pwsasset.return_equipment.entity.ReturnEquipment;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReturnEquiqmentDto {
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

    public ReturnEquiqmentDto(ReturnEquipment returnEquipment) {
        id = returnEquipment.getId();
        user_id = returnEquipment.getUser_id();
        user = returnEquipment.getUser();
        position = returnEquipment.getPosition();
        retireedate = returnEquipment.getRetireedate();
        idasset = returnEquipment.getIdasset();
        assetno = returnEquipment.getAssetno();
        sn = returnEquipment.getSn();
        model = returnEquipment.getModel();
        location = returnEquipment.getLocation();
        monitor = returnEquipment.getMonitor();
        keyboard = returnEquipment.getKeyboard();
        mouse = returnEquipment.getMouse();
        sticker = returnEquipment.getSticker();
        cam_headset = returnEquipment.getCam_headset();
        note = returnEquipment.getNote();
        department = returnEquipment.getDepartment();
        writer = returnEquipment.getWriter();
        returndate = returnEquipment.getReturndate();
    }
}
