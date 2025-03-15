/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.modelos;

import java.math.BigDecimal;

/**
 *
 * @author ACER
 */
public class DetalleVenta {
    private int detalleVenta_id;
    private Venta venta;
    private Calzado calzado;
    private int cantidad;
    private BigDecimal descuento;
    private BigDecimal precio;

    public int getDetalleVenta_id() {
        return detalleVenta_id;
    }

    public void setDetalleVenta_id(int detalleVenta_id) {
        this.detalleVenta_id = detalleVenta_id;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Calzado getCalzado() {
        return calzado;
    }

    public void setCalzado(Calzado calzado) {
        this.calzado = calzado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    
    
    
}
