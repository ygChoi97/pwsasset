package com.cnp.pwsasset.videoeq.api;

import com.cnp.pwsasset.videoeq.dto.VideoEquipmentDto;
import com.cnp.pwsasset.videoeq.dto.FindAllVideoEquipmentDto;
import com.cnp.pwsasset.videoeq.entity.VideoEquipment;
import com.cnp.pwsasset.videoeq.service.VideoEquipmentService;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/videoequipment")
@RequiredArgsConstructor
@CrossOrigin
public class VideoEquipmentApiController {
//    private final VideoEquipmentService service;
//
//    @GetMapping
//    public ResponseEntity<?> findAll() {
//        log.info("/api/videoequipment GET request!");
//
//        FindAllVideoEquipmentDto dtos = service.findAllService();
//        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();
//
//        return ResponseEntity.ok().body(dtos);
//    }
//
//    @GetMapping
//    public ResponseEntity<?> findVideoEquipmentWhereId(@PathVariable String id) {
//        log.info("/api/videoequipment/id/{} GET request!", id);
//        if(id == null) return ResponseEntity.badRequest().build();
//
//        VideoEquipmentDto dto = service.findOneWhereIDService(id);
//
//        if(dto == null) return ResponseEntity.notFound().build();
//
//        return ResponseEntity.ok().body(dto);
//    }
//
//    @PostMapping
//    public ResponseEntity<?> create(@RequestBody VideoEquipment videoEquipment) {
//        log.info("/api/videoequipment/{} POST request!", videoEquipment);
//
//        try {
//            FindAllVideoEquipmentDto dtos = service.createService(videoEquipment);
//
//            if (dtos == null)
//                return ResponseEntity.notFound().build();
//
//            return ResponseEntity.ok().body(dtos);
//
//        } catch(RuntimeException e) {
//            return ResponseEntity.badRequest().body(e);
//        }
//    }
//
//    @PostMapping("/import")
//    public ResponseEntity<?> updateDB(@RequestBody List<VideoEquipment> list ) {
//        log.info("/api/videoequipment/import POST request!");
//
//        try {
//            FindAllVideoEquipmentDto dtos = service.importFromExcelService(list);
//
//            if (dtos == null)
//                return ResponseEntity.notFound().build();
//
//            return ResponseEntity.ok().body(dtos);
//
//        } catch(RuntimeException e) {
//            return ResponseEntity.badRequest().body(e);
//        }
//    }
//
//    @PutMapping
//    public ResponseEntity<?> updateWhereID(@RequestBody VideoEquipment videoEquipment) {
//        log.info("api/videoequipment PUT request!\n{}", videoEquipment);
//
//        try {
//            FindAllVideoEquipmentDto dtos = service.updateWhereIDService(videoEquipment);
//            return ResponseEntity.ok().body(dtos);
//        }catch (RuntimeException e) {
//            return ResponseEntity.badRequest().body(e);
//        }
//    }
//
//    @GetMapping("/menu")
//    public ResponseEntity<?> findVideoEquipmentMenu() {
//        log.info("/api/videoequipment/menu GET request!");
//
//        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();
//
//        if(column_info == null) ResponseEntity.notFound().build();
//
//        return ResponseEntity.ok().body(column_info);
//    }
}
