package com.cnp.pwsasset.videoeq.repository;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.videoeq.entity.VideoEquipment;

import java.util.List;

public interface VideoEquipmentRepository {
    List<VideoEquipment> findAll();

    VideoEquipment findOneWhereId(String id);

    boolean save(VideoEquipment videoEquipment);

    boolean insertData(List<VideoEquipment> list);

    boolean modifyWhereID(VideoEquipment videoEquipment);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
