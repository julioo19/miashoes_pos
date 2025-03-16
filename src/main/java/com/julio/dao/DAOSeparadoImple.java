/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOSeparado;
import com.julio.modelos.Separado;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class DAOSeparadoImple extends C_Conexion implements DAOSeparado{
    private final String REGISTRAR_SEPARADO = "INSERT INTO separado (id_separado, dni_id, monto, estado) VALUES (?, ?, ?, ?)";

    @Override
    public void registrarSeparado(Separado separado) throws Exception {
        try{
            establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_SEPARADO)) {
                st.setInt(1, separado.getId_separado());
                st.setString(2, separado.getCliente().getDni_id());
                st.setBigDecimal(3, separado.getMonto());
                st.setString(4, separado.getEstado());
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
