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
public class ifrm_agregarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_agregarFactura
     */
    public ifrm_agregarFactura() {
        initComponents();
        initStyles();
    }
    
    private void initStyles(){
        fontStyles.estiloAgregarFactura(lbl_titulo, lbl_factura, lbl_fecha, lbl_barra, lbl_marca);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_registrarSeparado = new javax.swing.JPanel();
        pnl_encabezado = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_contenido = new javax.swing.JPanel();
        lbl_factura = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_barra = new javax.swing.JLabel();
        lbl_marca = new javax.swing.JLabel();
        txt_barra = new javax.swing.JTextField();
        btn_buscarRef = new javax.swing.JButton();
        dc_fechaEmision = new com.toedter.calendar.JDateChooser();
        txt_factura = new javax.swing.JTextField();
        cb_marca = new javax.swing.JComboBox<>();
        btn_agregarTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_detalleFactura = new javax.swing.JTable();
        pnl_pie = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        pnl_pie2 = new javax.swing.JPanel();
        btn_guardar2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registrar Factura");

        pnl_registrarSeparado.setBackground(new java.awt.Color(255, 255, 255));

        pnl_encabezado.setBackground(new java.awt.Color(0, 242, 242));
        pnl_encabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_titulo.setText("Ingrese los datos de la factura");

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

        pnl_contenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_factura.setText("Nro Factura");
        lbl_factura.setToolTipText("");

        lbl_fecha.setText("Fecha Emision");

        lbl_barra.setText("Codigo de Barras");

        lbl_marca.setText("Marca");

        txt_barra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_buscarRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/busqueda-14.png"))); // NOI18N
        btn_buscarRef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dc_fechaEmision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dc_fechaEmision.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txt_factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cb_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_agregarTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_agregarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/añadir-30.png"))); // NOI18N
        btn_agregarTabla.setText("Agregar");
        btn_agregarTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_contenidoLayout = new javax.swing.GroupLayout(pnl_contenido);
        pnl_contenido.setLayout(pnl_contenidoLayout);
        pnl_contenidoLayout.setHorizontalGroup(
            pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_contenidoLayout.createSequentialGroup()
                        .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_barra)
                            .addComponent(lbl_fecha)
                            .addComponent(lbl_marca)
                            .addComponent(lbl_factura))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_factura)
                            .addComponent(dc_fechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txt_barra)
                            .addComponent(cb_marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarRef)))
                .addGap(50, 50, Short.MAX_VALUE))
        );
        pnl_contenidoLayout.setVerticalGroup(
            pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_factura)
                    .addComponent(txt_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_fecha)
                    .addComponent(dc_fechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarRef)
                    .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barra)
                        .addComponent(txt_barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(pnl_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_marca)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btn_agregarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_detalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° FACTURA", "REF", "COLOR", "MATERIAL", "FECHA"
            }
        ));
        jScrollPane1.setViewportView(tbl_detalleFactura);

        pnl_pie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save-30.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_pieLayout = new javax.swing.GroupLayout(pnl_pie);
        pnl_pie.setLayout(pnl_pieLayout);
        pnl_pieLayout.setHorizontalGroup(
            pnl_pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_pieLayout.setVerticalGroup(
            pnl_pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_pie2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_guardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-30.png"))); // NOI18N
        btn_guardar2.setText("Borrar seleccion");
        btn_guardar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_pie2Layout = new javax.swing.GroupLayout(pnl_pie2);
        pnl_pie2.setLayout(pnl_pie2Layout);
        pnl_pie2Layout.setHorizontalGroup(
            pnl_pie2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pie2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_pie2Layout.setVerticalGroup(
            pnl_pie2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pie2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_registrarSeparadoLayout = new javax.swing.GroupLayout(pnl_registrarSeparado);
        pnl_registrarSeparado.setLayout(pnl_registrarSeparadoLayout);
        pnl_registrarSeparadoLayout.setHorizontalGroup(
            pnl_registrarSeparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registrarSeparadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_registrarSeparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_registrarSeparadoLayout.createSequentialGroup()
                        .addComponent(pnl_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_registrarSeparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_registrarSeparadoLayout.createSequentialGroup()
                                .addComponent(pnl_pie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnl_pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_registrarSeparadoLayout.setVerticalGroup(
            pnl_registrarSeparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registrarSeparadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_registrarSeparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_registrarSeparadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_registrarSeparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_pie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addComponent(pnl_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_registrarSeparado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_registrarSeparado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarTabla;
    private javax.swing.JButton btn_buscarRef;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JComboBox<String> cb_marca;
    private com.toedter.calendar.JDateChooser dc_fechaEmision;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_barra;
    private javax.swing.JLabel lbl_factura;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_contenido;
    private javax.swing.JPanel pnl_encabezado;
    private javax.swing.JPanel pnl_pie;
    private javax.swing.JPanel pnl_pie1;
    private javax.swing.JPanel pnl_pie2;
    private javax.swing.JPanel pnl_registrarSeparado;
    private javax.swing.JTable tbl_detalleFactura;
    private javax.swing.JTextField txt_barra;
    private javax.swing.JTextField txt_factura;
    // End of variables declaration//GEN-END:variables
}
