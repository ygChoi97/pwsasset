package com.cnp.pwsasset.return_form.repository;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.return_form.entity.ReturnForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReturnFormRepository {
    ReturnForm findOne(String writer, String department, String returndate);

    List<ReturnForm> findAll();

    boolean insertData(ReturnForm returnForm);

    boolean modify(ReturnForm returnForm);

    List<ItemNameOfAssetDTO> queryColumnComment();
}
