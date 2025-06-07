package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Usuario;
import com.rollerspeed.rollerspeed.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    @Operation(summary = "Listar todos los usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo usuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener usuario por ID")
    public Usuario obtenerPorId(@PathVariable Long id) {
        return usuarioService.obtenerPorId(id).orElse(null);
    }

    @GetMapping("/email/{email}")
    @Operation(summary = "Obtener usuario por email")
    public Usuario obtenerPorEmail(@PathVariable String email) {
        return usuarioService.obtenerPorEmail(email).orElse(null);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar usuario por ID")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar usuario por ID")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }
}