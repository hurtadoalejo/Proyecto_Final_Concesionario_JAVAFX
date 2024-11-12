package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Sede;

public class GestionSedesController {
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase SedeController
     * @param concesionario Concesionario de la sede controller a crear
     */
    public GestionSedesController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public boolean crearSede(Sede sede){
        return concesionario.agregarSede(sede);
    }
    public Collection<Sede> obtenerListaSedes(){
        return concesionario.getListaSedes();
    }
    public boolean eliminarSede(int codigo){
        return concesionario.eliminarSede(codigo);
    }
    public boolean actualizarSede(int codigo, Sede sede){
        return concesionario.actualizarSede(codigo, sede);
    }
}