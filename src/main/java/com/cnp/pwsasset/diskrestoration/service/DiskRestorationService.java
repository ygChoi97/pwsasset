package com.cnp.pwsasset.diskrestoration.service;

import com.cnp.pwsasset.diskrestoration.dto.DiskRestorationDto;
import com.cnp.pwsasset.diskrestoration.dto.FindAllDiskRestorationDto;
import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.diskrestoration.repository.DiskRestorationRepository;
import com.cnp.pwsasset.pws.dto.FindAllPwsDto;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DiskRestorationService {
//    private final DiskRestorationRepository repository;
//
//    public FindAllDiskRestorationDto findAllService() {
//        return new FindAllDiskRestorationDto(repository.findAll());
//    }
//
//    public DiskRestorationDto findOneWhereIDService(String id) {
//        DiskRestoration diskRestoration = repository.findOneWhereId(id);
//        log.info("findOneWhereIDService returns data - {}", diskRestoration);
//
//        return diskRestoration!=null ? new DiskRestorationDto(diskRestoration) : null;
//    }
//
//    public FindAllDiskRestorationDto createService(DiskRestoration diskRestoration) {
//        if(diskRestoration == null) {
//            log.warn("diskRestoration cannot be null!");
//            throw new RuntimeException("diskRestoration cannot be null!");
//        }
//
//        boolean flag = repository.save(diskRestoration);
//
//        if(flag) log.info("자산관리번호 {} 디스크복구자료가 등록되었습니다.", diskRestoration.getIdasset());
//        if(flag == false)
//            log.warn("자산관리번호 {} 디스크복구자료가 등록되지 않았습니다.", diskRestoration.getIdasset());
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllDiskRestorationDto importFromExcelService(List<DiskRestoration> list) {
//        if(list == null) {
//            log.warn("list cannot be null!");
//            throw new RuntimeException("list cannot be null!");
//        }
//        boolean flag = repository.insertData(list);
//
//        if(flag) log.info("디스크복구자료 {}개 항목이 추가/업데이트되었습니다.", list.size());
//        if(flag == false)
//            log.warn("디스크복구자료가 업데이트되지 않았습니다.");
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllDiskRestorationDto updateWhereIDService(DiskRestoration diskRestoration) {
//        if (diskRestoration == null) {
//            log.warn("diskRestoration cannot be null!");
//            throw new RuntimeException("diskRestoration cannot be null!");
//        }
//
//        boolean flag = repository.modifyWhereID(diskRestoration);
//        if(flag == false)
//            log.warn("디스크복구자료가 업데이트되지 않았습니다.");
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
