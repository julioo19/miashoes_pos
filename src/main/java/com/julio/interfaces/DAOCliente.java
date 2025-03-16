/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.Cliente;

/**
 *
 * @author ACER
 */
public interface DAOCliente {
    public void registarCliente(Cliente cliente) throws Exception;
    public void modificarCliente(Cliente cliente) throws Exception;
}
