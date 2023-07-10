package com.cnp.pwsasset.pwsprovision.service;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.pwsprovision.dto.FindAllPwsProvisionDto;
import com.cnp.pwsasset.pwsprovision.dto.PwsProvisionDto;
import com.cnp.pwsasset.pwsprovision.entity.PwsProvision;
import com.cnp.pwsasset.pwsprovision.repository.PwsProvisionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PwsProvisionService {

    private final PwsProvisionRepository repository;

    public FindAllPwsProvisionDto findAllService() {
        return new FindAllPwsProvisionDto(repository.findAll());
    }

    public FindAllPwsProvisionDto importFromExcelService(List<PwsProvision> list) {
        if(list == null) {
            log.warn("list cannot be null!");
            throw new RuntimeException("list cannot be null!");
        }
        boolean flag = repository.insertData(list);

        if(flag) log.info("지급 {}개 항목이 추가/업데이트되었습니다.", list.size());
        if(!flag)
            log.warn("지급이 업데이트되지 않았습니다.");

        return flag ? findAllService() : null;
    }

    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
        log.info("queryColumnCommentService returns data - {}", column_info);

        return column_info;
    }

    public PwsProvisionDto findOneWhereIdService(String id) {
        PwsProvision provision = repository.findOneWhereId(id);
        log.info("findOneWhereIdService returns data - {}", provision);

        return provision!=null ? new PwsProvisionDto(provision) : null;
    }

    public FindAllPwsProvisionDto updateWhereIDService(PwsProvision provision) {
        if (provision == null) {
            log.warn("provision cannot be null!");
            throw new RuntimeException("provision cannot be null!");
        }

        boolean flag = repository.modifyWhereID(provision);
        if(flag == false)
            log.warn("자산이 업데이트되지 않았습니다.");
        return flag ? findAllService() : null;
    }
}
