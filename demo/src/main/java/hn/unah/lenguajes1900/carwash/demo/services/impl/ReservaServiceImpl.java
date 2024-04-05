package hn.unah.lenguajes1900.carwash.demo.services.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.carwash.demo.entities.Reserva;

import hn.unah.lenguajes1900.carwash.demo.entities.Vehiculo;
import hn.unah.lenguajes1900.carwash.demo.repositories.ReservaRepository;
import hn.unah.lenguajes1900.carwash.demo.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.carwash.demo.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {
@Autowired
private ReservaRepository reservaRepository;

@Autowired
private VehiculoRepository vehiculoRepository;
    @Override
    public String crearReserva(long idCliente, long idVehiculo, long dias) {
        Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo).get();

        if(vehiculo.isDisponible()){
        Reserva nvaReserva = new Reserva();
        nvaReserva.setIdCliente(idCliente);
        nvaReserva.setIdVehiculo(idVehiculo);
        nvaReserva.setFecha(LocalDate.now());
        nvaReserva.setDias(dias);
        nvaReserva.setTotal(vehiculo.getTipoVehiculo().getPrecioXhora()*24*dias);
        this.reservaRepository.save(nvaReserva);
        vehiculo.setDisponible(false);
        vehiculoRepository.save(vehiculo);
        return "Su reserva se realizó exitosamente.";
        }
        return "Vehiculo esta rentado.";

    }
    
    }
    

