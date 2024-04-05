package hn.unah.lenguajes1900.carwash.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.demo.entities.Cliente;
import hn.unah.lenguajes1900.carwash.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1900.carwash.demo.services.ClienteService;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
       return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(long idCliente) {
        return this.clienteRepository.findById(idCliente).get();
    }
    
}
