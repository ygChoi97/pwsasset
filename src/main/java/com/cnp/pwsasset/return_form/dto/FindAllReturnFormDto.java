package com.cnp.pwsasset.return_form.dto;

import com.cnp.pwsasset.return_form.entity.ReturnForm;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllReturnFormDto {
    private int count;
    private List<ReturnFormDto> returnFormDtos;

    public FindAllReturnFormDto(List<ReturnForm> returnFormList) {
        this.count = returnFormList.size();
        this.convertDtoList(returnFormList);
    }

    private void convertDtoList(List<ReturnForm> returnFormList) {
        List<ReturnFormDto> dtos = new ArrayList<>();

        for(ReturnForm returnForm : returnFormList) {
            dtos.add(new ReturnFormDto(returnForm));
        }
        this.returnFormDtos = dtos;
    }
}
