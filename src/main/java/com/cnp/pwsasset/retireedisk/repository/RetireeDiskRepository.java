package com.cnp.pwsasset.retireedisk.repository;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.retireedisk.entity.RetireeDisk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RetireeDiskRepository {
    List<RetireeDisk> findAll();

    RetireeDisk findOneWhereId(String retiree_id);

    boolean save(RetireeDisk retireeDisk);

    boolean insertData(List<RetireeDisk> list);

    boolean modifyWhereID(RetireeDisk retireeDisk);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
