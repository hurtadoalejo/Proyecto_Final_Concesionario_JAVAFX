package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class MenuEmpleadoController {
    Concesionario concesionario;
    Empleado empleado;

    /**
     * Metodo constructor de la clase MenuEmpleadoController
     * @param empleado Empleado de la clase MenuEmpleadoController
     * @param concesionario Concesionario de la clase MenuEmpleadoController
     */
    public MenuEmpleadoController(Concesionario concesionario, Empleado empleado) {
        this.concesionario = concesionario;
        this.empleado = empleado;
    }

    /**
     * Metodo para cerrar la sesion del empleado
     */
    public void cerrarSesion(){
        empleado.cerrarSesion();
    }
}
