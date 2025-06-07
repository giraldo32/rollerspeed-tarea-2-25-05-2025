package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Instructor;
import com.rollerspeed.rollerspeed.service.InstructorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructores")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    @Operation(summary = "Listar todos los instructores")
    public List<Instructor> listarInstructores() {
        return instructorService.listarInstructores();
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo instructor")
    public Instructor crearInstructor(@RequestBody Instructor instructor) {
        return instructorService.guardarInstructor(instructor);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener instructor por ID")
    public Instructor obtenerPorId(@PathVariable Long id) {
        return instructorService.obtenerPorId(id).orElse(null);
    }

    @GetMapping("/correo/{correo}")
    @Operation(summary = "Obtener instructor por correo")
    public Instructor obtenerPorCorreo(@PathVariable String correo) {
        return instructorService.obtenerPorCorreo(correo).orElse(null);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar instructor por ID")
    public Instructor actualizarInstructor(@PathVariable Long id, @RequestBody Instructor instructor) {
        instructor.setId(id);
        return instructorService.guardarInstructor(instructor);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar instructor por ID")
    public void eliminarInstructor(@PathVariable Long id) {
        instructorService.eliminarInstructor(id);
    }
}