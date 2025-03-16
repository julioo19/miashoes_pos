/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOFacturacion;
import com.julio.modelos.Facturacion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class DAOFacturacionImple extends C_Conexion implements DAOFacturacion {
    private final String REGISTRAR_FACTURACION = "INSERT INTO facturacion (id_factura, marca_id, fecha_emision) VALUES (?, ?, ?)";
    
    @Override
    public void registrarFacturacion(Facturacion facturacion) throws Exception {
        try{
            establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_FACTURACION)) {
                st.setString(1, facturacion.getNro_factura());
                st.setInt(2, facturacion.getMarca().getId_marca());
                st.setDate(3, facturacion.getFecha_emision());
                st.executeUpdate();
            }
        }
        catch(SQLException e){
            throw e;
        }
        finally{
            cerrarConexion();
        }
    }
    
}
