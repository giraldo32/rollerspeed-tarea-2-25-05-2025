package com.rollerspeed.rollerspeed.controller.model;

public class Instructor {
    private String nombre;
    private int experiencia;
    private String correo;
    private String especialidad;

    public Instructor() {
    }

    public Instructor(String nombre, int experiencia, String correo, String especialidad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.correo = correo;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
