package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Venta;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class GestionVentasController {
    Empleado empleado;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionVentasController
     * @param empleado Empleado de la clase GestionVentasController
     * @param concesionario Concesionario de la clase GestionVentasController
     */
    public GestionVentasController(Empleado empleado, Concesionario concesionario) {
        this.empleado = empleado;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para crear una venta
     * @param venta Venta que se busca crear
     * @return Booleano sobre si se pudo crear la venta o no
     */
    public boolean crearVenta(Venta venta){
        return empleado.agregarVenta(venta);
    }

    /**
     * Metodo para obtener la lista de ventas de la sede del empleado
     * @return Coleccion de ventas de la sede del empleado
     */
    public Collection<Venta> obtenerListaVentas(){
        return empleado.getSede().getListaVentas();
    }

    /**
     * Metodo para eliminar una venta
     * @param codigo Codigo de la venta que se busca eliminar
     * @return Booleano sobre si se pudo eliminar la venta o no
     */
    public boolean eliminarVenta(int codigo){
        return empleado.eliminarVenta(codigo);
    }
}