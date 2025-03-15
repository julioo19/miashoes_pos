/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.modelos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author ACER
 */
public class Venta {
    private int id_venta;
    private Cliente cliente;
    private BigDecimal monto;
    private LocalDateTime tiempo;
    private String serie;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
}
