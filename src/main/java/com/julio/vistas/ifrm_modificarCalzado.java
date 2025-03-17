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
public class ifrm_modificarCalzado extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_modificarCalzado
     */
    public ifrm_modificarCalzado() {
        initComponents();
        initStyles();
        initContent();
    }

    private void initStyles(){
        fontStyles.estiloModificarCalzado(lbl_titulo, lbl_ref, lbl_color, lbl_material, lbl_stock, lbl_marca);
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

        pnl_modificarCalzado = new javax.swing.JPanel();
        pnl_encabezado = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_busqueda = new javax.swing.JPanel();
        lbl_barra = new javax.swing.JLabel();
        txt_barra = new javax.swing.JTextField();
        btn_abrirBusqueda = new javax.swing.JButton();
        pnl_modificarContent = new javax.swing.JPanel();
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
        btn_actualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Modificar Calzado");

        pnl_modificarCalzado.setBackground(new java.awt.Color(245, 240, 160));

        pnl_encabezado.setBackground(new java.awt.Color(250, 255, 220));
        pnl_encabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_titulo.setText("**Modifique el calzado**");

        javax.swing.GroupLayout pnl_encabezadoLayout = new javax.swing.GroupLayout(pnl_encabezado);
        pnl_encabezado.setLayout(pnl_encabezadoLayout);
        pnl_encabezadoLayout.setHorizontalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_encabezadoLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_encabezadoLayout.setVerticalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_encabezadoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_titulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnl_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        pnl_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/código-de-barras-30.png"))); // NOI18N

        txt_barra.setBackground(new java.awt.Color(245, 240, 160));
        txt_barra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_barra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_abrirBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_abrirBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/búsqueda-24.png"))); // NOI18N
        btn_abrirBusqueda.setText("Buscar por referencia");
        btn_abrirBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_busquedaLayout = new javax.swing.GroupLayout(pnl_busqueda);
        pnl_busqueda.setLayout(pnl_busquedaLayout);
        pnl_busquedaLayout.setHorizontalGroup(
            pnl_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_barra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_abrirBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_busquedaLayout.setVerticalGroup(
            pnl_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_abrirBusqueda))
                    .addComponent(lbl_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnl_modificarContent.setBackground(new java.awt.Color(255, 255, 255));
        pnl_modificarContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_ref.setText("Referencia");

        txt_ref.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_ref.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_color.setText("Color");
        lbl_color.setToolTipText("");

        txt_color.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_color.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_material.setText("Material");
        lbl_material.setToolTipText("");

        txt_material.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_material.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_stock.setText("Stock");

        sp_stock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sp_stock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_marca.setText("Marca");

        cb_marca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar-30.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_modificarContentLayout = new javax.swing.GroupLayout(pnl_modificarContent);
        pnl_modificarContent.setLayout(pnl_modificarContentLayout);
        pnl_modificarContentLayout.setHorizontalGroup(
            pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                        .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_material)
                            .addComponent(lbl_stock)
                            .addComponent(lbl_marca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_material, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_stock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                        .addComponent(lbl_ref)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                        .addComponent(lbl_color)
                        .addGap(101, 101, 101)
                        .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnl_modificarContentLayout.setVerticalGroup(
            pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ref)
                    .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_color)
                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_material)
                            .addComponent(txt_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_stock)
                            .addComponent(sp_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_marca)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_modificarCalzadoLayout = new javax.swing.GroupLayout(pnl_modificarCalzado);
        pnl_modificarCalzado.setLayout(pnl_modificarCalzadoLayout);
        pnl_modificarCalzadoLayout.setHorizontalGroup(
            pnl_modificarCalzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarCalzadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_modificarCalzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_modificarContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_modificarCalzadoLayout.setVerticalGroup(
            pnl_modificarCalzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarCalzadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_modificarContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_modificarCalzado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_modificarCalzado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrirBusqueda;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JComboBox<Marca> cb_marca;
    private javax.swing.JLabel lbl_barra;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_material;
    private javax.swing.JLabel lbl_ref;
    private javax.swing.JLabel lbl_stock;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_busqueda;
    private javax.swing.JPanel pnl_encabezado;
    private javax.swing.JPanel pnl_modificarCalzado;
    private javax.swing.JPanel pnl_modificarContent;
    private javax.swing.JSpinner sp_stock;
    private javax.swing.JTextField txt_barra;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_material;
    private javax.swing.JTextField txt_ref;
    // End of variables declaration//GEN-END:variables
}
