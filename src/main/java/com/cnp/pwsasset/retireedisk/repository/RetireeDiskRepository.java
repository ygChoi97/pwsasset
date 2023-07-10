package com.cnp.pwsasset.retireedisk.repository;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.retireedisk.entity.RetireeDisk;

import java.util.List;

public interface RetireeDiskRepository {
    List<RetireeDisk> findAll();

    RetireeDisk findOneWhereId(String id);

    boolean save(RetireeDisk retireeDisk);

    boolean insertData(List<RetireeDisk> list);

    boolean modifyWhereID(RetireeDisk retireeDisk);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
