package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.Repository.UserRepository; 
import com.rollerspeed.rollerspeed.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UserRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void borrarById(Long id) {
        usuarioRepository.deleteById(id);
    }
}