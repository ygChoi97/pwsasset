package com.cnp.pwsasset.return_equipment.api;

import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import com.cnp.pwsasset.return_equipment.dto.FindAllReturnEquipmentDto;
import com.cnp.pwsasset.return_equipment.dto.ReturnEquiqmentDto;
import com.cnp.pwsasset.return_equipment.entity.ReturnEquipment;
import com.cnp.pwsasset.return_equipment.service.ReturnEquipmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/return_equipment")
@RequiredArgsConstructor
@CrossOrigin
public class ReturnEquipmentApiController {
    private final ReturnEquipmentService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/return_equipment GET request!");

        FindAllReturnEquipmentDto dtos = service.findAllService();
        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/equipment/{id}/{writer}/{department}/{returndate}")
    public ResponseEntity<?> findHandOverEquipment(@PathVariable int id, @PathVariable String writer, @PathVariable String department, @PathVariable Date returndate) {
        log.info("/api/return_equipment/equipment/{}/{}/{}/{} GET request!", id, writer, department, returndate);
        if(id == 0 || writer == null || department == null || returndate == null) return ResponseEntity.badRequest().build();

        ReturnEquiqmentDto dto = service.findOneService(id, writer, department, returndate);
        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/eqlist/{writer}/{department}/{returndate1}")
    public ResponseEntity<?> findHandOverEquipmentWhereWriterInfo(@PathVariable String writer, @PathVariable String department, @PathVariable String returndate1) {
        log.info("/api/return_equipment/eqlist/{}/{}/{} GET request!", writer, department, returndate1);
        if (writer == null || department == null || returndate1 == null) return ResponseEntity.badRequest().build();
        Date returndate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            returndate = dateFormat.parse(returndate1);
        } catch (Exception e) {
            log.info(e.getMessage());
        }

        FindAllReturnEquipmentDto dtos = service.findWhereWriterInfoService(writer, department, returndate);
        if (dtos == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody List<ReturnEquipment> list) {
        log.info("/api/return_equipment/import POST request!");

        try {
            FindAllReturnEquipmentDto dtos = service.importFromExcelService(list);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);
        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ReturnEquipment returnEquipment) {
        log.info("api/return_equipment PUT request!\n{}", returnEquipment);

        try {
            FindAllReturnEquipmentDto dtos = service.updateService(returnEquipment);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
    @GetMapping("/menu")
    public ResponseEntity<?> findReturnEquipmentMenu() {
        log.info("/api/return_equipment/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}
