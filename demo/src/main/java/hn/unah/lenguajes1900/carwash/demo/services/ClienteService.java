package hn.unah.lenguajes1900.carwash.demo.services;

import java.util.List;

import hn.unah.lenguajes1900.carwash.demo.entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);
    public List<Cliente> obtenerClientes();
    public Cliente obtenerClientePorId(long idCliente);
    
}
