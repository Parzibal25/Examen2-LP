package com.examen2.examen2.servicios;

import java.util.List;

import com.examen2.examen2.modelos.Cliente;

public interface CrearClienteService {

    public Cliente crearCliente(Cliente nvoCliente);

    public List<Cliente> obtenerTodos();

    public Cliente obtenerClienteId(int id);

}
