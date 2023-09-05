package com.cnp.pwsasset.return_form.service;

import com.cnp.pwsasset.handover.dto.FindAllHandOverDto;
import com.cnp.pwsasset.handover.dto.HandOverDto;
import com.cnp.pwsasset.handover.entity.HandOver;
import com.cnp.pwsasset.handover.repository.HandOverRepository;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.return_form.dto.FindAllReturnFormDto;
import com.cnp.pwsasset.return_form.dto.ReturnFormDto;
import com.cnp.pwsasset.return_form.entity.ReturnForm;
import com.cnp.pwsasset.return_form.repository.ReturnFormRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReturnFormService {
    private final ReturnFormRepository repository;

    public FindAllReturnFormDto findAllService() {
        return new FindAllReturnFormDto(repository.findAll());
    }

    public ReturnFormDto findOneService(String writer, String department, String returndate) {
        ReturnForm returnForm = repository.findOne(writer, department, returndate);
        log.info("findOne returns data - {}", returnForm);

        return returnForm != null ? new ReturnFormDto(returnForm) : null;
    }

    public FindAllReturnFormDto importFromExcelService(ReturnForm returnForm) {
        if(returnForm == null) {
            log.warn("list cannot be null!");
            throw new RuntimeException("list cannot be null!");
        }
        boolean flag = repository.insertData(returnForm);

        if(flag) log.info("반납 PWS 장비 인수/인계 확인서 작성자 자료 {} 항목이 추가/업데이트되었습니다.", returnForm);
        if(flag == false)
            log.warn("반납 PWS 장비 인수/인계 확인서 작성자 자료가 업데이트되지 않았습니다.");

        return flag ? findAllService() : null;
    }

    public FindAllReturnFormDto updateService(ReturnForm returnForm) {
        if (returnForm == null) {
            log.warn("returnForm cannot be null!");
            throw new RuntimeException("returnForm cannot be null!");
        }

        boolean flag = repository.modify(returnForm);
        if(flag == false)
            log.warn("반납 PWS 장비 인수/인계 확인서 작성자 자료가 업데이트되지 않았습니다.");
        return flag ? findAllService() : null;
    }

    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
        log.info("queryColumnCommentService returns data - {}", column_info);

        return column_info;
    }
}
