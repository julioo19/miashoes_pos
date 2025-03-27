/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOFacturacion;
import com.julio.modelos.DetalleFacturacion;
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
    private final String REGISTRAR_DETALLE_FACTURA = "INSERT INTO detallefacturacion (factura_id, calzado_id, cantidad) VALUES (?, ?, ?)";
    private final String BUSQUEDA_FACTURACION = "SELECT * FROM facturacion where id_factura = ?";

    @Override
    public void registrarFacturacionConDetalles(Facturacion facturacion, List<DetalleFacturacion> detalles) throws Exception {
        PreparedStatement stFacturacion = null;
        PreparedStatement stDetalleFacturacion = null;
        int count = 0;
        final int batchSize = 9;
        try {
            this.establecerConexion();
            //colocar el autocommit a false
            conectar.setAutoCommit(false);
            stFacturacion = this.conectar.prepareStatement(REGISTRAR_FACTURACION);
            stFacturacion.setString(1, facturacion.getNro_factura());
            stFacturacion.setInt(2, facturacion.getMarca().getId_marca());
            stFacturacion.setDate(3, facturacion.getFecha_emision());
            stFacturacion.executeUpdate();

            stDetalleFacturacion = this.conectar.prepareStatement(REGISTRAR_DETALLE_FACTURA);
            for (DetalleFacturacion detalle : detalles){
                stDetalleFacturacion.setString(1, detalle.getFactura().getNro_factura());
                stDetalleFacturacion.setString(2, detalle.getCalzado().getCod_barra());
                stDetalleFacturacion.setInt(3, detalle.getCantidad());
                stDetalleFacturacion.addBatch();
                if (++count % batchSize == 0){
                    stDetalleFacturacion.executeBatch();
                    stDetalleFacturacion.clearBatch(); //limpiamos el batch despues de la ejecucion
                    count = 0; //reiniciamos el conteo
                }
            }
            if (count >= 0){ //prevencion de inserciones duplicadas
                stDetalleFacturacion.executeBatch(); //insertar los datos restantes
            }
            this.conectar.commit();//Hacemos el commit
        }
        catch(SQLException e){
            e.printStackTrace();
            conectar.rollback(); //Hacemos el rollback si algo falla
        }
        finally{ //cierre de PreparedStatements y Conexion a BD
            if (stFacturacion != null){
                stFacturacion.close();
            }
            if (stDetalleFacturacion != null){
                stDetalleFacturacion.close();
            }
            if(this.conectar != null){
                cerrarConexion();
            }
        }
    }

    /*/
    @Override
    public void registrarFacturacion(Facturacion facturacion, List<DetalleFacturacion> detalles) throws Exception {
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
/*/
    @Override
    public List<Facturacion> listarFactura(String campo) throws Exception {
        List<Facturacion> listaFactura = new ArrayList<>();
        try {
            this.establecerConexion();
            ResultSet rs;
            try (PreparedStatement st = this.conectar.prepareStatement(BUSQUEDA_FACTURACION)) {
                st.setString(1, campo);
                rs = st.executeQuery();
                while (rs.next()) {
                    Facturacion factura = new Facturacion();
                    factura.setNro_factura(rs.getString("id_factura"));
                    factura.setMarca(new Marca());
                    factura.getMarca().setId_marca(rs.getInt("marca_id"));
                    factura.setFecha_emision(rs.getDate("fecha_emision"));
                    listaFactura.add(factura);
                }
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cerrarConexion();
        }
        return listaFactura;
    }

}
