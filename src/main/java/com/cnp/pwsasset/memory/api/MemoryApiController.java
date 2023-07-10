package com.cnp.pwsasset.memory.api;

import com.cnp.pwsasset.memory.dto.MemoryDto;
import com.cnp.pwsasset.memory.dto.FindAllMemoryDto;
import com.cnp.pwsasset.memory.entity.Memory;
import com.cnp.pwsasset.memory.service.MemoryService;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/memory")
@RequiredArgsConstructor
@CrossOrigin
public class MemoryApiController {
//    private final MemoryService service;
//
//    @GetMapping
//    public ResponseEntity<?> findAll() {
//        log.info("/api/memory GET request!");
//
//        FindAllMemoryDto dtos = service.findAllService();
//        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();
//
//        return ResponseEntity.ok().body(dtos);
//    }
//
//    @GetMapping
//    public ResponseEntity<?> findMemoryWhereId(@PathVariable String id) {
//        log.info("/api/memory/id/{} GET request!", id);
//        if(id == null) return ResponseEntity.badRequest().build();
//
//        MemoryDto dto = service.findOneWhereIDService(id);
//
//        if(dto == null) return ResponseEntity.notFound().build();
//
//        return ResponseEntity.ok().body(dto);
//    }
//
//    @PostMapping
//    public ResponseEntity<?> create(@RequestBody Memory memory) {
//        log.info("/api/memory/{} POST request!", memory);
//
//        try {
//            FindAllMemoryDto dtos = service.createService(memory);
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
//    public ResponseEntity<?> updateDB(@RequestBody List<Memory> list ) {
//        log.info("/api/memory/import POST request!");
//
//        try {
//            FindAllMemoryDto dtos = service.importFromExcelService(list);
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
//    public ResponseEntity<?> updateWhereID(@RequestBody Memory memory) {
//        log.info("api/memory PUT request!\n{}", memory);
//
//        try {
//            FindAllMemoryDto dtos = service.updateWhereIDService(memory);
//            return ResponseEntity.ok().body(dtos);
//        }catch (RuntimeException e) {
//            return ResponseEntity.badRequest().body(e);
//        }
//    }
//
//    @GetMapping("/menu")
//    public ResponseEntity<?> findMemoryMenu() {
//        log.info("/api/memory/menu GET request!");
//
//        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();
//
//        if(column_info == null) ResponseEntity.notFound().build();
//
//        return ResponseEntity.ok().body(column_info);
//    }
}
