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
            JLabel marca, JLabel precio, JLabel talla) {
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
        talla.putClientProperty(FLATLAF, "h3");
        precio.putClientProperty(FLATLAF, "h3");
        marca.setForeground(Color.BLACK);
        talla.setForeground(Color.BLACK);
        precio.setForeground(Color.BLACK);
        
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

    public static void estiloReporteCalzado(JLabel titulo, JLabel marca) {
        titulo.putClientProperty(FLATLAF, "h1");
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
            JLabel cantidad, JLabel descuento) {
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
        descuento.putClientProperty(FLATLAF, "h3");
        descuento.setForeground(Color.BLACK);
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

    public static void estiloReporteVentaGeneral(JLabel titulo, JLabel subtitulo) {
        titulo.putClientProperty(FLATLAF, "h1");
        subtitulo.putClientProperty(FLATLAF, "h2");
        titulo.setForeground(Color.BLACK);
        subtitulo.setForeground(Color.BLACK);
    }

    public static void estiloReporteSeparadoGeneral(JLabel titulo, JLabel subtitulo) {
        titulo.putClientProperty(FLATLAF, "h1");
        subtitulo.putClientProperty(FLATLAF, "h2");
        titulo.setForeground(Color.BLACK);
        subtitulo.setForeground(Color.BLACK);
    }

    public static void estiloAyudaright(JLabel nombre, JLabel numVersion, JLabel devName, JLabel gmail, JLabel numero) {
        nombre.putClientProperty(FLATLAF, "h3");
        numVersion.putClientProperty(FLATLAF, "h3");
        devName.putClientProperty(FLATLAF, "h3");
        gmail.putClientProperty(FLATLAF, "h3");
        numero.putClientProperty(FLATLAF, "h3");

    }

    public static void estiloAyudaleft(JLabel titulo, JLabel sistema, JLabel version, JLabel dev,
            JLabel correo, JLabel soporte) {
        titulo.putClientProperty(FLATLAF, "h1");
        sistema.putClientProperty(FLATLAF, "h3");
        version.putClientProperty(FLATLAF, "h3");
        dev.putClientProperty(FLATLAF, "h3");
        correo.putClientProperty(FLATLAF, "h3");
        soporte.putClientProperty(FLATLAF, "h3");
    }

    public static void estiloAgregarFactura(JLabel titulo, JLabel nro, JLabel fecha, JLabel barra, JLabel marca) {
        titulo.putClientProperty(FLATLAF, "h1");
        nro.putClientProperty(FLATLAF, "h3");
        fecha.putClientProperty(FLATLAF, "h3");
        barra.putClientProperty(FLATLAF, "h3");
        marca.putClientProperty(FLATLAF, "h3");

        titulo.setForeground(Color.BLACK);
        nro.setForeground(Color.BLACK);
        fecha.setForeground(Color.BLACK);
        barra.setForeground(Color.BLACK);
        marca.setForeground(Color.BLACK);
    }

    public static void estiloBuscarFactura(JLabel titulo, JLabel campo) {
        titulo.putClientProperty(FLATLAF, "h1");
        campo.putClientProperty(FLATLAF, "h3");
        titulo.setForeground(Color.BLACK);
        campo.setForeground(Color.BLACK);
    }

    public static void estiloReporteCliente(JLabel titulo) {
        titulo.putClientProperty(FLATLAF, "h2");
        titulo.setForeground(Color.BLACK);
    }
}
