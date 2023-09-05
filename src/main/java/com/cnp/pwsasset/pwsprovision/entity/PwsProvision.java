package com.cnp.pwsasset.pwsprovision.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter @Getter @ToString
@AllArgsConstructor
public class PwsProvision {
    private int id;
    private String classification;  // 자산구분
    private String department;
    private String centercd;
    private String headteam;
    private String center;
    private String headquarters;
    private String sysadmin;
    private String idsysadmin;
    private String assetno;
    private String idasset;
    private String sn;
    private String manager;
    private String idmanager;
    private String area;
    private String locinstall;
    private String model;
    private Date   perioddate;
    private String reason;
    private Date   joiningdate;
    private Date   applicationdate;
    private Date   provisiondate;
    private String note;
}
