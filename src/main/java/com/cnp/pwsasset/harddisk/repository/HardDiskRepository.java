package com.cnp.pwsasset.harddisk.repository;

import com.cnp.pwsasset.harddisk.entity.HardDisk;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;

import java.util.List;

public interface HardDiskRepository {
    List<HardDisk> findAll();

    HardDisk findOneWhereId(String id);

    boolean save(HardDisk hardDisk);

    boolean insertData(List<HardDisk> list);

    boolean modifyWhereID(HardDisk hardDisk);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
