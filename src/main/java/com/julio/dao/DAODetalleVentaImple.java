/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAODetalleVenta;
import com.julio.modelos.DetalleVenta;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class DAODetalleVentaImple extends C_Conexion implements DAODetalleVenta{

    private final String REGISTRAR_DETALLE_VENTA = "INSERT INTO detalleventa(venta_id, calzado_barra, cantidad, descuento, precio_final) VALUES (?, ?, ?, ?, ?)";
    @Override
    public void registrarDetalle(DetalleVenta detalleventa) throws Exception {
        try{
            establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_DETALLE_VENTA)) {
                st.setInt(1, detalleventa.getVenta().getId_venta());
                st.setString(2, detalleventa.getCalzado().getCod_barra());
                st.setInt(3, detalleventa.getCantidad());
                st.setBigDecimal(4, detalleventa.getDescuento());
                st.setBigDecimal(5, detalleventa.getPrecio());
                st.executeUpdate();
            }
        }
        catch(SQLException e ){
            throw e;
        }
        finally{
            cerrarConexion();
        }
    }
    
    
}
