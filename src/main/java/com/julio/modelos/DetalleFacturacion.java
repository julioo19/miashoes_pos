/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.modelos;

/**
 *
 * @author ACER
 */
public class DetalleFacturacion {
    private int detalleFacturacion_id;
    private Facturacion factura;
    private Calzado calzado;

    public int getDetalleFacturacion_id() {
        return detalleFacturacion_id;
    }

    public void setDetalleFacturacion_id(int detalleFacturacion_id) {
        this.detalleFacturacion_id = detalleFacturacion_id;
    }

    public Facturacion getFactura() {
        return factura;
    }

    public void setFactura(Facturacion factura) {
        this.factura = factura;
    }

    public Calzado getCalzado() {
        return calzado;
    }

    public void setCalzado(Calzado calzado) {
        this.calzado = calzado;
    }
    
}
