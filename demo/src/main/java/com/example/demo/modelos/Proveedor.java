package com.example.demo.modelos;


import jakarta.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(name = "TipoPersona", nullable = false, length = 50)
    private String tipoPersona;
    @Column(name = "Nit",nullable = false,length = 60)
    private String nit;
    @Column(name = "NombreRazónSocial",nullable = false,length = 50)
    private String nombreRazonSocial;
    @Column(name = "RepresentanteLegal",nullable = false,length = 50)
    private String representanteLegal;
    @Column(name = "Telefono",nullable = false,length = 30)
    private String telefono;
    @Column(name = "Correo",nullable = false,length = 70)
    private String correo;
    @Column(name = "Dirección",nullable = false,length = 150)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_Pais",nullable = true)
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "id_Departamento",nullable = true)
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "id_Ciudad",nullable = true)
    private Ciudad ciudad;

    public Proveedor() {
    }

    public Proveedor(Integer id_usuario, String tipoPersona, String nit, String nombreRazonSocial, String representanteLegal, String telefono, String correo, String direccion) {
        this.id_usuario = id_usuario;
        this.tipoPersona = tipoPersona;
        this.nit = nit;
        this.nombreRazonSocial = nombreRazonSocial;
        this.representanteLegal = representanteLegal;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    public void setNombreRazonSocial(String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}
