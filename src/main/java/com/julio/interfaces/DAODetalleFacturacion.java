/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.DetalleFacturacion;
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public interface DAODetalleFacturacion {
    public void registrarDetalleFacturacion(DetalleFacturacion d_facturacion, JTable tbl_detalle) throws Exception;
}
