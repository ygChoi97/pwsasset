package com.cnp.pwsasset.handover.dto;

import com.cnp.pwsasset.handover.entity.HandOver;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllHandOverDto {
    private int count;
    private List<HandOverDto> handOverDtos;

    public FindAllHandOverDto(List<HandOver> handOverList) {
        this.count = handOverList.size();
        this.convertDtoList(handOverList);
    }

    private void convertDtoList(List<HandOver> handOverList) {
        List<HandOverDto> dtos = new ArrayList<>();

        for(HandOver handOver : handOverList) {
            dtos.add(new HandOverDto(handOver));
        }
        this.handOverDtos = dtos;
    }
}
