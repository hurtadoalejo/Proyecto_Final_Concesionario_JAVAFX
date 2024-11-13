package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;

public class MenuAdminController {
    Administrador administrador;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase MenuAdminController
     * @param administrador Administrador de la clase MenuAdminController
     * @param concesionario Concesionario de la clase MenuAdminController
     */
    public MenuAdminController(Administrador administrador, Concesionario concesionario) {
        this.administrador = administrador;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para cerrar la sesion del administrador
     */
    public void cerrarSesion(){
        administrador.cerrarSesion();
    }
}
