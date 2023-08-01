package com.cnp.pwsasset.memory.dto;

import com.cnp.pwsasset.memory.entity.Memory;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllMemoryDto {
    private int count;
    private List<MemoryDto> memoryDtos;

    public FindAllMemoryDto(List<Memory> memoryList) {
        this.count = memoryList.size();
        this.convertDtoList(memoryList);
    }

    private void convertDtoList(List<Memory> memoryList) {
        List<MemoryDto> dtos = new ArrayList<>();

        for(Memory memory : memoryList) {
            dtos.add(new MemoryDto(memory));
        }
        this.memoryDtos = dtos;
    }
}
