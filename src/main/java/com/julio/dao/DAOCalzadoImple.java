/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOCalzado;
import com.julio.modelos.Calzado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class DAOCalzadoImple extends C_Conexion implements DAOCalzado{
    private final String REGISTRAR_CALZADO = "INSERT INTO calzado(codigo_barra, referencia, color, material, stock, marca_id, precio_sugerido) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String ACTUALIZAR_CALZADO = "UPDATE calzado SET referencia = ?, color = ?, material = ?, stock = ?, marca_id = ?, precio_sugerido = ? WHERE codigo_barra = ?";

    @Override
    public void registrarCalzado(Calzado calzado) throws Exception {
        try{
            this.establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_CALZADO)) {
                st.setString(1, calzado.getCod_barra());
                st.setString(2, calzado.getReferencia());
                st.setString(3, calzado.getColor());
                st.setString(4, calzado.getMaterial());
                st.setInt(5, calzado.getStock());
                st.setInt(6, calzado.getMarca().getId_marca());
                st.setBigDecimal(7, calzado.getPrecio_sugerido());
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

    @Override
    public void modificarCalzado(Calzado calzado) throws Exception {
        try{
            this.establecerConexion();
            PreparedStatement st = this.conectar.prepareStatement(ACTUALIZAR_CALZADO);
            st.setString(1, calzado.getReferencia());
            st.setString(2, calzado.getColor());
            st.setString(3, calzado.getMaterial());
            st.setInt(4, calzado.getStock());
            st.setInt(5, calzado.getMarca().getId_marca());
            st.setBigDecimal(6, calzado.getPrecio_sugerido());
            st.setString(7, calzado.getCod_barra());
        }
        catch(SQLException e){
            throw e;
        }
        finally{
            cerrarConexion();
        }
    }

    @Override
    public List<Calzado> listarCalzado() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
