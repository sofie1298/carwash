package hn.unah.lenguajes1900.carwash.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.carwash.demo.entities.Vehiculo;
@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo,Long>{
    
}
