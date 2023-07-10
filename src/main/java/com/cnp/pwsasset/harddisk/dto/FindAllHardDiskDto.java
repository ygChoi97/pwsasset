package com.cnp.pwsasset.harddisk.dto;

import com.cnp.pwsasset.harddisk.entity.HardDisk;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllHardDiskDto {
    private int count;
    private List<HardDiskDto> hardDiskDtos;

    public FindAllHardDiskDto(List<HardDisk> hardDiskList) {
        this.count = hardDiskList.size();
        this.convertDtoList(hardDiskList);
    }

    private void convertDtoList(List<HardDisk> hardDiskList) {
        List<HardDiskDto> dtos = new ArrayList<>();

        for(HardDisk hardDisk : hardDiskList) {
            dtos.add(new HardDiskDto(hardDisk));
        }
        this.hardDiskDtos = dtos;
    }


}
