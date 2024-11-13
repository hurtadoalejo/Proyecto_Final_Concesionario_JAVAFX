package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Administrador;

public class LoginAdminController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase LoginAdminController
     * @param concesionario Concesionario de la clase LoginAdminController
     */
    public LoginAdminController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para obtener un administrador si tiene el mismo usuario y codigo que uno entregado
     * @param usuario Usuario entregado
     * @param codigo Codigo entregado
     * @return Administrador si cumple la condicion o null
     */
    public Administrador obtenerUsuarioAdmin(String usuario, int codigo){
        Administrador administrador;
        administrador = concesionario.obtenerUsuarioAdministrador(usuario, codigo);
        return administrador;
    }
}