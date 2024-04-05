package hn.unah.lenguajes1900.carwash.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.demo.entities.Vehiculo;
import hn.unah.lenguajes1900.carwash.demo.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.carwash.demo.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{
    @Autowired
private VehiculoRepository vehiculoRepository;
    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerVehiculoPorId(long idVehiculo) {
       return this.vehiculoRepository.findById(idVehiculo).get();
    }
    
}
