package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class GestionEmpleadoController {
    Administrador administrador;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase MenuAdminController
     * @param administrador Administrador de la clase MenuAdminController
     * @param concesionario Concesionario de la clase MenuAdminController
     */
    public GestionEmpleadoController(Administrador administrador, Concesionario concesionario) {
        this.administrador = administrador;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para crear un empleado
     * @param empleado Empleado que se busca crear
     * @return Booleanos sobre si se puede crear el empleado o no
     */
    public boolean crearEmpleado(Empleado empleado){
        return administrador.agregarEmpleado(empleado);
    }

    /**
     * Metodo para obtener la lista de empleados del concesionario
     * @return Coleccion de empleados del concesionario
     */
    public Collection<Empleado> obtenerListaEmpleados(){
        return administrador.getSede().getListaEmpleados();
    }

    /**
     * Metodo para eliminar un empleado
     * @param identificacion Identificacion del empleado que se busca eliminar
     * @return Booleano sobre si se pudo eliminar el empleado o no
     */
    public boolean eliminarEmpleado(String identificacion){
        return administrador.eliminarEmpleado(identificacion);
    }

    /**
     * Metodo para actualizar un empleado
     * @param identificacion Identificacion del empleado que se busca actualizar
     * @param empleadoNuevo Empleado con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el empleado o no
     */
    public boolean actualizarEmpleado(String identificacion, Empleado empleadoNuevo){
        return administrador.actualizarEmpleado(identificacion, empleadoNuevo);
    }
}