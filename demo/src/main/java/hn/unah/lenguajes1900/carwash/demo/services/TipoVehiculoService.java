package hn.unah.lenguajes1900.carwash.demo.services;

import hn.unah.lenguajes1900.carwash.demo.entities.TipoVehiculo;


public interface TipoVehiculoService {
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);
    public String eliminarPorId(long idTipoVehiculo);
    public String eliminarPorCodigo(long idTipoVehiculo);
}
