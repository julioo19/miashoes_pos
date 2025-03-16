/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAODetalleFacturacion;
import com.julio.modelos.DetalleFacturacion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class DAODetalleFacturacionImple extends C_Conexion implements DAODetalleFacturacion {
    private final String REGISTRAR_DETALLE_FACTURA = "INSERT INTO detallefacturacion (factura_id, calzado_id, cantidad) VALUES (?, ?, ?)";

    @Override
    public void registrarDetalleFacturacion(DetalleFacturacion d_facturacion) throws Exception {
        try{
            PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_DETALLE_FACTURA);
            st.setString(1, d_facturacion.getFactura().getNro_factura());
            st.setString(2, d_facturacion.getCalzado().getCod_barra());
            st.setInt(3, d_facturacion.getCantidad());
            st.executeUpdate();
            st.close();
        }
        catch(SQLException e){
            throw e;
        }
        finally{
            cerrarConexion();
        }
    }
    
}
