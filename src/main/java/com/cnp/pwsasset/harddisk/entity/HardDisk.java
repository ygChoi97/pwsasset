package com.cnp.pwsasset.harddisk.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class HardDisk {
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
    private int ssd_500gb;          // 500GB SSD
    private int sata_1tb;           // 1TB SATA
    private int m2_512gb;           // 512GB M.2
    private int sata_2tb;           // 2TB SATA
    private String note;            // 비고
}
