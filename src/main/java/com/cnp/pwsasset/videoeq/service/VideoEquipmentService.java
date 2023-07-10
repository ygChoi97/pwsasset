package com.cnp.pwsasset.videoeq.service;

import com.cnp.pwsasset.diskrestoration.dto.DiskRestorationDto;
import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.videoeq.dto.FindAllVideoEquipmentDto;
import com.cnp.pwsasset.videoeq.dto.VideoEquipmentDto;
import com.cnp.pwsasset.videoeq.entity.VideoEquipment;
import com.cnp.pwsasset.videoeq.repository.VideoEquipmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class VideoEquipmentService {
//    private final VideoEquipmentRepository repository;
//    public FindAllVideoEquipmentDto findAllService() {
//        return new FindAllVideoEquipmentDto(repository.findAll());
//    }
//
//    public VideoEquipmentDto findOneWhereIDService(String id) {
//        VideoEquipment videoEquipment = repository.findOneWhereId(id);
//        log.info("findOneWhereIDService returns data - {}", videoEquipment);
//
//        return videoEquipment!=null ? new VideoEquipmentDto(videoEquipment) : null;
//    }
//
//    public FindAllVideoEquipmentDto createService(VideoEquipment videoEquipment) {
//        if(videoEquipment == null) {
//            log.warn("videoEquipment cannot be null!");
//            throw new RuntimeException("videoEquipment cannot be null!");
//        }
//
//        boolean flag = repository.save(videoEquipment);
//
//        if(flag) log.info("자산관리번호 {} 영상관련장비자료가 등록되었습니다.", videoEquipment.getIdasset());
//        if(flag == false)
//            log.warn("자산관리번호 {} 영상관련장비자료가 등록되지 않았습니다.", videoEquipment.getIdasset());
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllVideoEquipmentDto importFromExcelService(List<VideoEquipment> list) {
//        if(list == null) {
//            log.warn("list cannot be null!");
//            throw new RuntimeException("list cannot be null!");
//        }
//        boolean flag = repository.insertData(list);
//
//        if(flag) log.info("영상관련장비자료 {}개 항목이 추가/업데이트되었습니다.", list.size());
//        if(flag == false)
//            log.warn("영상관련장비자료가 업데이트되지 않았습니다.");
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllVideoEquipmentDto updateWhereIDService(VideoEquipment videoEquipment) {
//        if (videoEquipment == null) {
//            log.warn("videoEquipment cannot be null!");
//            throw new RuntimeException("videoEquipment cannot be null!");
//        }
//
//        boolean flag = repository.modifyWhereID(videoEquipment);
//        if(flag == false)
//            log.warn("영상관련장비자료가 업데이트되지 않았습니다.");
//        return flag ? findAllService() : null;
//    }
//
//    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
//        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
//        log.info("queryColumnCommentService returns data - {}", column_info);
//
//        return column_info;
//    }
}
