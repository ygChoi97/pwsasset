package com.cnp.pwsasset.retireedisk.service;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.retireedisk.dto.FindAllRetireeDiskDto;
import com.cnp.pwsasset.retireedisk.dto.RetireeDiskDto;
import com.cnp.pwsasset.retireedisk.entity.RetireeDisk;
import com.cnp.pwsasset.retireedisk.repository.RetireeDiskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RetireeDiskService {

    private final RetireeDiskRepository repository;
    public FindAllRetireeDiskDto findAllService() {
        return new FindAllRetireeDiskDto(repository.findAll());
    }

    public RetireeDiskDto findOneWhereRetireeIdService(String retiree_id) {
        RetireeDisk retireeDisk = repository.findOneWhereRetireeId(retiree_id);
        log.info("findOneWhereIDService returns data - {}", retireeDisk);

        return retireeDisk!=null ? new RetireeDiskDto(retireeDisk) : null;
    }

    public FindAllRetireeDiskDto createService(RetireeDisk retireeDisk) {
        if(retireeDisk == null) {
            log.warn("retireeDisk cannot be null!");
            throw new RuntimeException("retireeDisk cannot be null!");
        }

        boolean flag = repository.save(retireeDisk);

        if(flag) log.info("자산관리번호 {} 퇴직자디스크자료가 등록되었습니다.", retireeDisk.getIdasset());
        if(flag == false)
            log.warn("자산관리번호 {} 퇴직자디스크자료가 등록되지 않았습니다.", retireeDisk.getIdasset());

        return flag ? findAllService() : null;
    }

    public FindAllRetireeDiskDto importFromExcelService(List<RetireeDisk> list) {
        if(list == null) {
            log.warn("list cannot be null!");
            throw new RuntimeException("list cannot be null!");
        }
        boolean flag = repository.insertData(list);

        if(flag) log.info("퇴직자디스크자료 {}개 항목이 추가/업데이트되었습니다.", list.size());
        if(flag == false)
            log.warn("퇴직자디스크자료가 업데이트되지 않았습니다.");

        return flag ? findAllService() : null;
    }

    public FindAllRetireeDiskDto updateWhereIDService(RetireeDisk retireeDisk) {
        if (retireeDisk == null) {
            log.warn("retireeDisk cannot be null!");
            throw new RuntimeException("diskRestoration cannot be null!");
        }

        boolean flag = repository.modifyWhereID(retireeDisk);
        if(flag == false)
            log.warn("퇴직자디스크자료가 업데이트되지 않았습니다.");
        return flag ? findAllService() : null;
    }

    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
        log.info("queryColumnCommentService returns data - {}", column_info);

        return column_info;
    }
}
