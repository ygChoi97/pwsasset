package com.cnp.pwsasset.handover.api;

import com.cnp.pwsasset.handover.dto.FindAllHandOverDto;
import com.cnp.pwsasset.handover.dto.HandOverDto;
import com.cnp.pwsasset.handover.entity.HandOver;
import com.cnp.pwsasset.handover.service.HandOverService;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/handover")
@RequiredArgsConstructor
@CrossOrigin
public class HandOverApiController {
    private final HandOverService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/handover GET request!");

        FindAllHandOverDto dtos = service.findAllService();
        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/applicantinfo/{applicant_team}/{applicant}/{applicant_date}")
    public ResponseEntity<?> findHandOver(@PathVariable String applicant_team, @PathVariable String applicant, @PathVariable String applicant_date) {
        log.info("/api/handover/applicantinfo/{}/{}/{} GET request!", applicant_team, applicant, applicant_date);
        if(applicant_team == null || applicant == null || applicant_date == null) return ResponseEntity.badRequest().build();

        HandOverDto dto = service.findOneService(applicant_team, applicant, applicant_date);
        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody HandOver handOver) {
        log.info("/api/handover/import POST {} request!", handOver);

        try {

            FindAllHandOverDto dtos = service.importFromExcelService(handOver);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);
        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateWhereID(@RequestBody HandOver handOver) {
        log.info("api/handover PUT request!\n{}", handOver);

        try {
            FindAllHandOverDto dtos = service.updateService(handOver);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
    @GetMapping("/menu")
    public ResponseEntity<?> findHandOverMenu() {
        log.info("/api/handover/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}
