/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.DetalleFacturacion;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public interface DAODetalleFacturacion {
    public void registrarDetalleFacturacion(List<DetalleFacturacion> detalles) throws Exception;
}
