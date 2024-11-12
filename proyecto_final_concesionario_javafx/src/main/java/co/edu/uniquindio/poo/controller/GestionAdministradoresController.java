package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Sede;

public class GestionAdministradoresController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionAdministradoresController
     * @param concesionario Concesionario de la clase GestionAdministradoresController
     */
    public GestionAdministradoresController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para crear un administrador
     * @param administrador Administrador que se busca crear
     * @return Booleanos sobre si se puede crear el administrador o no
     */
    public boolean crearAdministrador(Administrador administrador){
        return concesionario.agregarAdministrador(administrador);
    }

    /**
     * Metodo para obtener la lista de administradores del concesionario
     * @return Coleccion de administradores del concesionario
     */
    public Collection<Administrador> obtenerListaAdministradores(){
        return concesionario.getListaAdministradores();
    }

    /**
     * Metodo para obtener la lista de sedes del concesionario
     * @return Coleccion de sedes del concesionario
     */
    public Collection<Sede> obtenerListaSedes(){
        return concesionario.getListaSedes();
    }

    /**
     * Metodo para eliminar un administrador
     * @param identificacion Identificacion del administrador que se busca eliminar
     * @return Booleano sobre si se pudo eliminar el administrador o no
     */
    public boolean eliminarAdministrador(String identificacion){
        return concesionario.eliminarAdministrador(identificacion);
    }

    /**
     * Metodo para actualizar un administrador
     * @param identificacion Identificacion del administrador que se busca actualizar
     * @param administradorNuevo Administrador con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el administrador o no
     */
    public boolean actualizarAdministrador(String identificacion, Administrador administradorNuevo){
        return concesionario.actualizarAdministrador(identificacion, administradorNuevo);
    }

    /**
     * Metodo para verificar si la sede tiene un administrador relacionado o no
     * @param sede Sede que se busca verificar
     * @return Booleano sobre si la sede esta libre o no
     */
    public boolean verificarSedeLibre(Sede sede){
        return concesionario.verificarSedeLibre(sede);
    }
}