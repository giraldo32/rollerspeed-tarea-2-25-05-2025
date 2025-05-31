
package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class clienteController {

    @GetMapping("/consultar")
    public String getcliente() {
        return "cliente"; // Nombre de la vista a renderizar (cliente.html)
    }


    
}


