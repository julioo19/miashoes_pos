/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOVenta;
import com.julio.modelos.DetalleVenta;
import com.julio.modelos.Venta;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DAOVentaImple extends C_Conexion implements DAOVenta {

    private final String REGISTRAR_VENTA = "INSERT INTO venta (dni_id, monto, nro_serie)";
    private final String REGISTRAR_DETALLE_VENTA = "INSERT INTO detalleventa(venta_id, calzado_barra, cantidad, descuento, precio_final) VALUES (?, ?, ?, ?, ?)";

    @Override
    public void registrarVentaConDetalles(Venta venta, List<DetalleVenta> detalleVenta) throws Exception {
        PreparedStatement stVenta = null;
        PreparedStatement stDetalleVenta = null;
        final int batchSize = 5;
        int count = 0;
        try {
            this.establecerConexion();
            conectar.setAutoCommit(false);
            stVenta = this.conectar.prepareStatement(REGISTRAR_VENTA);
            stVenta.setString(1, venta.getCliente().getDni_id());
            stVenta.setBigDecimal(2, venta.getMonto());
            stVenta.setString(3, venta.getSerie());
            stVenta.executeUpdate();

            stDetalleVenta = this.conectar.prepareStatement(REGISTRAR_DETALLE_VENTA);
            for (DetalleVenta d_venta : detalleVenta){
                stDetalleVenta.setString(1, d_venta.getCalzado().getCod_barra());
                stDetalleVenta.setInt(2, d_venta.getCantidad());
                stDetalleVenta.setBigDecimal(3, d_venta.getDescuento());
                stDetalleVenta.setBigDecimal(4, d_venta.getPrecio());
                if (++count % batchSize == 0){
                    stDetalleVenta.executeBatch();
                    stDetalleVenta.clearBatch();
                    count = 0;
                }
            }
            if (count >= 0){
                stDetalleVenta.executeBatch();
            }
            this.conectar.commit();
        }
        catch(SQLException e){
            throw e;
        }
        finally{
            if (stVenta !=null){
                stVenta.close();
            }
            if(stDetalleVenta != null){
                stDetalleVenta.close();
            }
            if (conectar != null){
                cerrarConexion();
            }
        }
    }

    /*/
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
    /*/
}
