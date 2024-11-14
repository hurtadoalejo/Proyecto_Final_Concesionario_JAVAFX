package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;

public class GestionReportesController {
    Administrador administrador;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionReportesController
     * @param administrador Administrador de la clase GestionReportesController
     * @param concesionario Concesionario de la clase GestionReportesController
     */
    public GestionReportesController(Administrador administrador, Concesionario concesionario) {
        this.administrador = administrador;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para obtener la lista de empleados de la sede del administrador
     * @return Coleccion de empleados de la sede del administrador
     */
    public Collection<Empleado> obtenerListaEmpleados(){
        return administrador.getSede().getListaEmpleados();
    }

    /**
     * Metodo para obtener la lista de reportes de la sede del administrador
     * @return Coleccion de reportes de la sede del administrador
     */
    public Collection<Reporte> obtenerListaReportes(){
        return administrador.getSede().getListaReportes();
    }

    /**
     * Metodo para crear un reporte
     * @param reporte Reporte que se busca crear
     * @return Booleano sobre si se puede crear el reporte o no
     */
    public boolean crearReporte(Reporte reporte){
        return administrador.agregarReporte(reporte);
    }

    /**
     * Metodo para eliminar un reporte
     * @param codigo Codigo del reporte a eliminar
     * @return Booleano sobre si se pudo eliminar el reporte o no
     */
    public boolean eliminarReporte(int codigo){
        return administrador.eliminarReporte(codigo);
    }
}