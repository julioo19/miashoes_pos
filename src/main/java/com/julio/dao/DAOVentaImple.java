/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOVenta;
import com.julio.modelos.Venta;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class DAOVentaImple extends C_Conexion implements DAOVenta {
    private final String REGISTRAR_VENTA = "INSERT INTO venta (dni_id, monto, nro_serie)";

    @Override
    public void registrarVenta(Venta venta) throws Exception {
        try{
            establecerConexion();
            try (PreparedStatement st = this.conectar.prepareCall(REGISTRAR_VENTA)) {
                st.setString(1, venta.getCliente().getDni_id());
                st.setBigDecimal(2, venta.getMonto());
                st.setString(3, venta.getSerie());
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
