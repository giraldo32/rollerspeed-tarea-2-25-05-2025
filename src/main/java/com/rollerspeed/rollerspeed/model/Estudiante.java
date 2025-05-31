package com.rollerspeed.rollerspeed.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int edad;
    private String correo;
    private String nivel;
    private String pago;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, String correo, String nivel, String pago) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.nivel = nivel;
        this.pago = pago;
    }

    // getters y setters...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getPago() { return pago; }
    public void setPago(String pago) { this.pago = pago; }
}