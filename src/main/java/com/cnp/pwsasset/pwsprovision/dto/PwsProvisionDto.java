package com.cnp.pwsasset.pwsprovision.dto;

import com.cnp.pwsasset.pwsprovision.entity.PwsProvision;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class PwsProvisionDto {
    private String id;
    private String department;
    private String centercd;
    private String headteam;
    private String center;
    private String classification;  // 자산구분
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
    private Date perioddate;
    private String reason;
    private Date   joiningdate;
    private Date   applicationdate;
    private Date   provisiondate;
    private String note;

    public PwsProvisionDto(PwsProvision pwsProvision) {
        id = pwsProvision.getId();
        department = pwsProvision.getDepartment();
        centercd = pwsProvision.getCentercd();
        headteam = pwsProvision.getHeadteam();
        center = pwsProvision.getCenter();
        classification = pwsProvision.getClassification();
        headquarters = pwsProvision.getHeadquarters();
        sysadmin = pwsProvision.getSysadmin();
        idsysadmin = pwsProvision.getIdsysadmin();
        assetno = pwsProvision.getAssetno();
        idasset = pwsProvision.getIdasset();
        sn = pwsProvision.getSn();
        manager = pwsProvision.getManager();
        idmanager = pwsProvision.getIdmanager();
        area = pwsProvision.getArea();
        locinstall = pwsProvision.getLocinstall();
        model = pwsProvision.getModel();
        perioddate = pwsProvision.getPerioddate();
        reason = pwsProvision.getReason();
        joiningdate = pwsProvision.getJoiningdate();
        applicationdate = pwsProvision.getApplicationdate();
        provisiondate = pwsProvision.getProvisiondate();
        note = pwsProvision.getNote();
    }
}
