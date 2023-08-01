package com.cnp.pwsasset.memory.dto;

import com.cnp.pwsasset.memory.entity.Memory;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class MemoryDto {
    private int id;                 // 번호 (PK)
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
    private int gb4;                // 4gb
    private int gb8;                // 8gb
    private int gb16;               // 16gb
    private int gb32;               // 32gb
    private String volume;          // 증설용량
    private String note;            // 비고

    public MemoryDto(Memory memory) {
        id = memory.getId();
        company = memory.getCompany();
        classification = memory.getClassification();
        headquarters = memory.getHeadquarters();
        idasset = memory.getIdasset();
        model = memory.getModel();
        introduction_date = memory.getIntroduction_date();
        area = memory.getArea();
        team = memory.getTeam();
        manager = memory.getManager();
        location = memory.getLocation();
        object = memory.getObject();
        application_date = memory.getApplication_date();
        gb4 = memory.getGb4();
        gb8 = memory.getGb8();
        gb16 = memory.getGb16();
        gb32 = memory.getGb32();
        volume = memory.getVolume();
        note = memory.getNote();
    }
}
