package com.cnp.pwsasset.return_form.api;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.return_form.dto.FindAllReturnFormDto;
import com.cnp.pwsasset.return_form.dto.ReturnFormDto;
import com.cnp.pwsasset.return_form.entity.ReturnForm;
import com.cnp.pwsasset.return_form.service.ReturnFormService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/return_form")
@RequiredArgsConstructor
@CrossOrigin
public class ReturnFormApiController {
    private final ReturnFormService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/handover GET request!");

        FindAllReturnFormDto dtos = service.findAllService();
        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/writerinfo/{writer}/{department}/{returndate}")
    public ResponseEntity<?> findReturnForm(@PathVariable String writer, @PathVariable String department, @PathVariable String returndate) {
        log.info("/api/return_form/writerinfo/{}/{}/{} GET request!", writer, department, returndate);
        if(writer == null || department == null || returndate == null) return ResponseEntity.badRequest().build();

        ReturnFormDto dto = service.findOneService(writer, department, returndate);
        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody ReturnForm returnForm) {
        log.info("/api/return_form/import POST {} request!", returnForm);

        try {

            FindAllReturnFormDto dtos = service.importFromExcelService(returnForm);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);
        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateWhereID(@RequestBody ReturnForm retunForm) {
        log.info("api/return_form PUT request!\n{}", retunForm);

        try {
            FindAllReturnFormDto dtos = service.updateService(retunForm);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
    @GetMapping("/menu")
    public ResponseEntity<?> findReturnFormMenu() {
        log.info("/api/return_form/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}
