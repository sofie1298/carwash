package hn.unah.lenguajes1900.carwash.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.carwash.demo.entities.TipoVehiculo;
import hn.unah.lenguajes1900.carwash.demo.services.impl.TipoVehiculoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("api")


public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/tipovehiculo/crear")
public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo){
    return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
}

@DeleteMapping("/tipovehiculo/eliminar")
public String eliminarPorId(@RequestParam long idTipoVehiculo){
    return this.tipoVehiculoServiceImpl.eliminarPorId(idTipoVehiculo);

}

@DeleteMapping("/tipovehiculo/eliminar/{idTipoVehiculo}")
public String eliminarPorCodigo(@PathVariable long idTipoVehiculo){
    return this.tipoVehiculoServiceImpl.eliminarPorId(idTipoVehiculo);

}
}