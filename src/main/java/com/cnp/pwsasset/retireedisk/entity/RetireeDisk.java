package com.cnp.pwsasset.retireedisk.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class RetireeDisk {
    private int id;                 // 번호
    private String team;            // 팀명
    private String retiree_name;    // 퇴사자
    private String retiree_id;      // 사번
    private String idasset;         // 자산관리번호
    private String sn;              // S/N
    private String product_name;    // 품명
    private String area;            // 지역
    private Date return_date;       // 장비 반납일
    private Date resign_date;       // 퇴사일
    private String hdd1;            // 1 HDD S/N
    private String hdd2;            // 2 HDD S/N
    private String hdd3;            // 3 HDD S/N
    private String hdd4;            // 4 HDD S/N
    private String hdd_volume;      // HDD 용량
    private String return_name;     // 반납자
    private String return_id;       // 사번
    private Date handover_date;     // 인계일
    private String handover_name;   // 인계자
    private Date security_date;     // 보안팀 인계
    private Date manager_date;      // 총무 인수일
    private String acceptor;        // 인수자
    private String box_no;          // 보관BOX NO
    private String note;            // 비고
}
