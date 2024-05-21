package com.example.demo.repositorios;
import com.example.demo.modelos.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepositorio extends JpaRepository<Proveedor,Integer> {
}

