package com.cnp.pwsasset.handoverequipment.service;

import com.cnp.pwsasset.handoverequipment.dto.FindAllHandOverEquipmentDto;
import com.cnp.pwsasset.handoverequipment.dto.HandOverEquiqmentDto;
import com.cnp.pwsasset.handoverequipment.entity.HandOverEquiqment;
import com.cnp.pwsasset.handoverequipment.repository.HandOverEquipmentRepository;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class HandOverEquipmentService {
    private final HandOverEquipmentRepository repository;

    public FindAllHandOverEquipmentDto findAllService() {
        return new FindAllHandOverEquipmentDto(repository.findAll());
    }

    public HandOverEquiqmentDto findOneService(String num, String applicant_team, String applicant, Date applicant_date) {
        HandOverEquiqment handOverEquiqment = repository.findOne(num, applicant_team, applicant, applicant_date);
        log.info("findOne returns data - {}", handOverEquiqment);

        return handOverEquiqment != null ? new HandOverEquiqmentDto(handOverEquiqment) : null;
    }

    public FindAllHandOverEquipmentDto importFromExcelService(List<HandOverEquiqment> list) {
        if(list == null) {
            log.warn("list cannot be null!");
            throw new RuntimeException("list cannot be null!");
        }
        boolean flag = repository.insertData(list);

        if(flag) log.info("PWS 장비 인수/인계 확인서 장비정보 {}개 항목이 추가/업데이트되었습니다.", list.size());
        if(flag == false)
            log.warn("PWS 장비 인수/인계 확인서 장비정보가 업데이트되지 않았습니다.");

        return flag ? findAllService() : null;
    }

    public FindAllHandOverEquipmentDto updateService(HandOverEquiqment handOverEquiqment) {
        if (handOverEquiqment == null) {
            log.warn("handOverEquiqment cannot be null!");
            throw new RuntimeException("handOverEquiqment cannot be null!");
        }

        boolean flag = repository.modify(handOverEquiqment);
        if(flag == false)
            log.warn("PWS 장비 인수/인계 확인서 장비정보 자료가 업데이트되지 않았습니다.");
        return flag ? findAllService() : null;
    }

    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
        log.info("queryColumnCommentService returns data - {}", column_info);

        return column_info;
    }

    public FindAllHandOverEquipmentDto findWhereWriterInfoService(String applicant_team, String applicant, Date applicant_date) {
        log.info("/api/handoverequipment/eqlist/{}/{}/{} findWhereWriterInfoService Service request!", applicant_team, applicant, applicant_date);
        return new FindAllHandOverEquipmentDto(repository.findWhereApplicantInfo(applicant_team, applicant, applicant_date));
    }
}
