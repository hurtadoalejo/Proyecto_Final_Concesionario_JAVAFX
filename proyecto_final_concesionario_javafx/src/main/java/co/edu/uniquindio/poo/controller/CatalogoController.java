package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;

public class CatalogoController {
    Concesionario concesionario;
  
    /**
     * Metodo constructor de la clase CatalogoController
     * @param concesionario Concesionario de la clase CatalogoController
     */
    public CatalogoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para obtener la lista de vehiculos del concesionario
     * @return Coleccion de vehiculos del concesionario
     */
    public Collection<Vehiculo> obtenerListaVehiculos(){
        return concesionario.getListaVehiculos();
    }
}