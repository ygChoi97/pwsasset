package com.cnp.pwsasset.handoverequipment.api;

import com.cnp.pwsasset.handoverequipment.dto.FindAllHandOverEquipmentDto;
import com.cnp.pwsasset.handoverequipment.dto.HandOverEquiqmentDto;
import com.cnp.pwsasset.handoverequipment.entity.HandOverEquiqment;
import com.cnp.pwsasset.handoverequipment.service.HandOverEquipmentService;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/handoverequipment")
@RequiredArgsConstructor
@CrossOrigin
public class HandOverEquipmentApiController {
    private final HandOverEquipmentService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/handoverequipment GET request!");

        FindAllHandOverEquipmentDto dtos = service.findAllService();
        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/equipment/{num}/{applicant_team}/{applicant}/{applicant_date}")
    public ResponseEntity<?> findHandOverEquipment(@PathVariable String num, @PathVariable String applicant_team, @PathVariable String applicant, @PathVariable Date applicant_date) {
        log.info("/api/handoverequipment/equipment/{}/{}/{}/{} GET request!", num, applicant_team, applicant, applicant_date);
        if(num == null || applicant_team == null || applicant == null || applicant_date == null) return ResponseEntity.badRequest().build();

        HandOverEquiqmentDto dto = service.findOneService(num, applicant_team, applicant, applicant_date);
        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/eqlist/{applicant_team}/{applicant}/{applicant_date1}")
    public ResponseEntity<?> findHandOverEquipmentWhereWriterInfo(@PathVariable String applicant_team, @PathVariable String applicant, @PathVariable String applicant_date1) {
        log.info("/api/handoverequipment/eqlist/{}/{}/{} GET request!", applicant_team, applicant, applicant_date1);
        if (applicant_team == null || applicant == null || applicant_date1 == null) return ResponseEntity.badRequest().build();
        Date applicant_date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            applicant_date = dateFormat.parse(applicant_date1);
        } catch (Exception e) {
            log.info(e.getMessage());
        }

        FindAllHandOverEquipmentDto dtos = service.findWhereWriterInfoService(applicant_team, applicant, applicant_date);
        if (dtos == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody List<HandOverEquiqment> list) {
        log.info("/api/handoverequipment/import POST request! {}", list);

        try {
            FindAllHandOverEquipmentDto dtos = service.importFromExcelService(list);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);
        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody HandOverEquiqment handOverEquiqment) {
        log.info("api/handoverequipment PUT request!\n{}", handOverEquiqment);

        try {
            FindAllHandOverEquipmentDto dtos = service.updateService(handOverEquiqment);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
    @GetMapping("/menu")
    public ResponseEntity<?> findHandOverEquipmentMenu() {
        log.info("/api/handoverequipment/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}
