package com.cnp.pwsasset.return_form.dto;

import com.cnp.pwsasset.return_form.entity.ReturnForm;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReturnFormDto {
    private String area;            // 지역
    private String department;      // 부서명
    private String writer;          // 작성자
    private String extension;       // 내선
    private String hp;              // HP
    private Date returndate;        // 반납일자
    private String id;              // 사번
    private String name;            // 성명
    private String sapapproval;     // SAP승인
    private int quantity;           // 수량

    public ReturnFormDto(ReturnForm returnForm) {
        area = returnForm.getArea();
        department = returnForm.getDepartment();
        writer = returnForm.getWriter();
        extension = returnForm.getExtension();
        hp = returnForm.getHp();
        returndate = returnForm.getReturndate();
        id = returnForm.getId();
        name = returnForm.getName();
        sapapproval = returnForm.getSapapproval();
        quantity = returnForm.getQuantity();
    }
}
