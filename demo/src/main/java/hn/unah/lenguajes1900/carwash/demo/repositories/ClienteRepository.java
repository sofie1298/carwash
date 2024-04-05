package hn.unah.lenguajes1900.carwash.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.carwash.demo.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long>{
    
}
