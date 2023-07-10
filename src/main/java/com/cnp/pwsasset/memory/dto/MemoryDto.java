package com.cnp.pwsasset.memory.dto;

import com.cnp.pwsasset.memory.entity.Memory;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class MemoryDto {
    private int id;                 // 번호
    private String company;         // 회사명
    private String headquarters;    // 본부
    private String idasset;         // 자산관리번호
    private String model;           // 모델명
    private Date introduction_date; // 도입연도
    private String area;            // 지역
    private String team;            // 팀명
    private String manager;         // 담당자
    private String location;        // 위치
    private String uptake;          // 사용구분
    private Date application_date;  // 지원일자
    private int GB4;                // 4GB
    private int GB8;                // 8GB
    private int GB16;               // 16GB
    private int GB32;               // 32GB
    private String volume;          // 증설용량
    private String note;            // 비고

    public MemoryDto(Memory memory) {
        id = memory.getId();
        company = memory.getCompany();
        headquarters = memory.getHeadquarters();
        idasset = memory.getIdasset();
        model = memory.getModel();
        introduction_date = memory.getIntroduction_date();
        area = memory.getArea();
        team = memory.getTeam();
        manager = memory.getManager();
        location = memory.getLocation();
        uptake = memory.getUptake();
        application_date = memory.getApplication_date();
        GB4 = memory.getGB4();
        GB8 = memory.getGB8();
        GB16 = memory.getGB16();
        GB32 = memory.getGB32();
        volume = memory.getVolume();
        note = memory.getNote();
    }
}
