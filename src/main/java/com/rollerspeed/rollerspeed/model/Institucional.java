package com.rollerspeed.rollerspeed.model;

import jakarta.persistence.*;

@Entity
public class Institucional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mision;
    private String vision;
    private String valores;
    private String historia;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMision() { return mision; }
    public void setMision(String mision) { this.mision = mision; }

    public String getVision() { return vision; }
    public void setVision(String vision) { this.vision = vision; }

    public String getValores() { return valores; }
    public void setValores(String valores) { this.valores = valores; }

    public String getHistoria() { return historia; }
    public void setHistoria(String historia) { this.historia = historia; }
}