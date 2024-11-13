package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;

public class RecuperarCredencialesAdminController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase RecuperarCredencialesAdminController
     * @param concesionario Concesionario de la clase RecuperarCredencialesAdminController
     */
    public RecuperarCredencialesAdminController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para cambiar las credenciales de un administrador
     * @param cedula Cedula del administrador
     * @param respuesta Respuesta de la pregunta de seguridad del administrador
     * @param usuario Nuevo usuario del administrador
     * @param password Nueva contraseña del administrador
     * @return Booleano sobre si se pudo o no cambiar las credenciales del administrador
     */
    public boolean cambiarCredencialesAdmin(String cedula, String respuesta, String usuario, int codigo){
        return concesionario.cambiarCredencialesAdmin(cedula, respuesta, usuario, codigo);
    }
}