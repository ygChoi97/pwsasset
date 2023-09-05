package com.cnp.pwsasset.handoverequipment.repository;

import com.cnp.pwsasset.handoverequipment.entity.HandOverEquiqment;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface HandOverEquipmentRepository {
    List<HandOverEquiqment> findAll();

    HandOverEquiqment findOne(String index, String applicant_team, String applicant, Date applicant_date);

    boolean insertData(List<HandOverEquiqment> list);

    boolean modify(HandOverEquiqment handOverEquiqment);

    List<ItemNameOfAssetDTO> queryColumnComment();
    List<HandOverEquiqment> findWhereApplicantInfo(String applicant_team, String applicant, Date applicant_date);
}
