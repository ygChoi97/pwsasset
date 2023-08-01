package com.cnp.pwsasset.diskrestoration.api;

import com.cnp.pwsasset.diskrestoration.dto.DiskRestorationDto;
import com.cnp.pwsasset.diskrestoration.dto.FindAllDiskRestorationDto;
import com.cnp.pwsasset.diskrestoration.entity.DiskRestoration;
import com.cnp.pwsasset.diskrestoration.service.DiskRestorationService;
import com.cnp.pwsasset.pws.dto.ItemNameOfAssetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/diskrestoration")
@RequiredArgsConstructor
@CrossOrigin
public class DiskRestorationApiController {
    private final DiskRestorationService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        log.info("/api/diskrestoration GET request!");

        FindAllDiskRestorationDto dtos = service.findAllService();
        if(dtos.getCount() < 1) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> findDiskRestorationWhereId(@PathVariable String id) {
        log.info("/api/diskrestoration/id/{} GET request!", id);
        if(id == null) return ResponseEntity.badRequest().build();

        DiskRestorationDto dto = service.findOneWhereIDService(id);

        if(dto == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody DiskRestoration diskRestoration) {
        log.info("/api/diskrestoration/{} POST request!", diskRestoration);

        try {
            FindAllDiskRestorationDto dtos = service.createService(diskRestoration);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);

        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PostMapping("/import")
    public ResponseEntity<?> updateDB(@RequestBody List<DiskRestoration> list ) {
        log.info("/api/diskrestoration/import POST request!");

        try {
            FindAllDiskRestorationDto dtos = service.importFromExcelService(list);

            if (dtos == null)
                return ResponseEntity.notFound().build();

            return ResponseEntity.ok().body(dtos);

        } catch(RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateWhereID(@RequestBody DiskRestoration diskRestoration) {
        log.info("api/diskrestoration PUT request!\n{}", diskRestoration);

        try {
            FindAllDiskRestorationDto dtos = service.updateWhereIDService(diskRestoration);
            return ResponseEntity.ok().body(dtos);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/menu")
    public ResponseEntity<?> findDiskRestorationMenu() {
        log.info("/api/diskrestoration/menu GET request!");

        List<ItemNameOfAssetDTO> column_info = service.queryColumnCommentService();

        if(column_info == null) ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(column_info);
    }
}
