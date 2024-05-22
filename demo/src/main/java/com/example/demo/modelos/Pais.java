package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Pais;

    @Column(name = "NombrePais",nullable = false, length = 50)
    private String nombrepais;

    public Pais() {
    }

    public Pais(Integer id_Pais, String nombrepais) {
        this.id_Pais = id_Pais;
        this.nombrepais = nombrepais;
    }

    public Integer getId_Pais() {
        return id_Pais;
    }

    public void setId_Pais(Integer id_Pais) {
        this.id_Pais = id_Pais;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }
}
