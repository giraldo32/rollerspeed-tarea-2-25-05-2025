package com.rollerspeed.rollerspeed.controller;


import com.rollerspeed.rollerspeed.controller.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    private List<Estudiante> estudiantes = new ArrayList<>();

    @GetMapping
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudiantes);
        return "estudiantes"; // Debes crear estudiantes.html en templates
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "formEstudiante"; // Debes crear formEstudiante.html en templates
    }

    @PostMapping
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudiantes.add(estudiante);
        return "redirect:/estudiantes";
    }
}