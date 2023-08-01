package com.cnp.pwsasset.diskrestoration.repository;

import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiskRestorationRepository {
    List<DiskRestoration> findAll();

    DiskRestoration findOneWhereId(String id);

    boolean save(DiskRestoration diskRestoration);

    boolean insertData(List<DiskRestoration> list);

    boolean modifyWhereID(DiskRestoration diskRestoration);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
