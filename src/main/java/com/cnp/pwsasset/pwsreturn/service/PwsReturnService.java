package com.cnp.pwsasset.pwsreturn.service;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.pwsprovision.dto.PwsProvisionDto;
import com.cnp.pwsasset.pwsprovision.entity.PwsProvision;
import com.cnp.pwsasset.pwsreturn.dto.FindAllPwsReturnDto;
import com.cnp.pwsasset.pwsreturn.dto.PwsReturnDto;
import com.cnp.pwsasset.pwsreturn.entity.PwsReturn;
import com.cnp.pwsasset.pwsreturn.repository.PwsReturnRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PwsReturnService {
    private final PwsReturnRepository repository;
    public FindAllPwsReturnDto findAllService() {
        return new FindAllPwsReturnDto(repository.findAll());
    }

    public FindAllPwsReturnDto importFromExcelService(List<PwsReturn> list) {
        if(list == null) {
            log.warn("list cannot be null!");
            throw new RuntimeException("list cannot be null!");
        }
        boolean flag = repository.insertData(list);

        if(flag) log.info("반납 {}개 항목이 추가/업데이트되었습니다.", list.size());
        if(!flag)
            log.warn("반납이 업데이트되지 않았습니다.");

        return flag ? findAllService() : null;
    }

    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
        log.info("queryColumnCommentService returns data - {}", column_info);

        return column_info;
    }

    public PwsReturnDto findOneServiceWhereId(String id) {
        PwsReturn pwsReturn = repository.findOneWhereId(id);
        log.info("findOneServiceWhereId returns data - {}", pwsReturn);

        return pwsReturn!=null ? new PwsReturnDto(pwsReturn) : null;
    }

    public FindAllPwsReturnDto updateServiceWhereID(PwsReturn pwsReturn) {
        if (pwsReturn == null) {
            log.warn("pwsReturn cannot be null!");
            throw new RuntimeException("pwsReturn cannot be null!");
        }

        boolean flag = repository.modifyWhereID(pwsReturn);
        if(flag == false)
            log.warn("자산이 업데이트되지 않았습니다.");
        return flag ? findAllService() : null;
    }
}
