package com.rollerspeed.rollerspeed.model;

import jakarta.persistence.*;

@Entity
public class Index {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensajeBienvenida;
    private String mision;
    private String vision;
    private String valores;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMensajeBienvenida() { return mensajeBienvenida; }
    public void setMensajeBienvenida(String mensajeBienvenida) { this.mensajeBienvenida = mensajeBienvenida; }

    public String getMision() { return mision; }
    public void setMision(String mision) { this.mision = mision; }

    public String getVision() { return vision; }
    public void setVision(String vision) { this.vision = vision; }

    public String getValores() { return valores; }
    public void setValores(String valores) { this.valores = valores; }
}