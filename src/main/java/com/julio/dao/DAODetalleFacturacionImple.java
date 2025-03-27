/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAODetalleFacturacion;
import com.julio.modelos.DetalleFacturacion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DAODetalleFacturacionImple extends C_Conexion implements DAODetalleFacturacion {
    private final String REGISTRAR_DETALLE_FACTURA = "INSERT INTO detallefacturacion (factura_id, calzado_id) VALUES (?, ?)";

    @Override
    public void registrarDetalleFacturacion(List<DetalleFacturacion> detalles) throws Exception {
        try {
            this.establecerConexion();
            final int batchSize = 12;
            int count = 0;
            try (PreparedStatement st = conectar.prepareStatement(REGISTRAR_DETALLE_FACTURA)) {
                for (DetalleFacturacion detalle : detalles) {
                    /*/esto tiene que ir en el boton guardar
                    String nro_facto = (String) tbl_detalle.getValueAt(row, 0);
                    String calzado = (String) tbl_detalle.getValueAt(row, 1);
                    int cantidad = (Integer) tbl_detalle.getValueAt(row, 2);
                    /*Hasta int cantidad*/
                    st.setString(1, detalle.getFactura().getNro_factura());
                    st.setString(2, detalle.getCalzado().getCod_barra());
                    st.addBatch();
                    if (++count % batchSize == 0) {
                        st.executeBatch();
                        st.clearBatch(); //limpiamos despues de ejecucion
                        count = 0; //reseteo de conteo
                    }
                }
                //no duplicados
                if (count >= 0) {
                    st.executeBatch();
                }
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            cerrarConexion();
        }
    }
}
