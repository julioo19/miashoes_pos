/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.DetalleVenta;
import com.julio.modelos.Venta;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface DAOVenta {
    public void registrarVentaConDetalles(Venta venta, List<DetalleVenta> detalleVenta) throws Exception;
}
