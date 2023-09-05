package com.cnp.pwsasset.handoverequipment.dto;

import com.cnp.pwsasset.handoverequipment.entity.HandOverEquiqment;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllHandOverEquipmentDto {
    private int count;
    private List<HandOverEquiqmentDto> handOverEquiqmentDtos;

    public FindAllHandOverEquipmentDto(List<HandOverEquiqment> handOverEquiqmentList) {
        this.count = handOverEquiqmentList.size();
        this.convertDtoList(handOverEquiqmentList);
    }

    private void convertDtoList(List<HandOverEquiqment> handOverEquiqmentList) {
        List<HandOverEquiqmentDto> dtos = new ArrayList<>();

        for(HandOverEquiqment handOverEquiqment : handOverEquiqmentList) {
            dtos.add(new HandOverEquiqmentDto(handOverEquiqment));
        }
        this.handOverEquiqmentDtos = dtos;
    }
}
