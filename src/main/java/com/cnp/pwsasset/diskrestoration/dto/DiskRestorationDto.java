package com.cnp.pwsasset.diskrestoration.dto;

import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class DiskRestorationDto {
    private int id;                             // 번호
    private String classification;              // 자산구분
    private String headquarters;                // 본부
    private String center;                      // 센터
    private String team;                        // 팀
    private String requestor;                   // 요청자
    private String model;                       // 모델명
    private String idasset;                     // 자산관리번호
    private String sn;                          // S/N
    private String area;                        // 지역
    private String building;                    // 건물명
    private String storey;                      // 층수
    private String location;                    // 상세위치
    private String request_hdd_sn;              // 복구신청 HDD S/N
    private String replacement_hdd;             // 교체 HDD S/N
    private String attatchment;                 // 첨부(복구신청서 실장승인본)
    private Date trouble_notice_date;           // 장애신고 접수일자
    private Date request_hdd_receipt_date;      // 복구HDD 접수일자
    private Date request_hdd_carryin_date;      // 복구HDD 반입일자
    private Date replacement_hdd_carryin_date;  // 대여HDD 반입일자
    private Date request_hdd_carryout_date;     // 복구HDD 반출일자
    private Date load_date;                     // 현업 로드일자
    private Date replacement_hdd_format_date;   // 대여HDD 포맷일자
    private Date replacement_hdd_carryout_date; // 대여HDD 반출일자
    private Date request_hdd_deggousing_date;   // 복구HDD 디가우징일자
    private Date request_hdd_disuse_date;       // 복구HDD 폐기일자
    private String status;                      // 복구진행상태
    private String note;                        // 비고

    public DiskRestorationDto(DiskRestoration diskRestoration) {
        id = diskRestoration.getId();
        classification = diskRestoration.getClassification();
        headquarters = diskRestoration.getHeadquarters();
        center = diskRestoration.getCenter();
        team = diskRestoration.getTeam();
        requestor = diskRestoration.getRequestor();
        model = diskRestoration.getModel();
        idasset = diskRestoration.getIdasset();
        sn = diskRestoration.getSn();
        area = diskRestoration.getArea();
        building = diskRestoration.getBuilding();
        storey = diskRestoration.getStorey();
        location = diskRestoration.getLocation();
        request_hdd_sn = diskRestoration.getRequest_hdd_sn();
        replacement_hdd = diskRestoration.getReplacement_hdd();
        attatchment = diskRestoration.getAttatchment();
        trouble_notice_date = diskRestoration.getTrouble_notice_date();
        request_hdd_receipt_date = diskRestoration.getRequest_hdd_receipt_date();
        request_hdd_carryin_date = diskRestoration.getRequest_hdd_carryin_date();
        replacement_hdd_carryin_date = diskRestoration.getReplacement_hdd_carryin_date();
        request_hdd_carryout_date = diskRestoration.getRequest_hdd_carryout_date();
        load_date = diskRestoration.getLoad_date();
        replacement_hdd_format_date = diskRestoration.getReplacement_hdd_format_date();
        replacement_hdd_carryout_date = diskRestoration.getReplacement_hdd_carryout_date();
        request_hdd_carryout_date = diskRestoration.getRequest_hdd_carryout_date();
        request_hdd_deggousing_date = diskRestoration.getRequest_hdd_deggousing_date();
        request_hdd_disuse_date = diskRestoration.getRequest_hdd_disuse_date();
        status = diskRestoration.getStatus();
        note = diskRestoration.getNote();
    }
}
