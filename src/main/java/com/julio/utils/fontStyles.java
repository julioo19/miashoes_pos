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
            JLabel marca) {
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

    public static void estiloBuscarCalzado(JLabel titulo, JLabel buscar) {
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        buscar.putClientProperty(FLATLAF, "h2");
        buscar.setForeground(Color.BLACK);
    }

    public static void estiloModificarCalzado(JLabel titulo, JLabel ref, JLabel color, JLabel material,
            JLabel stock, JLabel marca) {
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

    public static void estiloReporteCalzado(JLabel marca) {
        marca.putClientProperty(FLATLAF, "h2");
        marca.setForeground(Color.BLACK);
    }

    public static void estiloAgregarCliente(JLabel titulo, JLabel dni, JLabel nombre, JLabel telefono) {
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        dni.putClientProperty(FLATLAF, "h3");
        dni.setForeground(Color.BLACK);
        nombre.putClientProperty(FLATLAF, "h3");
        nombre.setForeground(Color.BLACK);
        telefono.putClientProperty(FLATLAF, "h3");
        telefono.setForeground(Color.BLACK);
    }

    public static void estiloBuscarCliente(JLabel titulo, JLabel buscar) {
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        buscar.putClientProperty(FLATLAF, "h2");
        buscar.setForeground(Color.BLACK);
    }

    public static void estiloModificarCliente(JLabel titulo, JLabel nombre, JLabel telefono) {
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        nombre.putClientProperty(FLATLAF, "h3");
        nombre.setForeground(Color.BLACK);
        telefono.putClientProperty(FLATLAF, "h3");
        telefono.setForeground(Color.BLACK);
    }

    public static void estiloRegistrarVenta(JLabel titulo, JLabel sub, JLabel desc, JLabel dni,
            JLabel cantidad) {
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        sub.putClientProperty(FLATLAF, "h3");
        sub.setForeground(Color.BLACK);
        desc.putClientProperty(FLATLAF, "h3");
        desc.setForeground(Color.BLACK);
        dni.putClientProperty(FLATLAF, "h3");
        dni.setForeground(Color.BLACK);
        cantidad.putClientProperty(FLATLAF, "h3");
        cantidad.setForeground(Color.BLACK);
    }

    public static void estiloRegistrarSeparadoJLabel(JLabel titulo, JLabel sub, JLabel desc, JLabel dni,
            JLabel cantidad) {
        titulo.putClientProperty(FLATLAF, "h1");
        titulo.setForeground(Color.BLACK);
        sub.putClientProperty(FLATLAF, "h3");
        sub.setForeground(Color.BLACK);
        desc.putClientProperty(FLATLAF, "h3");
        desc.setForeground(Color.BLACK);
        dni.putClientProperty(FLATLAF, "h3");
        dni.setForeground(Color.BLACK);
        cantidad.putClientProperty(FLATLAF, "h3");
        cantidad.setForeground(Color.BLACK);
    }
}
