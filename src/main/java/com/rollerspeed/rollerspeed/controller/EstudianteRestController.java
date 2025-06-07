package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Estudiante;
import com.rollerspeed.rollerspeed.service.EstudianteService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteRestController {

    private final EstudianteService estudianteService;

    public EstudianteRestController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping
    @Operation(summary = "Listar todos los estudiantes")
    public List<Estudiante> listarEstudiantes() {
        return estudianteService.listarEstudiantes();
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo estudiante")
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.guardarEstudiante(estudiante);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener estudiante por ID")
    public Estudiante obtenerEstudiante(@PathVariable Long id) {
        return estudianteService.obtenerEstudiantePorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar estudiante por ID")
    public Estudiante actualizarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        estudiante.setId(id);
        return estudianteService.guardarEstudiante(estudiante);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar estudiante por ID")
    public void eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminarEstudiante(id);
    }
}