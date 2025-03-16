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
public class DetalleSeparado {
    private int detalleSeparado_id;
    private Separado separado;
    private Calzado calzado;
    private int cantidad;
    private BigDecimal descuento;
    private BigDecimal adelanto;

    public int getDetalleSeparado_id() {
        return detalleSeparado_id;
    }

    public void setDetalleSeparado_id(int detalleSeparado_id) {
        this.detalleSeparado_id = detalleSeparado_id;
    }

    public Separado getSeparado() {
        return separado;
    }

    public void setSeparado(Separado separado) {
        this.separado = separado;
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

    public BigDecimal getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(BigDecimal adelanto) {
        this.adelanto = adelanto;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
    
    
}
