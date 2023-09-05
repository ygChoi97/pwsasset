package com.cnp.pwsasset.handover.service;

import com.cnp.pwsasset.handover.dto.FindAllHandOverDto;
import com.cnp.pwsasset.handover.dto.HandOverDto;
import com.cnp.pwsasset.handover.entity.HandOver;
import com.cnp.pwsasset.handover.repository.HandOverRepository;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class HandOverService {
    private final HandOverRepository repository;

    public FindAllHandOverDto findAllService() {
        return new FindAllHandOverDto(repository.findAll());
    }

    public HandOverDto findOneService(String applicant_team, String applicant, String applicant_date) {
        HandOver handOver = repository.findOne(applicant_team, applicant, applicant_date);
        log.info("findOne returns data - {}", handOver);

        return handOver != null ? new HandOverDto(handOver) : null;
    }

    public FindAllHandOverDto importFromExcelService(HandOver handOver) {
        if(handOver == null) {
            log.warn("list cannot be null!");
            throw new RuntimeException("list cannot be null!");
        }
        boolean flag = repository.insertData(handOver);

        if(flag) log.info("PWS 장비 인수/인계 확인서 작성자 자료 {} 항목이 추가/업데이트되었습니다.", handOver);
        if(flag == false)
            log.warn("PWS 장비 인수/인계 확인서 작성자 자료가 업데이트되지 않았습니다.");

        return flag ? findAllService() : null;
    }

    public FindAllHandOverDto updateService(HandOver handOver) {
        if (handOver == null) {
            log.warn("handOver cannot be null!");
            throw new RuntimeException("handOver cannot be null!");
        }

        boolean flag = repository.modify(handOver);
        if(flag == false)
            log.warn("PWS 장비 인수/인계 확인서 작성자 자료가 업데이트되지 않았습니다.");
        return flag ? findAllService() : null;
    }

    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
        log.info("queryColumnCommentService returns data - {}", column_info);

        return column_info;
    }
}
