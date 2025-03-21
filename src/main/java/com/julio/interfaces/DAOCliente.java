/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.julio.interfaces;

import com.julio.modelos.Cliente;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface DAOCliente {
    public void registarCliente(Cliente cliente) throws Exception;
    public void modificarCliente(Cliente cliente) throws Exception;
    public List<Cliente> listarCliente(String campo) throws Exception;
    public Cliente getClienteId (String dni) throws Exception;
}
