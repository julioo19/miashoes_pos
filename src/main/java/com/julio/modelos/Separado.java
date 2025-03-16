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
public class Separado {
    private int id_separado;
    private Cliente cliente;
    private BigDecimal monto;
    private LocalDateTime fecha_separado;
    private String estado;

    public int getId_separado() {
        return id_separado;
    }

    public void setId_separado(int id_separado) {
        this.id_separado = id_separado;
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

    public LocalDateTime getFecha_separado() {
        return fecha_separado;
    }

    public void setFecha_separado(LocalDateTime fecha_separado) {
        this.fecha_separado = fecha_separado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
