package hn.unah.lenguajes1900.carwash.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.demo.services.impl.ReservaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;





@RestController
@RequestMapping("/api")

public class ReservaController {
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/reserva/crear")
    public String crearReserva(@RequestParam long idCliente,@RequestParam long idVehiculo, @RequestParam long dias) {
        return this.reservaServiceImpl.crearReserva(idCliente, idVehiculo, dias);
    }
    
}
