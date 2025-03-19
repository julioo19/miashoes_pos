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
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public class DAODetalleFacturacionImple extends C_Conexion implements DAODetalleFacturacion {

    private final String REGISTRAR_DETALLE_FACTURA = "INSERT INTO detallefacturacion (factura_id, calzado_id, cantidad) VALUES (?, ?, ?)";

    @Override
    public void registrarDetalleFacturacion(DetalleFacturacion d_facturacion, JTable tbl_detalle) throws Exception {
        try {
            final int batchSize = 12;
            int count = 0;
            int rowCount = tbl_detalle.getRowCount();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_DETALLE_FACTURA)) {
                for (int row = 0; row < rowCount; row++) {
                    String nro_facto = (String) tbl_detalle.getValueAt(row, 0);
                    String calzado = (String) tbl_detalle.getValueAt(row, 1);
                    int cantidad = (Integer) tbl_detalle.getValueAt(row, 0);
                    st.setString(1, nro_facto);
                    st.setString(2, calzado);
                    st.setInt(3, cantidad);
                    st.addBatch();
                    if (++count % batchSize == 0) {
                        st.executeBatch();
                        st.clearBatch();
                        count = 0;
                    }

                }
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
