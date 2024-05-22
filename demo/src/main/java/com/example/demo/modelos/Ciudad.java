package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Ciudad;

    @Column(name = "NombreCiudad",nullable = false,length = 50)
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(Integer id_Ciudad, String nombreCiudad) {
        this.id_Ciudad = id_Ciudad;
        this.nombreCiudad = nombreCiudad;
    }

    public Integer getId_Ciudad() {
        return id_Ciudad;
    }

    public void setId_Ciudad(Integer id_Ciudad) {
        this.id_Ciudad = id_Ciudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}

