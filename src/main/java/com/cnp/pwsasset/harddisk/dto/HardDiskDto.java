package com.cnp.pwsasset.harddisk.dto;

import com.cnp.pwsasset.harddisk.entity.HardDisk;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class HardDiskDto {
    private int id;                 // 번호
    private String company;         // 회사명
    private String classification;  // 자산구분
    private String headquarters;    // 본부
    private String idasset;         // 자산관리번호
    private String model;           // 모델명
    private Date introduction_date; // 도입연도
    private String area;            // 지역
    private String team;            // 팀명
    private String manager;         // 담당자
    private String location;        // 위치
    private String object;          // 사용구분
    private Date application_date;  // 지원일자
    private int ssd_500gb;          // 500GB SSD
    private int sata_1tb;           // 1TB SATA
    private int m2_512gb;           // 512GB M.2
    private int sata_2tb;           // 2TB SATA
    private String note;            // 비고

    public HardDiskDto(HardDisk hardDisk) {
        id = hardDisk.getId();
        company = hardDisk.getCompany();
        classification = hardDisk.getClassification();
        headquarters = hardDisk.getHeadquarters();
        idasset = hardDisk.getIdasset();
        model = hardDisk.getModel();
        introduction_date = hardDisk.getIntroduction_date();
        area = hardDisk.getArea();
        team = hardDisk.getTeam();
        manager = hardDisk.getManager();
        location = hardDisk.getLocation();
        object = hardDisk.getObject();
        application_date = hardDisk.getApplication_date();
        ssd_500gb = hardDisk.getSsd_500gb();
        sata_1tb = hardDisk.getSata_1tb();
        m2_512gb = hardDisk.getM2_512gb();
        sata_2tb = hardDisk.getSata_2tb();
        note = hardDisk.getNote();
    }
}
