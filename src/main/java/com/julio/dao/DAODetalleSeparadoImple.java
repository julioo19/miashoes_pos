/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAODetalleSeparado;
import com.julio.modelos.DetalleSeparado;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class DAODetalleSeparadoImple extends C_Conexion implements DAODetalleSeparado{
    private final String REGISTRAR_DETALLE_SEPARADO = "INSERT INTO separado (separado_id, calzado_barra, cantidad, descuento, adelanto) VALUES (?, ?, ?, ?, ?)";

    @Override
    public void registrarDetalleSeparado(DetalleSeparado detalleseparado) throws Exception {
        try{
            establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_DETALLE_SEPARADO)) {
                st.setInt(1, detalleseparado.getSeparado().getId_separado());
                st.setString(2, detalleseparado.getCalzado().getCod_barra());
                st.setInt(3, detalleseparado.getCantidad());
                st.setBigDecimal(4, detalleseparado.getDescuento());
                st.setBigDecimal(5, detalleseparado.getAdelanto());
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
