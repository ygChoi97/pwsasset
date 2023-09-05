package com.cnp.pwsasset.return_equipment.repository;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.return_equipment.entity.ReturnEquipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface ReturnEquipmentRepository {
    List<ReturnEquipment> findAll();

    ReturnEquipment findOne(int id, String writer, String department, Date returndate);

    boolean insertData(List<ReturnEquipment> list);

    boolean modify(ReturnEquipment returnEquipment);

    List<ItemNameOfAssetDTO> queryColumnComment();

    List<ReturnEquipment> findWhereWriterInfo(String writer, String department, Date returndate);
}
