package com.cnp.pwsasset.pwsreturn.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter @Getter @ToString
@AllArgsConstructor
public class PwsReturn {
    private int id;
    private String classification;  // 자산구분
    private String headquarters;    // 본부
    private String hoteam;
    private String housername;
    private String houserid;
    private String toteam;
    private String manager;
    private String assetno;
    private String idasset;
    private String sn;
    private String model;
    private String area;            // 지역
    private String location;
    private String reason;
    private String note;
    private Date resigndate;
    private Date returndate;
}