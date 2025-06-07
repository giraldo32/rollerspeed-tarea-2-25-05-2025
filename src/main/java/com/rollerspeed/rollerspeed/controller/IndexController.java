package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Index;
import com.rollerspeed.rollerspeed.service.IndexService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/index")
public class IndexController {

    private final IndexService indexService;

    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping
    public ResponseEntity<List<Index>> listar() {
        return ResponseEntity.ok(indexService.listar());
    }

    @PostMapping
    public ResponseEntity<Index> crear(@RequestBody Index indexInfo) {
        Index creado = indexService.guardar(indexInfo);
        return new ResponseEntity<>(creado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Index> obtener(@PathVariable Long id) {
        return indexService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Index> actualizar(@PathVariable Long id, @RequestBody Index indexInfo) {
        if (!indexService.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        indexInfo.setId(id);
        Index actualizado = indexService.guardar(indexInfo);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!indexService.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        indexService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}