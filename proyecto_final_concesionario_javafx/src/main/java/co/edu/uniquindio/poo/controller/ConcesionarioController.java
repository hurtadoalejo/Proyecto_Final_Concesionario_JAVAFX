package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;

public class ConcesionarioController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase concesionarioController
     * @param concesionario Concesionario de la clase concesionarioController
     */
    public ConcesionarioController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para cerrar sesion en la autenticacion del concesionario
     */
    public void cerrarSesion(){
        concesionario.cerrarSesion();
    }
}
