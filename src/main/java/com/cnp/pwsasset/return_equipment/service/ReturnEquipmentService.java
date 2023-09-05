package com.cnp.pwsasset.return_equipment.service;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.return_equipment.dto.FindAllReturnEquipmentDto;
import com.cnp.pwsasset.return_equipment.dto.ReturnEquiqmentDto;
import com.cnp.pwsasset.return_equipment.entity.ReturnEquipment;
import com.cnp.pwsasset.return_equipment.repository.ReturnEquipmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReturnEquipmentService {
    private final ReturnEquipmentRepository repository;

    public FindAllReturnEquipmentDto findAllService() {
        return new FindAllReturnEquipmentDto(repository.findAll());
    }

    public ReturnEquiqmentDto findOneService(int id, String writer, String department, Date returndate) {
        ReturnEquipment returnEquipment = repository.findOne(id, writer, department, returndate);
        log.info("findOne returns data - {}", returnEquipment);

        return returnEquipment != null ? new ReturnEquiqmentDto(returnEquipment) : null;
    }

    public FindAllReturnEquipmentDto importFromExcelService(List<ReturnEquipment> list) {
        if(list == null) {
            log.warn("list cannot be null!");
            throw new RuntimeException("list cannot be null!");
        }
        boolean flag = repository.insertData(list);

        if(flag) log.info("반납 PWS 장비 인수/인계 확인서 장비정보 {}개 항목이 추가/업데이트되었습니다.", list.size());
        if(flag == false)
            log.warn("반납 PWS 장비 인수/인계 확인서 장비정보가 업데이트되지 않았습니다.");

        return flag ? findAllService() : null;
    }

    public FindAllReturnEquipmentDto updateService(ReturnEquipment returnEquipment) {
        if (returnEquipment == null) {
            log.warn("returnEquiqment cannot be null!");
            throw new RuntimeException("returnEquipment cannot be null!");
        }

        boolean flag = repository.modify(returnEquipment);
        if(flag == false)
            log.warn("반납 PWS 장비 인수/인계 확인서 장비정보 자료가 업데이트되지 않았습니다.");
        return flag ? findAllService() : null;
    }

    public List<ItemNameOfAssetDTO> queryColumnCommentService() {
        List<ItemNameOfAssetDTO> column_info = repository.queryColumnComment();
        log.info("queryColumnCommentService returns data - {}", column_info);

        return column_info;
    }

    public FindAllReturnEquipmentDto findWhereWriterInfoService(String writer, String department, Date returndate) {
        log.info("/api/return_equipment/eqlist/{}/{}/{} findWhereWriterInfoService Service request!", writer, department, returndate);
        return new FindAllReturnEquipmentDto(repository.findWhereWriterInfo(writer, department, returndate));
    }
}
