package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Usuario;
import com.rollerspeed.rollerspeed.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsuarioService userService;

    // Obtener todos los usuarios
    @GetMapping(value = "/listar")
    public String getAllUsers(Model model) {
        List<Usuario> listaUsuarios = userService.getUsuarios();
        model.addAttribute("usuariosdb", listaUsuarios);
        return "usuarios";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuariosform";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        userService.guardarUsuario(usuario);
        return "redirect:/users/listar";
    }
}