package hn.unah.lenguajes1900.carwash.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.carwash.demo.entities.TipoVehiculo;
@Repository
public interface TipoVehiculoRepository extends CrudRepository<TipoVehiculo,Long> {
    
}
