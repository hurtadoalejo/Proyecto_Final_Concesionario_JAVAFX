package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;

public class IngresarConcesionarioController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase IngresarConcesionarioController
     * @param concesionario Concesionario de la clase IngresarConcesionarioController
     */
    public IngresarConcesionarioController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para autenticar un codigo dado
     * @return Booleano sobre si la autenticacion fue exitosa o no
     */
    public boolean autenticarCodigo(int codigo){
        return concesionario.autenticar(codigo);
    }
}
