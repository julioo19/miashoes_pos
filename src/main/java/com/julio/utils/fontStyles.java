/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.utils;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author ACER
 */
public class fontStyles {
    private static final String FLATLAF = "FlatLaf.styleClass";
    
    public static void estilosAgregarCalzado(JLabel titulo, JLabel barras, JLabel ref, JLabel color, JLabel material, JLabel stock,
            JLabel marca){
        titulo.putClientProperty(FLATLAF, "h1");
        ref.putClientProperty(FLATLAF, "h3");
        ref.setForeground(Color.BLACK);
        barras.putClientProperty(FLATLAF, "h3");
        barras.setForeground(Color.BLACK);
        color.putClientProperty(FLATLAF, "h3");
        color.setForeground(Color.BLACK);
        material.putClientProperty(FLATLAF, "h3");
        material.setForeground(Color.BLACK);
        stock.putClientProperty(FLATLAF, "h3");
        stock.setForeground(Color.BLACK);
        marca.putClientProperty(FLATLAF, "h3");
        marca.setForeground(Color.BLACK);
    }
    
    public static void estiloBuscarCalzado(JLabel titulo, JLabel buscar){
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        buscar.putClientProperty(FLATLAF, "h2");
        buscar.setForeground(Color.BLACK);
    }
    
    public static void estiloModificarCalzado(JLabel titulo, JLabel ref, JLabel color, JLabel material,
            JLabel stock, JLabel marca){
        titulo.putClientProperty(FLATLAF, "h1");
        ref.putClientProperty(FLATLAF, "h3");
        ref.setForeground(Color.BLACK);
        color.putClientProperty(FLATLAF, "h3");
        color.setForeground(Color.BLACK);
        material.putClientProperty(FLATLAF, "h3");
        material.setForeground(Color.BLACK);
        stock.putClientProperty(FLATLAF, "h3");
        stock.setForeground(Color.BLACK);
        marca.putClientProperty(FLATLAF, "h3");
        marca.setForeground(Color.BLACK);
    }
    
    public static void estiloReporteCalzado(JLabel marca){
        marca.putClientProperty(FLATLAF, "h2");
        marca.setForeground(Color.BLACK);
    }
    
    public static void estiloAgregarCliente(JLabel titulo, JLabel dni, JLabel nombre, JLabel telefono){
        titulo.putClientProperty(FLATLAF, "h1");
        dni.putClientProperty(FLATLAF, "h3");
        nombre.putClientProperty(FLATLAF, "h3");
        telefono.putClientProperty(FLATLAF, "h3");
    }
    
    public static void estiloBuscarCliente(JLabel titulo, JLabel buscar){
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        buscar.putClientProperty(FLATLAF, "h2");
        buscar.setForeground(Color.BLACK);
    }
}
