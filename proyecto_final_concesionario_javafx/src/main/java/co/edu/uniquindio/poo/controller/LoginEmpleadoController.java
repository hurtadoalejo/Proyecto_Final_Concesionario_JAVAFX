package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class LoginEmpleadoController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase LoginEmpleadoController
     * @param concesionario Concesionario de la clase LoginEmpleadoController
     */
    public LoginEmpleadoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para obtener un empleado si tiene el mismo usuario y codigo que uno entregado
     * @param usuario Usuario entregado
     * @param codigo Codigo entregado
     * @return Empleado si cumple la condicion o null
     */
    public Empleado obtenerUsuarioEmpleado(String usuario, int codigo){
        Empleado empleado;
        empleado = concesionario.obtenerUsuarioEmpleado(usuario, codigo);
        return empleado;
    }
}