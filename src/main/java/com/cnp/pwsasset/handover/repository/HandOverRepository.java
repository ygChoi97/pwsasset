package com.cnp.pwsasset.handover.repository;

import com.cnp.pwsasset.handover.entity.HandOver;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HandOverRepository {
    public List<HandOver> findAll();

    public HandOver findOne(String applicant_team, String applicant, String applicant_date);

    boolean insertData(HandOver handOver);

    boolean modify(HandOver handOver);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
