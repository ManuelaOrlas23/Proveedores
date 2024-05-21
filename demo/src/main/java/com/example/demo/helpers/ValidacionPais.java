package com.example.demo.helpers;

import org.springframework.stereotype.Component;

@Component
public class ValidacionPais {

    public boolean validarPais(String pais) throws Exception{
        if (pais.length()==0){
            throw new Exception("El pais no puede estar vacia");
        }
        if (pais.length()>50){
            throw new Exception("El pais no puede tener mas de 50 caracteres");
        }
        String regex="/^[a-zA-ZÁÉÍÓÚáéíóúÑñ\\s'’-]+$/\n";
        if (ValidarPatron.evaluarPatron(pais,regex)){
            throw new Exception("Revisa el pais ingresa esta puede tener mayusculas, minusculas y caracteres especiales");
        }
        return true;
    }
}
