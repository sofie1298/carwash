package hn.unah.lenguajes1900.carwash.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.carwash.demo.entities.TipoCliente;
@Repository
public interface TipoClienteRepository extends CrudRepository<TipoCliente,Long>{
    
}
