package com.cnp.pwsasset.diskrestoration.repository;

import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;

import java.util.List;

public interface DiskRestorationRepository {
    List<DiskRestoration> findAll();

    DiskRestoration findOneWhereId(String id);

    boolean save(DiskRestoration diskRestoration);

    boolean insertData(List<DiskRestoration> list);

    boolean modifyWhereID(DiskRestoration diskRestoration);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
