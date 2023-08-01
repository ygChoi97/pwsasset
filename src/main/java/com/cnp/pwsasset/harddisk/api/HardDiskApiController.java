package com.cnp.pwsasset.harddisk.api;

import com.cnp.pwsasset.harddisk.dto.FindAllHardDiskDto;
import com.cnp.pwsasset.harddisk.dto.HardDiskDto;
import com.cnp.pwsasset.harddisk.entity.HardDisk;
import com.cnp.pwsasset.harddisk.service.HardDiskService;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/harddisk")
@RequiredArgsConstructor
@CrossOrigin
public class HardDiskApiController {
    private final HardDiskService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/harddisk GET request!");

        FindAllHardDiskDto dtos = service.findAllService();
        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> findDiskRestorationWhereId(@PathVariable String id) {
        log.info("/api/harddisk/id/{} GET request!", id);
        if(id == null) return ResponseEntity.badRequest().build();

        HardDiskDto dto = service.findOneWhereIDService(id);

        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody HardDisk hardDisk) {
        log.info("/api/harddisk/{} POST request!", hardDisk);

        try {
            FindAllHardDiskDto dtos = service.createService(hardDisk);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);

        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody List<HardDisk> list ) {
        log.info("/api/harddisk/import POST request!");

        try {
            FindAllHardDiskDto dtos = service.importFromExcelService(list);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);

        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateWhereID(@RequestBody HardDisk hardDisk) {
        log.info("api/harddisk PUT request!\n{}", hardDisk);

        try {
            FindAllHardDiskDto dtos = service.updateWhereIDService(hardDisk);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/menu")
    public ResponseEntity<?> findDiskRestorationMenu() {
        log.info("/api/harddisk/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}
