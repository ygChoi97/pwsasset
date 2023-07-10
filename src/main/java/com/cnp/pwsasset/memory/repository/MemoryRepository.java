package com.cnp.pwsasset.memory.repository;

import com.cnp.pwsasset.memory.entity.Memory;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;

import java.util.List;

public interface MemoryRepository {
    List<Memory> findAll();

    Memory findOneWhereId(String id);

    boolean save(Memory memory);

    boolean insertData(List<Memory> list);

    boolean modifyWhereID(Memory memory);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
