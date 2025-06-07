package com.rollerspeed.rollerspeed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import jakarta.persistence.Entity;



/**
 * Entidad que representa un usuario en el sistema.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_usuarios")
public class Usuario {

    /**
     * Identificador único del usuario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del usuario.
     */
    @Column(nullable = false, length = 50)
    private String nombre;

    /**
     * Dirección de correo electrónico del usuario (debe ser única).
     */
    @Column(name="e_mail" , nullable = false, length = 100, unique = true)
    private String email;

    /**
     * Contraseña del usuario.
     */
    @Column(length = 50)
    private String password;
}