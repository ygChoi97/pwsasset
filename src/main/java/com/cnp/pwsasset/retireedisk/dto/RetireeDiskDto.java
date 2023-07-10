package com.cnp.pwsasset.retireedisk.dto;

import com.cnp.pwsasset.retireedisk.entity.RetireeDisk;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class RetireeDiskDto {
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

    public RetireeDiskDto(RetireeDisk retireeDisk) {
        id = retireeDisk.getId();
        team = retireeDisk.getTeam();
        retiree_name = retireeDisk.getRetiree_name();
        retiree_id = retireeDisk.getRetiree_id();
        idasset = retireeDisk.getIdasset();
        sn = retireeDisk.getSn();
        product_name = retireeDisk.getProduct_name();
        area = retireeDisk.getArea();
        return_date = retireeDisk.getReturn_date();
        resign_date = retireeDisk.getResign_date();
        hdd1 = retireeDisk.getHdd1();
        hdd2 = retireeDisk.getHdd2();
        hdd3 = retireeDisk.getHdd3();
        hdd4 = retireeDisk.getHdd4();
        hdd_volume = retireeDisk.getHdd_volume();
        return_name = retireeDisk.getReturn_name();
        return_id = retireeDisk.getReturn_id();
        handover_date = retireeDisk.getHandover_date();
        handover_name = retireeDisk.getHandover_name();
        security_date = retireeDisk.getSecurity_date();
        manager_date = retireeDisk.getManager_date();
        acceptor = retireeDisk.getAcceptor();
        box_no = retireeDisk.getBox_no();
        note = retireeDisk.getNote();
    }
}
