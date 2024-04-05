package hn.unah.lenguajes1900.carwash.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.demo.entities.TipoCliente;
import hn.unah.lenguajes1900.carwash.demo.repositories.TipoClienteRepository;
import hn.unah.lenguajes1900.carwash.demo.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{
    @Autowired
 private TipoClienteRepository tipoClienteRepository;
    @Override
    public  TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente nvoTipoCliente = new TipoCliente();
        nvoTipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(nvoTipoCliente);
    }
    
}
