


package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping({"/", "/index"})
    public String mostrarIndex() {
        return "index"; // Renderiza templates/index.html
    }
}