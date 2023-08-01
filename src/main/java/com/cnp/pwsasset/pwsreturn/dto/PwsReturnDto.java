package com.cnp.pwsasset.pwsreturn.dto;

import com.cnp.pwsasset.pwsreturn.entity.PwsReturn;
import lombok.*;

import java.util.Date;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class PwsReturnDto {
    private String id;
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
    public PwsReturnDto(PwsReturn pwsReturn) {
        id = pwsReturn.getId();
        classification = pwsReturn.getClassification();
        headquarters = pwsReturn.getHeadquarters();
        hoteam = pwsReturn.getHoteam();
        housername = pwsReturn.getHousername();
        houserid = pwsReturn.getHouserid();
        toteam = pwsReturn.getToteam();
        manager = pwsReturn.getManager();
        assetno = pwsReturn.getAssetno();
        idasset = pwsReturn.getIdasset();
        sn = pwsReturn.getSn();
        model = pwsReturn.getModel();
        area = pwsReturn.getArea();
        location = pwsReturn.getLocation();
        reason = pwsReturn.getReason();
        note = pwsReturn.getNote();
        resigndate = pwsReturn.getResigndate();
        returndate = pwsReturn.getReturndate();
    }
}
