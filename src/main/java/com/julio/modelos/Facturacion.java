/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.modelos;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class Facturacion {
    private String nro_factura; 
    private Marca marca;
    private Date fecha_emision;

    public String getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(String nro_factura) {
        this.nro_factura = nro_factura;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }
    
    
}
