package com.cnp.pwsasset.return_form.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ReturnForm {
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
}
