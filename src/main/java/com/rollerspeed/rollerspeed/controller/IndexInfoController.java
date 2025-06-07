


package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Index;
import com.rollerspeed.rollerspeed.service.IndexService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/indexinfo")
public class IndexInfoController {

    private final IndexService indexInfoService;

    public IndexInfoController(IndexService indexInfoService) {
        this.indexInfoService = indexInfoService;
    }

    @GetMapping
    @Operation(summary = "Listar toda la información de la página principal")
    public List<Index> listar() {
        return indexInfoService.listar();
    }

    @PostMapping
    @Operation(summary = "Crear información para la página principal")
    public Index crear(@RequestBody Index indexInfo) {
        return indexInfoService.guardar(indexInfo);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener información de la página principal por ID")
    public Index obtener(@PathVariable Long id) {
        return indexInfoService.obtenerPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar información de la página principal por ID")
    public Index actualizar(@PathVariable Long id, @RequestBody Index indexInfo) {
        indexInfo.setId(id);
        return indexInfoService.guardar(indexInfo);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar información de la página principal por ID")
    public void eliminar(@PathVariable Long id) {
        indexInfoService.eliminar(id);
    }
}