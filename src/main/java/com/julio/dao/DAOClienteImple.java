/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.dao;

import com.julio.controladores.C_Conexion;
import com.julio.interfaces.DAOCliente;
import com.julio.modelos.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DAOClienteImple extends C_Conexion implements DAOCliente{
    private final String REGISTRAR_CLIENTE = "INSERT INTO cliente(dni_cliente, nombre_cliente, nro_telef) VALUES (?, ?, ?)";
    private final String ACTUALIZAR_CLIENTE = "UPDATE cliente SET dni_cliente = ?, nombre_cliente = ?, nro_telef = ?";
    private final String BUSCAR_CLIENTE = "SELECT * FROM cliente where nombre_cliente ILIKE ?";

    @Override
    public void registarCliente(Cliente cliente) throws Exception {
        try{
            establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(REGISTRAR_CLIENTE)) {
                st.setString(1, cliente.getDni_id());
                st.setString(2, cliente.getNombre_cliente());
                st.setString(3, cliente.getNro_telefono());
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
    public void modificarCliente(Cliente cliente) throws Exception {
        try{
            establecerConexion();
            try (PreparedStatement st = this.conectar.prepareStatement(ACTUALIZAR_CLIENTE)) {
                st.setString(1, cliente.getDni_id());
                st.setString(2, cliente.getNombre_cliente());
                st.setString(3, cliente.getNro_telefono());
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
    public List<Cliente> listarCliente(String campo) throws Exception {
        List<Cliente> listaCliente = new ArrayList<>();
        try{
            establecerConexion();
            ResultSet rs;
            try (PreparedStatement st = conectar.prepareStatement(BUSCAR_CLIENTE)) {
                st.setString(1, "%" + campo + "%");
                rs = st.executeQuery();
                while(rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setDni_id(rs.getString("dni_cliente"));
                    cliente.setNombre_cliente(rs.getString("nombre_cliente"));
                    cliente.setNro_telefono(rs.getString("nro_telef"));
                    listaCliente.add(cliente);
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
        return listaCliente;
    }
    
}
