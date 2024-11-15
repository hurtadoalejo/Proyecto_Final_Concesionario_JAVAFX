package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Vehiculo;

public class GestionVehiculoController {
    Empleado empleado;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionVehiculoController
     * @param empleado Empleado de la clase GestionVehiculoController
     * @param concesionario Concesionario de la clase GestionVehiculoController
     */
    public GestionVehiculoController(Empleado empleado, Concesionario concesionario) {
        this.empleado = empleado;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para crear un vehiculo
     * @param vehiculo Vehiculo que se busca crear
     * @return Booleano sobre si se puede crear el vehiculo o no
     */
    public boolean crearVehiculo(Vehiculo vehiculo){
        return empleado.agregarVehiculo(vehiculo);
    }

    /**
     * Metodo para obtener la lista de vehiculos de la sede del empleado
     * @return Coleccion de vehiculos del concesionario
     */
    public Collection<Vehiculo> obtenerListaVehiculos(){
        return empleado.getSede().getListaVehiculos();
    }

    /**
     * Metodo para eliminar un vehiculo
     * @param placa Placa del vehiculo que se busca eliminar
     * @return Booleano sobre si se pudo eliminar el vehiculo o no
     */
    public boolean eliminarVehiculo(String placa){
        return empleado.eliminarVehiculo(placa);
    }

    /**
     * Metodo para actualizar un vehiculo
     * @param placa Placa del vehiculo que se busca actualizar
     * @param vehiculoNuevo Vehiculo con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el vehiculo o no
     */
    public boolean actualizarVehiculo(String placa, Vehiculo vehiculoNuevo){
        return empleado.actualizarVehiculo(placa, vehiculoNuevo);
    }
}