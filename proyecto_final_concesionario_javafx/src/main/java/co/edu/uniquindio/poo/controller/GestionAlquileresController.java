package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;
import java.util.Collection;

import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class GestionAlquileresController {
    Empleado empleado;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionAlquileresController
     * @param empleado Empleado de la clase GestionAlquileresController
     * @param concesionario Concesionario de la clase GestionAlquileresController
     */
    public GestionAlquileresController(Empleado empleado, Concesionario concesionario) {
        this.empleado = empleado;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para crear un alquiler
     * @param alquiler Alquiler que se busca crear
     * @return Booleano sobre si se pudo crear el alquiler o no
     */
    public boolean crearAlquiler(Alquiler alquiler){
        return empleado.agregarAlquiler(alquiler);
    }

    /**
     * Metodo para actualizar los datos de un alquiler
     * @param codigo Codigo del alquiler a actualizar
     * @param alquiler Alquiler con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el alquiler o no
     */
    public boolean actualizarAlquiler(int codigo, Alquiler alquiler){
        return empleado.actualizarAlquiler(codigo, alquiler);
    }

    /**
     * Metodo para obtener la lista de alquileres de la sede del empleado
     * @return Coleccion de alquileres de la sede del empleado
     */
    public Collection<Alquiler> obtenerListaAlquileres(){
        return empleado.getSede().getListaAlquileres();
    }

    /**
     * Metodo para eliminar un alquiler
     * @param codigo Codigo del alquiler que se busca eliminar
     * @return Booleano sobre si se pudo eliminar el alquiler o no
     */
    public boolean eliminarAlquiler(int codigo){
        return empleado.eliminarAlquiler(codigo);
    }

    /**
     * Metodo para entregar un alquiler
     * @param codigo Codigo del alquiler a entregar
     * @param fechaEntrega Fecha de entrega del alquiler a entregar
     * @return Booleano sobre si se pudo entregar o no el alquiler
     */
    public boolean entregarAlquiler(int codigo, LocalDate fechaEntrega){
        return empleado.entregarAlquiler(codigo, fechaEntrega);
    }
}