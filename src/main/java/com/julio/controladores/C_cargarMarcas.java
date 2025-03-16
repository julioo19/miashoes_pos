/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.controladores;

import com.julio.dao.DAOMarcaImple;
import com.julio.interfaces.DAOMarca;
import com.julio.modelos.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class C_cargarMarcas {

    JComboBox<Marca> jmarca;

    public C_cargarMarcas(JComboBox<Marca> jmarca) {
        this.jmarca = jmarca;
    }
    
    public void llenarComboMarca(){
       List<Marca> listaMarcas = getListaMarca();
       if (listaMarcas == null || listaMarcas.isEmpty()){
           JOptionPane.showMessageDialog(null, "No hay marcas cargadas", "Error", JOptionPane.ERROR_MESSAGE);
           return;
       }
       this.jmarca.removeAllItems();
       for(Marca marca : listaMarcas){
           this.jmarca.addItem(marca);
       }
    }

    private List<Marca> getListaMarca() {
        List<Marca> listaMarcas = new ArrayList<>();
        try {
            DAOMarca dao = new DAOMarcaImple();
            listaMarcas = dao.listarMarca();
            return listaMarcas;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo obtener las Marcas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listaMarcas;
    }
}
