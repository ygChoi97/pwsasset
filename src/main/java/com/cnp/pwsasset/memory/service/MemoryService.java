package com.cnp.pwsasset.memory.service;

import com.cnp.pwsasset.diskrestoration.dto.DiskRestorationDto;
import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.memory.dto.FindAllMemoryDto;
import com.cnp.pwsasset.memory.dto.MemoryDto;
import com.cnp.pwsasset.memory.entity.Memory;
import com.cnp.pwsasset.memory.repository.MemoryRepository;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemoryService {
//    private final MemoryRepository repository;
//
//    public FindAllMemoryDto findAllService() {
//        return new FindAllMemoryDto((repository.findAll()));
//    }
//
//    public MemoryDto findOneWhereIDService(String id) {
//        Memory memory = repository.findOneWhereId(id);
//        log.info("findOneWhereIDService returns data - {}", memory);
//
//        return memory!=null ? new MemoryDto(memory) : null;
//    }
//
//    public FindAllMemoryDto createService(Memory memory) {
//        if(memory == null) {
//            log.warn("memory cannot be null!");
//            throw new RuntimeException("memory cannot be null!");
//        }
//
//        boolean flag = repository.save(memory);
//
//        if(flag) log.info("자산관리번호 {} 메모리자료가 등록되었습니다.", memory.getIdasset());
//        if(flag == false)
//            log.warn("자산관리번호 {} 메모리자료가 등록되지 않았습니다.", memory.getIdasset());
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllMemoryDto importFromExcelService(List<Memory> list) {
//        if(list == null) {
//            log.warn("list cannot be null!");
//            throw new RuntimeException("list cannot be null!");
//        }
//        boolean flag = repository.insertData(list);
//
//        if(flag) log.info("메모리자료 {}개 항목이 추가/업데이트되었습니다.", list.size());
//        if(flag == false)
//            log.warn("메모리자료가 업데이트되지 않았습니다.");
//
//        return flag ? findAllService() : null;
//    }
//
//    public FindAllMemoryDto updateWhereIDService(Memory memory) {
//        if (memory == null) {
//            log.warn("memory cannot be null!");
//            throw new RuntimeException("memory cannot be null!");
//        }
//
//        boolean flag = repository.modifyWhereID(memory);
//        if(flag == false)
//            log.warn("메모리자료가 업데이트되지 않았습니다.");
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
