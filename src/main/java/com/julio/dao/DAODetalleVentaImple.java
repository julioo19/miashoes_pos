/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAODetalleVenta;
import com.julio.modelos.DetalleVenta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DAODetalleVentaImple extends C_Conexion implements DAODetalleVenta{

    private final String REGISTRAR_DETALLE_VENTA = "INSERT INTO detalleventa(venta_id, calzado_barra, cantidad, descuento, precio_final) VALUES (?, ?, ?, ?, ?)";
    @Override
    public void registrarDetalle(List<DetalleVenta> detalleventa) throws Exception {
        try{
            establecerConexion();
            final int batchSize = 5;
            int count = 0;
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_DETALLE_VENTA)) {
                for (DetalleVenta detalle : detalleventa){
                    st.setString(1, detalle.getCalzado().getCod_barra());
                    st.setInt(2, detalle.getCantidad());
                    st.setBigDecimal(3, detalle.getDescuento());
                    st.setBigDecimal(4, detalle.getPrecio());
                    st.addBatch();
                    if(++count % batchSize == 0){
                        st.executeBatch();
                        st.clearBatch();
                        count = 0;
                    }
                }
                if (count >= 0){
                    st.executeBatch();
                }
            }
        }
        catch(SQLException e ){
            throw e;
        }
        finally{
            cerrarConexion();
        }
    }
    
    
}
