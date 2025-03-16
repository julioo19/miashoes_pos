/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.julio.vistas;

import com.julio.utils.fontStyles;

/**
 *
 * @author ACER
 */
public class ifrm_buscarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_buscarFactura
     */
    public ifrm_buscarFactura() {
        initComponents();
        initStyles();
    }
    
    private void initStyles(){
        fontStyles.estiloBuscarFactura(lbl_titulo, lbl_campo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_encabezado = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_content = new javax.swing.JPanel();
        lbl_campo = new javax.swing.JLabel();
        txt_campo = new javax.swing.JTextField();
        rb_factura = new javax.swing.JRadioButton();
        rb_referencia = new javax.swing.JRadioButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_facturaResul = new javax.swing.JTable();

        setClosable(true);
        setTitle("Busqueda de Factura");

        pnl_encabezado.setBackground(new java.awt.Color(242, 0, 242));
        pnl_encabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_titulo.setText("Buscar Factura");

        javax.swing.GroupLayout pnl_encabezadoLayout = new javax.swing.GroupLayout(pnl_encabezado);
        pnl_encabezado.setLayout(pnl_encabezadoLayout);
        pnl_encabezadoLayout.setHorizontalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_encabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_encabezadoLayout.setVerticalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_encabezadoLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addContainerGap())
        );

        pnl_content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_campo.setText("Rellene el campo");

        txt_campo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rb_factura.setText("Nro Factura");

        rb_referencia.setText("Referencia");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/búsqueda-24.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_contentLayout = new javax.swing.GroupLayout(pnl_content);
        pnl_content.setLayout(pnl_contentLayout);
        pnl_contentLayout.setHorizontalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_contentLayout.createSequentialGroup()
                        .addComponent(lbl_campo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rb_factura)
                    .addComponent(rb_referencia)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnl_contentLayout.setVerticalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_campo)
                    .addComponent(txt_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rb_factura)
                .addGap(18, 18, 18)
                .addComponent(rb_referencia)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_facturaResul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_facturaResul);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_campo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_content;
    private javax.swing.JPanel pnl_encabezado;
    private javax.swing.JRadioButton rb_factura;
    private javax.swing.JRadioButton rb_referencia;
    private javax.swing.JTable tbl_facturaResul;
    private javax.swing.JTextField txt_campo;
    // End of variables declaration//GEN-END:variables
}
