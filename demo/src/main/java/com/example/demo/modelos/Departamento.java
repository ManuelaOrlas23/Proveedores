package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Departamento;

    @Column(name = "nombreDepartamento",nullable = false,length = 50)
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(Integer id_Departamento, String nombreDepartamento) {
        this.id_Departamento = id_Departamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public Integer getId_Departamento() {
        return id_Departamento;
    }

    public void setId_Departamento(Integer id_Departamento) {
        this.id_Departamento = id_Departamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
}

