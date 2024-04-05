package hn.unah.lenguajes1900.carwash.demo.services;

import java.util.List;

import hn.unah.lenguajes1900.carwash.demo.entities.Vehiculo;

public interface VehiculoService {
    public Vehiculo crearVehiculo(Vehiculo vehiculo);
    public List<Vehiculo> obtenerVehiculos();
    public Vehiculo obtenerVehiculoPorId(long idVehiculo);
}
