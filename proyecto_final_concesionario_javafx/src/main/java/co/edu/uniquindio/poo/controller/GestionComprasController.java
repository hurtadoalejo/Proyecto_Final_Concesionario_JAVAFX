package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class GestionComprasController {
    Empleado empleado;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionComprasController
     * @param empleado Empleado de la clase GestionComprasController
     * @param concesionario Concesionario de la clase GestionComprasController
     */
    public GestionComprasController(Empleado empleado, Concesionario concesionario) {
        this.empleado = empleado;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para obtener la lista de compras de la sede del empleado
     * @return Coleccion de compras de la sede del empleado
     */
    public Collection<Compra> obtenerListaCompras(){
        return empleado.getSede().getListaCompras();
    }

    /**
     * Metodo para crear una compra
     * @param compra Compra que se busca crear
     * @return Booleano sobre si se pudo crear la compra o no
     */
    public boolean crearCompra(Compra compra){
        return empleado.agregarCompra(compra);
    }

    /**
     * Metodo para actualizar los datos de una compra
     * @param codigo Codigo de la compra a actualizar
     * @param compra Compra con los datos nuevos
     * @return Booleano sobre si se pudo actualizar la compra o no
     */
    public boolean actualizarCompra(int codigo, Compra compra){
        return empleado.actualizarCompra(codigo, compra);
    }

    /**
     * Metodo para eliminar una compra
     * @param codigo Codigo de la compra que se busca eliminar
     * @return Booleano sobre si se pudo eliminar la compra o no
     */
    public boolean eliminarCompra(int codigo){
        return empleado.eliminarCompra(codigo);
    }

    /**
     * Metodo para concretar una compra
     * @param codigo Codigo de la compra que se busca concretar
     * @return Booleano sobre si se pudo concretar la compra o no
     */
    public boolean concretarCompra(int codigo){
        return empleado.concretarCompra(codigo);
    }
}