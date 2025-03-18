/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.Calzado;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface DAOCalzado {
    public void registrarCalzado (Calzado calzado) throws Exception;
    public void modificarCalzado (Calzado calzado) throws Exception;
    public List<Calzado> listarCalzado(String campo) throws Exception;
}
