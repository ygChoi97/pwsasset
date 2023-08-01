package com.cnp.pwsasset.videoeq.dto;

import com.cnp.pwsasset.videoeq.entity.VideoEquipment;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class VideoEquipmentDto {
    private int id;                     // 번호
    private String company;             // 회사명
    private String classification;      // 자산구분
    private String headquarters;        // 본부
    private String idasset;             // 자산관리번호
    private String model;               // 모델명
    private Date introduction_date;     // 도입연도
    private String team;                // 팀명
    private String requestor;           // 요청자
    private String requestor_id;        // 요청자 사번
    private String user_name;           // 실사용자
    private String user_id;             // 실사용자 사번
    private String area;                // 지역
    private String building;            // 건물명
    private String storey;              // 층수
    private Date request_date;          // 요청일
    private Date provision_date;        // 지급일
    private int headset;                // 헤드셋
    private int webcam;                 // 웹캠
    private int usbgender;              // USB젠더
    private String replacement_goods;   // 고장교체품목
    private String reason;              // 지급사유
    private String note;                // 비고

    public VideoEquipmentDto(VideoEquipment videoEquipment) {
        id = videoEquipment.getId();
        company = videoEquipment.getCompany();
        classification = videoEquipment.getClassification();
        headquarters = videoEquipment.getHeadquarters();
        idasset = videoEquipment.getIdasset();
        model = videoEquipment.getModel();
        introduction_date = videoEquipment.getIntroduction_date();
        team = videoEquipment.getTeam();
        requestor = videoEquipment.getRequestor();
        requestor_id = videoEquipment.getRequestor_id();
        user_name = videoEquipment.getUser_name();
        user_id = videoEquipment.getUser_id();
        area = videoEquipment.getArea();
        building = videoEquipment.getBuilding();
        storey = videoEquipment.getStorey();
        request_date = videoEquipment.getRequest_date();
        provision_date = videoEquipment.getProvision_date();
        headset = videoEquipment.getHeadset();
        webcam = videoEquipment.getWebcam();
        usbgender = videoEquipment.getUsbgender();
        replacement_goods = videoEquipment.getReplacement_goods();
        reason = videoEquipment.getReason();
        note = videoEquipment.getNote();
    }
}
