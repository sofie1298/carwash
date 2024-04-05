package hn.unah.lenguajes1900.carwash.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.demo.entities.Vehiculo;
import hn.unah.lenguajes1900.carwash.demo.services.impl.VehiculoServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;







@RestController
@RequestMapping("/api")
public class VehiculoController {
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/vehiculo/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
       return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/vehiculo/obtenerTodos")
    public List<Vehiculo> obtenerVehiculos() {
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }
    
    @GetMapping("/vehiculo/obtenerPorId")
    public Vehiculo obtenerVehiculoPorId(@RequestParam long idVehiculo) {
        return this.vehiculoServiceImpl.obtenerVehiculoPorId(idVehiculo);
    }
    
    
}
