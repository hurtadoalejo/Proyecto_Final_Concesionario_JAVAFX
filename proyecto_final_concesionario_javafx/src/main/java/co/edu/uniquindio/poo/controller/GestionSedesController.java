package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Sede;

public class GestionSedesController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionSedeController
     * @param concesionario Concesionario de la GestionSedeController a crear
     */
    public GestionSedesController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }
    /**
     * Metodo para crear una sede
     * @param sede Sede que se busca crear
     * @return Booleano sobre si se pudo crear la sede o no
     */
    public boolean crearSede(Sede sede){
        return concesionario.agregarSede(sede);
    }
    /**
     * Metodo para obtener la lista de sedes del concesionario
     * @return Coleccion de sedes del concesionario
     */
    public Collection<Sede> obtenerListaSedes(){
        return concesionario.getListaSedes();
    }
    /**
     * Metodo para eliminar una sede
     * @param codigo Codigo de la sede que se busca eliminar
     * @return Booleano sobre si se pudo eliminar la sede o no
     */
    public boolean eliminarSede(int codigo){
        return concesionario.eliminarSede(codigo);
    }
    /**
     * Metodo para actualizar una sede
     * @param codigo Codigo de la sede a actualizar
     * @param sede Sede con los datos nuevos
     * @return Booleanos sobre si se pudo actualizar o no
     */
    public boolean actualizarSede(int codigo, Sede sede){
        return concesionario.actualizarSede(codigo, sede);
    }
}