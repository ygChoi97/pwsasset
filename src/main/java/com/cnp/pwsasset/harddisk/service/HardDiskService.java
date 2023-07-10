package com.cnp.pwsasset.harddisk.service;

import com.cnp.pwsasset.diskrestoration.dto.DiskRestorationDto;
import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.harddisk.dto.FindAllHardDiskDto;
import com.cnp.pwsasset.harddisk.dto.HardDiskDto;
import com.cnp.pwsasset.harddisk.entity.HardDisk;
import com.cnp.pwsasset.harddisk.repository.HardDiskRepository;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class HardDiskService {
//    private final HardDiskRepository repository;
//
//    public FindAllHardDiskDto findAllService() {
//        return new FindAllHardDiskDto(repository.findAll());
//    }
//
//    public HardDiskDto findOneWhereIDService(String id) {
//        HardDisk hardDisk = repository.findOneWhereId(id);
//        log.info("findOneWhereIDService returns data - {}", hardDisk);
//
//        return hardDisk!=null ? new HardDiskDto(hardDisk) : null;
//    }
//
//    public FindAllHardDiskDto createService(HardDisk hardDisk) {
//        if(hardDisk == null) {
//            log.warn("hardDisk cannot be null!");
//            throw new RuntimeException("hardDisk cannot be null!");
//        }
//
//        boolean flag = repository.save(hardDisk);
//
//        if(flag) log.info("자산관리번호 {} 하드디스크자료가 등록되었습니다.", hardDisk.getIdasset());
//        if(flag == false)
//            log.warn("자산관리번호 {} 하드디스크자료가 등록되지 않았습니다.", hardDisk.getIdasset());
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllHardDiskDto importFromExcelService(List<HardDisk> list) {
//        if(list == null) {
//            log.warn("list cannot be null!");
//            throw new RuntimeException("list cannot be null!");
//        }
//        boolean flag = repository.insertData(list);
//
//        if(flag) log.info("하드디스크자료 {}개 항목이 추가/업데이트되었습니다.", list.size());
//        if(flag == false)
//            log.warn("하드디스크자료가 업데이트되지 않았습니다.");
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllHardDiskDto updateWhereIDService(HardDisk hardDisk) {
//        if (hardDisk == null) {
//            log.warn("hardDisk cannot be null!");
//            throw new RuntimeException("hardDisk cannot be null!");
//        }
//
//        boolean flag = repository.modifyWhereID(hardDisk);
//        if(flag == false)
//            log.warn("하드디스크자료가 업데이트되지 않았습니다.");
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
