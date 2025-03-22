/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.DetalleVenta;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface DAODetalleVenta {
    public void registrarDetalle (List<DetalleVenta> detalleventa) throws Exception;
}
