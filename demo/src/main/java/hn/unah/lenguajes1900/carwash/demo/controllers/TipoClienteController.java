package hn.unah.lenguajes1900.carwash.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.demo.entities.TipoCliente;

import hn.unah.lenguajes1900.carwash.demo.services.impl.TipoClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/api")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/TipoCliente/crear")
    public TipoCliente crearTipoCliente(@RequestParam String descripcion) {
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
     
    }
    
}
