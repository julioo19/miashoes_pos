/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.julio.vistas;

import com.julio.dao.DAOClienteImple;
import com.julio.interfaces.DAOCliente;
import com.julio.modelos.Cliente;
import com.julio.utils.fontStyles;
import com.julio.utils.guiStyles;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ifrm_modificarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrm_modificarCliente
     */
    public ifrm_modificarCliente() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        fontStyles.estiloModificarCliente(lbl_titulo, lbl_nombre, lbl_nro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_modificarCliente = new javax.swing.JPanel();
        pnl_encabezado = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_buscar = new javax.swing.JPanel();
        lbl_dni = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        pnl_modificarContent = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_nro = new javax.swing.JLabel();
        txt_nro = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();

        setClosable(true);

        pnl_modificarCliente.setBackground(new java.awt.Color(245, 240, 160));

        pnl_encabezado.setBackground(new java.awt.Color(250, 255, 220));
        pnl_encabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_titulo.setText("**Modifique el cliente**");

        javax.swing.GroupLayout pnl_encabezadoLayout = new javax.swing.GroupLayout(pnl_encabezado);
        pnl_encabezado.setLayout(pnl_encabezadoLayout);
        pnl_encabezadoLayout.setHorizontalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_encabezadoLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_encabezadoLayout.setVerticalGroup(
            pnl_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_encabezadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_titulo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnl_buscar.setBackground(new java.awt.Color(255, 255, 255));
        pnl_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_dni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/identificacion-30.png"))); // NOI18N

        txt_dni.setBackground(new java.awt.Color(245, 240, 160));
        txt_dni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_dni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/búsqueda-24.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_buscarLayout = new javax.swing.GroupLayout(pnl_buscar);
        pnl_buscar.setLayout(pnl_buscarLayout);
        pnl_buscarLayout.setHorizontalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_buscarLayout.setVerticalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_buscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar)
                    .addComponent(lbl_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_dni)
                .addGap(9, 9, 9))
        );

        pnl_modificarContent.setBackground(new java.awt.Color(255, 255, 255));
        pnl_modificarContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nombre.setText("Nombre");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nro.setText("Telefono");

        txt_nro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar-30.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_modificarContentLayout = new javax.swing.GroupLayout(pnl_modificarContent);
        pnl_modificarContent.setLayout(pnl_modificarContentLayout);
        pnl_modificarContentLayout.setHorizontalGroup(
            pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                        .addComponent(lbl_nombre)
                        .addGap(97, 97, 97)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                        .addComponent(lbl_nro)
                        .addGap(95, 95, 95)
                        .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nro)
                            .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        pnl_modificarContentLayout.setVerticalGroup(
            pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarContentLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnl_modificarContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nro)
                    .addComponent(txt_nro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_modificarClienteLayout = new javax.swing.GroupLayout(pnl_modificarCliente);
        pnl_modificarCliente.setLayout(pnl_modificarClienteLayout);
        pnl_modificarClienteLayout.setHorizontalGroup(
            pnl_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_modificarContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_modificarClienteLayout.setVerticalGroup(
            pnl_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_modificarContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_modificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_modificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscarDNI();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        modificarCliente();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void buscarDNI() {
        String dni = txt_dni.getText().trim().toUpperCase();
        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un codigo de barra", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            DAOCliente dao = new DAOClienteImple();
            Cliente cliente_obtenido = dao.getClienteId(dni);
            if (cliente_obtenido == null) {
                int reply = JOptionPane.showConfirmDialog(null,
                        "No existe el dni del cliente en la base de datos.\n¿Desea agregar a este cliente?",
                        "AVISO", JOptionPane.YES_NO_CANCEL_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    ifrm_agregarCliente agregarCliente = new ifrm_agregarCliente();
                    guiStyles.centrarInternalVentana(frm_menu.dp_menu, agregarCliente);
                }
                return;
            }
            txt_nombre.setText(cliente_obtenido.getNombre_cliente());
            txt_nro.setText(cliente_obtenido.getNro_telefono());
            txt_dni.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void modificarCliente() {
        if (!validarCampos()) {
            return;
        }
        String dni = txt_dni.getText().trim().toUpperCase();
        String nombre = txt_nombre.getText().trim().toUpperCase();
        String nro = txt_nro.getText().trim().toUpperCase();
        Cliente cliente = new Cliente();
        cliente.setNombre_cliente(nombre);
        cliente.setNro_telefono(nro);
        cliente.setDni_id(dni);
        try {
            DAOCliente dao = new DAOClienteImple();
            dao.modificarCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente modificado correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            txt_dni.setEnabled(true);
            limpiarCaja();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private boolean validarCampos() {
        if (txt_dni.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe poner un DNI", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txt_nombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe poner un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txt_nro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe poner un numero de celular", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void limpiarCaja() {
        txt_dni.setText("");
        txt_nombre.setText("");
        txt_nro.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nro;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JPanel pnl_encabezado;
    private javax.swing.JPanel pnl_modificarCliente;
    private javax.swing.JPanel pnl_modificarContent;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nro;
    // End of variables declaration//GEN-END:variables
}
