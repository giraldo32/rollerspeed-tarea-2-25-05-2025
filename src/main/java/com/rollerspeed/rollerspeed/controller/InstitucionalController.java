




package com.rollerspeed.rollerspeed.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstitucionalController {

    @GetMapping("/institucional")
    public String vistaInstitucional() {
        return "institucional"; // Muestra institucional.html
    }
}