/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.DetalleFacturacion;
import com.julio.modelos.Facturacion;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface DAOFacturacion {
    public void registrarFacturacionConDetalles(Facturacion facturacion, List<DetalleFacturacion> detalles) throws Exception;
    public List<Facturacion> listarFactura(String campo) throws Exception;
}
