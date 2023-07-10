package com.cnp.pwsasset.videoeq.dto;

import com.cnp.pwsasset.videoeq.entity.VideoEquipment;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllVideoEquipmentDto {
    private int count;
    private List<VideoEquipmentDto> videoEquiqmentDtos;

    public FindAllVideoEquipmentDto(List<VideoEquipment> videoEquipmentList) {
        this.count = videoEquipmentList.size();
        this.convertDtoList(videoEquipmentList);
    }

    private void convertDtoList(List<VideoEquipment> videoEquipmentList) {
        List<VideoEquipmentDto> dtos = new ArrayList<>();

        for(VideoEquipment videoEquipment : videoEquipmentList) {
            dtos.add(new VideoEquipmentDto(videoEquipment));
        }
        this.videoEquiqmentDtos = dtos;
    }
}
