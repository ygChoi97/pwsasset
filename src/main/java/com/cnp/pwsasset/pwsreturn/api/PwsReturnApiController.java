package com.cnp.pwsasset.pwsreturn.api;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.pwsprovision.dto.FindAllPwsProvisionDto;
import com.cnp.pwsasset.pwsprovision.dto.PwsProvisionDto;
import com.cnp.pwsasset.pwsprovision.entity.PwsProvision;
import com.cnp.pwsasset.pwsreturn.dto.FindAllPwsReturnDto;
import com.cnp.pwsasset.pwsreturn.dto.PwsReturnDto;
import com.cnp.pwsasset.pwsreturn.entity.PwsReturn;
import com.cnp.pwsasset.pwsreturn.service.PwsReturnService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/return")
@RequiredArgsConstructor
@CrossOrigin
public class PwsReturnApiController {
    private final PwsReturnService service;

    /**
     * @return
     */
    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/return GET request!");

        FindAllPwsReturnDto dtos = service.findAllService();
        if (dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> findPwsReturnWhereId(@PathVariable String id) {
        log.info("/api/return/id/{} GET request!", id);
        if(id == null) return ResponseEntity.badRequest().build();

        PwsReturnDto dto = service.findOneServiceWhereId(id);

        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @PutMapping
    public ResponseEntity<?> updateWhereID(@RequestBody PwsReturn pwsReturn) {
        log.info("api/return PUT request!\n{}", pwsReturn);

        try {
            FindAllPwsReturnDto dtos = service.updateServiceWhereID(pwsReturn);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody List<PwsReturn> list) {
        log.info("/api/return/import POST request!");

        try {
            FindAllPwsReturnDto dtos = service.importFromExcelService(list);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);

        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/menu")
    public ResponseEntity<?> findPwsReturnMenu() {
        log.info("/api/return/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}