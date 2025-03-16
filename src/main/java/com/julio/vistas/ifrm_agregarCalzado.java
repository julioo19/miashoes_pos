/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.julio.vistas;

import com.julio.controladores.C_cargarMarcas;
import com.julio.modelos.Marca;
import com.julio.utils.fontStyles;

/**
 *
 * @author ACER
 */
public class ifrm_agregarCalzado extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_agregarCalzado
     */
    public ifrm_agregarCalzado() {
        initComponents();
        initStyles();
        initContent();
    }

    private void initStyles(){
        fontStyles.estilosAgregarCalzado(lbl_titulo ,lbl_barras, lbl_ref, lbl_color, lbl_material, lbl_stock, lbl_marca);
    }
    
    private void initContent(){
        C_cargarMarcas cargarMarcas = new C_cargarMarcas(cb_marca);
        cargarMarcas.llenarComboMarca();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_agregarCalzado = new javax.swing.JPanel();
        pnl_encabezado = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_agregarContent = new javax.swing.JPanel();
        lbl_barras = new javax.swing.JLabel();
        txt_barras = new javax.swing.JTextField();
        lbl_ref = new javax.swing.JLabel();
        txt_ref = new javax.swing.JTextField();
        lbl_color = new javax.swing.JLabel();
        txt_color = new javax.swing.JTextField();
        lbl_material = new javax.swing.JLabel();
        txt_material = new javax.swing.JTextField();
        lbl_stock = new javax.swing.JLabel();
        sp_stock = new javax.swing.JSpinner();
        lbl_marca = new javax.swing.JLabel();
        cb_marca = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar Calzado");

        pnl_agregarCalzado.setBackground(new java.awt.Color(190, 220, 255));

        pnl_encabezado.setBackground(new java.awt.Color(220, 240, 255));
        pnl_encabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_titulo.setText("**Inserte los datos del calzado**");

        javax.swing.GroupLayout pnl_encabezadoLayout = new javax.swing.GroupLayout(pnl_encabezado);
        pnl_encabezado.setLayout(pnl_encabezadoLayout);
        pnl_encabezadoLayout.setHorizontalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_encabezadoLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbl_titulo)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        pnl_encabezadoLayout.setVerticalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_encabezadoLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(41, 41, 41))
        );

        pnl_agregarContent.setBackground(new java.awt.Color(255, 255, 255));
        pnl_agregarContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_barras.setText("Codigo de Barras");

        txt_barras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_ref.setText("Referencia");

        txt_ref.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_color.setText("Color");

        txt_color.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_material.setText("Material");

        txt_material.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_stock.setText("Stock");

        sp_stock.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        sp_stock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_marca.setText("Marca");

        cb_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_agregarContentLayout = new javax.swing.GroupLayout(pnl_agregarContent);
        pnl_agregarContent.setLayout(pnl_agregarContentLayout);
        pnl_agregarContentLayout.setHorizontalGroup(
            pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agregarContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_barras)
                    .addComponent(lbl_ref)
                    .addComponent(lbl_color)
                    .addComponent(lbl_material)
                    .addComponent(lbl_stock)
                    .addComponent(lbl_marca))
                .addGap(18, 18, 18)
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_barras)
                        .addComponent(txt_ref)
                        .addComponent(txt_color)
                        .addComponent(txt_material)
                        .addComponent(sp_stock)
                        .addComponent(cb_marca, 0, 163, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_agregarContentLayout.setVerticalGroup(
            pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agregarContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barras)
                    .addComponent(txt_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ref)
                    .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_color))
                .addGap(18, 18, 18)
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_material)
                    .addComponent(txt_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_stock)
                    .addComponent(sp_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_agregarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_marca)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout pnl_agregarCalzadoLayout = new javax.swing.GroupLayout(pnl_agregarCalzado);
        pnl_agregarCalzado.setLayout(pnl_agregarCalzadoLayout);
        pnl_agregarCalzadoLayout.setHorizontalGroup(
            pnl_agregarCalzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agregarCalzadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_agregarCalzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_agregarContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_agregarCalzadoLayout.setVerticalGroup(
            pnl_agregarCalzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agregarCalzadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_agregarContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_agregarCalzado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_agregarCalzado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<Marca> cb_marca;
    private javax.swing.JLabel lbl_barras;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_material;
    private javax.swing.JLabel lbl_ref;
    private javax.swing.JLabel lbl_stock;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_agregarCalzado;
    private javax.swing.JPanel pnl_agregarContent;
    private javax.swing.JPanel pnl_encabezado;
    private javax.swing.JSpinner sp_stock;
    private javax.swing.JTextField txt_barras;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_material;
    private javax.swing.JTextField txt_ref;
    // End of variables declaration//GEN-END:variables
}
