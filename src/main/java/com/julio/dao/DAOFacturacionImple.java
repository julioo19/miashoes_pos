/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOFacturacion;
import com.julio.modelos.Facturacion;
import com.julio.modelos.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DAOFacturacionImple extends C_Conexion implements DAOFacturacion {
    private final String REGISTRAR_FACTURACION = "INSERT INTO facturacion (id_factura, marca_id, fecha_emision) VALUES (?, ?, ?)";
    private final String BUSQUEDA_FACTURACION = "SELECT * FROM facturacion where id_factura = ?";
    
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

    @Override
    public List<Facturacion> listarFactura(String campo) throws Exception {
        List<Facturacion> listaFactura = new ArrayList<>();
        try{
            this.establecerConexion();
            ResultSet rs;
            try (PreparedStatement st = this.conectar.prepareStatement(BUSQUEDA_FACTURACION)) {
                st.setString(1, campo);
                rs = st.executeQuery();
                while(rs.next()){
                    Facturacion factura = new Facturacion();
                    factura.setNro_factura(rs.getString("id_factura"));
                    factura.setMarca(new Marca());
                    factura.getMarca().setId_marca(rs.getInt("marca_id"));
                    factura.setFecha_emision(rs.getDate("fecha_emision"));
                    listaFactura.add(factura);
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
        return listaFactura;
    }
    
}
