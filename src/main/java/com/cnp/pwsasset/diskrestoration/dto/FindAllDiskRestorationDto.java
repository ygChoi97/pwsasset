package com.cnp.pwsasset.diskrestoration.dto;

import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.memory.dto.FindAllMemoryDto;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllDiskRestorationDto {
    private int count;
    private List<DiskRestorationDto> diskRestorationDtos;

    public FindAllDiskRestorationDto(List<DiskRestoration> diskRestorationList) {
        this.count = diskRestorationList.size();
        this.convertDtoList(diskRestorationList);
    }

    private void convertDtoList(List<DiskRestoration> diskRestorationList) {
        List<DiskRestorationDto> dtos = new ArrayList<>();

        for(DiskRestoration diskRestoration : diskRestorationList) {
            dtos.add(new DiskRestorationDto(diskRestoration));
        }
        this.diskRestorationDtos = dtos;
    }
}
