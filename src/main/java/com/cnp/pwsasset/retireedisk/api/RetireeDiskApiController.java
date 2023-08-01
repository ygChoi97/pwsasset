package com.cnp.pwsasset.retireedisk.api;

import com.cnp.pwsasset.retireedisk.dto.RetireeDiskDto;
import com.cnp.pwsasset.retireedisk.dto.FindAllRetireeDiskDto;
import com.cnp.pwsasset.retireedisk.entity.RetireeDisk;
import com.cnp.pwsasset.retireedisk.service.RetireeDiskService;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/retireedisk")
@RequiredArgsConstructor
@CrossOrigin
public class RetireeDiskApiController {
    private final RetireeDiskService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/retireedisk GET request!");

        FindAllRetireeDiskDto dtos = service.findAllService();
        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/retiree_id/{retiree_id}")
    public ResponseEntity<?> findRetireeDiskWhereRetiree_id(@PathVariable String retiree_id) {
        log.info("/api/retireedisk/retiree_id/{} GET request!", retiree_id);
        if(retiree_id == null) return ResponseEntity.badRequest().build();

        RetireeDiskDto dto = service.findOneWhereRetireeIdService(retiree_id);

        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RetireeDisk retireeDisk) {
        log.info("/api/retireedisk/{} POST request!", retireeDisk);

        try {
            FindAllRetireeDiskDto dtos = service.createService(retireeDisk);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);

        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody List<RetireeDisk> list ) {
        log.info("/api/retireedisk/import POST request!");

        try {
            FindAllRetireeDiskDto dtos = service.importFromExcelService(list);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);

        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateWhereID(@RequestBody RetireeDisk retireeDisk) {
        log.info("api/retireedisk PUT request!\n{}", retireeDisk);

        try {
            FindAllRetireeDiskDto dtos = service.updateWhereIDService(retireeDisk);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/menu")
    public ResponseEntity<?> findRetireeDiskMenu() {
        log.info("/api/retireedisk/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}
