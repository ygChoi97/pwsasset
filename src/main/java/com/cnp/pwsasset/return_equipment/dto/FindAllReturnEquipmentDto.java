package com.cnp.pwsasset.return_equipment.dto;

import com.cnp.pwsasset.return_equipment.entity.ReturnEquipment;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllReturnEquipmentDto {
    private int count;
    private List<ReturnEquiqmentDto> returnEquiqmentDtos;

    public FindAllReturnEquipmentDto(List<ReturnEquipment> returnEquipmentList) {
        this.count = returnEquipmentList.size();
        this.convertDtoList(returnEquipmentList);
    }

    private void convertDtoList(List<ReturnEquipment> returnEquipmentList) {
        List<ReturnEquiqmentDto> dtos = new ArrayList<>();

        for(ReturnEquipment returnEquipment : returnEquipmentList) {
            dtos.add(new ReturnEquiqmentDto(returnEquipment));
        }
        this.returnEquiqmentDtos = dtos;
    }
}
