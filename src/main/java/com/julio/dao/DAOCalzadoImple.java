/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOCalzado;
import com.julio.modelos.Calzado;
import com.julio.modelos.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAOCalzadoImple extends C_Conexion implements DAOCalzado{
    private final String REGISTRAR_CALZADO = "INSERT INTO calzado(codigo_barra, referencia, color, material, talla, stock, marca_id, precio_sugerido) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private final String ACTUALIZAR_CALZADO = "UPDATE calzado SET referencia = ?, color = ?, material = ?, talla = ?, stock = ?, marca_id = ?, precio_sugerido = ? WHERE codigo_barra = ?";
    private final String BUSCAR_CALZADO_REFERENCIA = "SELECT * FROM buscar_calzado(?)";
    private final String BUSCAR_CALZADO_BARRA = "SELECT * FROM buscar_calzado_por_barra(?)";

    @Override
    public void registrarCalzado(Calzado calzado) throws Exception {
        try{
            this.establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_CALZADO)) {
                st.setString(1, calzado.getCod_barra());
                st.setString(2, calzado.getReferencia());
                st.setString(3, calzado.getColor());
                st.setString(4, calzado.getMaterial());
                st.setInt(5, calzado.getTalla());
                st.setInt(6, calzado.getStock());
                st.setInt(7, calzado.getMarca().getId_marca());
                st.setBigDecimal(8, calzado.getPrecio_sugerido());
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
            st.setInt(4, calzado.getTalla());
            st.setInt(5, calzado.getStock());
            st.setInt(6, calzado.getMarca().getId_marca());
            st.setBigDecimal(7, calzado.getPrecio_sugerido());
            st.setString(8, calzado.getCod_barra());
        }
        catch(SQLException e){
            throw e;
        }
        finally{
            cerrarConexion();
        }
    }

    @Override
    public List<Calzado> listarCalzado(String campo) throws Exception {
        List<Calzado> listaCalzado = new ArrayList<>();
        try{
            this.establecerConexion();
            ResultSet rs;
            try (PreparedStatement st = this.conectar.prepareStatement(BUSCAR_CALZADO_REFERENCIA)) {
                st.setString(1, campo);
                rs = st.executeQuery();
                while(rs.next()){
                    Calzado calzado = new Calzado();
                    calzado.setCod_barra(rs.getString("codigo_barra"));
                    calzado.setReferencia(rs.getString("referencia"));
                    calzado.setColor(rs.getString("color"));
                    calzado.setMaterial(rs.getString("material"));
                    calzado.setTalla(rs.getInt("talla"));
                    calzado.setStock(rs.getInt("stock"));
                    calzado.setMarca(new Marca());
                    calzado.getMarca().setNombre_marca(rs.getString("marca"));
                    calzado.setPrecio_sugerido(rs.getBigDecimal("precio_sugerido"));
                    listaCalzado.add(calzado);
                }
            }
            rs.close();
        }
        catch(SQLException e){
            throw e;          
        }
        finally{
            cerrarConexion();
        }
        return listaCalzado;
    }
    

    @Override
    public Calzado getCalzadoId(String barra) throws Exception {
        Calzado calzado = new Calzado();
        try{
            this.establecerConexion();
            ResultSet rs;
            try (PreparedStatement st = this.conectar.prepareStatement(BUSCAR_CALZADO_BARRA)) {
                st.setString(1, barra);
                rs = st.executeQuery();
                while(rs.next()){
                    calzado.setCod_barra(rs.getString("codigo_barra"));
                    calzado.setReferencia(rs.getString("referencia"));
                    calzado.setColor(rs.getString("color"));
                    calzado.setMaterial(rs.getString("material"));
                    calzado.setTalla(rs.getInt("talla"));
                    calzado.setStock(rs.getInt("stock"));
                    calzado.setMarca(new Marca());
                    calzado.getMarca().setNombre_marca(rs.getString("nombre_marca"));
                    calzado.setPrecio_sugerido(rs.getBigDecimal("precio_sugerido"));
                }
            }
            rs.close();
        }
        catch(SQLException e){
            throw e;
        }
        finally{
            this.cerrarConexion();
        }
        return calzado;
    }

    
    
}
