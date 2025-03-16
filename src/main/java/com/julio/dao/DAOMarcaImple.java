/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOMarca;
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
public class DAOMarcaImple extends C_Conexion implements DAOMarca {

    private final String LISTAR_MARCAS = "SELECT * FROM marca";

    @Override
    public List<Marca> listarMarca() throws Exception {
        List<Marca> listaMarca = new ArrayList<>();
        try {
            this.establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(LISTAR_MARCAS); ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Marca marca = new Marca();
                    marca.setId_marca(rs.getInt("id_marca"));
                    marca.setNombre_marca(rs.getString("nombre_marca"));
                    listaMarca.add(marca);
                }
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            cerrarConexion();
        }
        return listaMarca;
    }
}
