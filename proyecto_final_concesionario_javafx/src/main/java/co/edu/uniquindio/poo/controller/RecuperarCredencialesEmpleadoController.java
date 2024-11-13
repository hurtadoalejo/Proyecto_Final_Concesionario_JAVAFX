package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;

public class RecuperarCredencialesEmpleadoController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase RecuperarCredencialesEmpleadoController
     * @param concesionario Concesionario de la clase RecuperarCredencialesEmpleadoController
     */
    public RecuperarCredencialesEmpleadoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para cambiar las credenciales de un empleado
     * @param cedula Cedula del empleado
     * @param respuesta Respuesta de la pregunta de seguridad del empleado
     * @param usuario Nuevo usuario del empleado
     * @param password Nueva contraseña del empleado
     * @return Booleano sobre si se pudo o no cambiar las credenciales del empleado
     */
    public boolean cambiarCredencialesEmpleado(String cedula, String respuesta, String usuario, int codigo){
        return concesionario.cambiarCredencialesEmpleado(cedula, respuesta, usuario, codigo);
    }
}