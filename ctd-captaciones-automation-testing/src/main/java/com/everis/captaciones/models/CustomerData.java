package com.everis.captaciones.models;

import lombok.Data;

/**
 * @author jovallep
 */
@Data
public class CustomerData {

    private String codigo;
    private String cuenta;

    public CustomerData(String codigo, String cuenta) {
        this.codigo = codigo;
        this.cuenta = cuenta;
    }
}
