package com.cnp.pwsasset.retireedisk.dto;

import com.cnp.pwsasset.retireedisk.entity.RetireeDisk;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllRetireeDiskDto {
    private int count;
    private List<RetireeDiskDto> retireeDiskDtos;

    public FindAllRetireeDiskDto(List<RetireeDisk> retireeDiskList) {
        this.count = retireeDiskList.size();
        this.convertDtoList(retireeDiskList);
    }

    private void convertDtoList(List<RetireeDisk> retireeDiskList) {
        List<RetireeDiskDto> dtos = new ArrayList<>();

        for(RetireeDisk retireeDisk : retireeDiskList) {
            dtos.add(new RetireeDiskDto(retireeDisk));
        }
        this.retireeDiskDtos = dtos;
    }
}
