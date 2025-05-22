
package com.rollerspeed.rollerspeed.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.rollerspeed.rollerspeed.controller.model.Instructor;

@RestController
@RequestMapping("/api/instructores")
public class InstructorController {

    private List<Instructor> instructores = new ArrayList<>();

    @GetMapping
    public List<Instructor> listarInstructores() {
        return instructores;
    }

    @PostMapping
    public Instructor crearInstructor(@RequestBody Instructor instructor) {
        instructores.add(instructor);
        return instructor;
    }

    @GetMapping("/{correo}")
    public Instructor obtenerPorCorreo(@PathVariable String correo) {
        return instructores.stream()
                .filter(i -> i.getCorreo().equalsIgnoreCase(correo))
                .findFirst()
                .orElse(null);
    }
}