/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class C_Conexion {

    protected Connection conectar = null;
    private final String HOST = "localhost";
    private final String USER = "postgres";
    private final String PASSWORD = "julio";
    private final String BD = "mia";
    private final String PORT = "5432";
    private final String URL = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + BD;

    public Connection establecerConexion() {
        try {
            conectar = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Se conecto BB", "SIUCHO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conectar;
    }
    
    public void cerrarConexion() throws SQLException{
        if (conectar != null){
            if (!conectar.isClosed()){
                conectar.close();
            }
        }
    }
}
