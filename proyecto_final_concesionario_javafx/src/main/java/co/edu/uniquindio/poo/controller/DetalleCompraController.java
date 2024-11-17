package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Detalle_compra;
import co.edu.uniquindio.poo.model.Compra;

public class DetalleCompraController {
    Compra compra;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase DetalleCompraController
     * @param compra Compra de la clase DetalleCompraController
     * @param concesionario Concesionario de la clase DetalleCompraController
     */
    public DetalleCompraController(Compra compra, Concesionario concesionario) {
        this.compra = compra;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para crear un detalle de compra
     * @param detalleCompra Detalle de compra que se busca crear
     * @return Booleano sobre si se pudo crear el detalle de compra o no
     */
    public boolean crearDetalleCompra(Detalle_compra detalleCompra){
        return compra.agregarDetalleCompra(detalleCompra);
    }

    /**
     * Metodo para eliminar un detalle de compra
     * @param placa Placa del vehiculo del detalle de compra a eliminar
     * @return Booleano sobre si se pudo eliminar el detalle de compra o no
     */
    public boolean eliminarDetalleCompra(String placa){
        return compra.eliminarDetalleCompra(placa);
    }

    /**
     * Metodo para obtener la lista de detalle de compra de la compra
     * @return Coleccion de detalles de compra de la compra
     */
    public Collection<Detalle_compra> obtenerListaDetallesCompra(){
        return compra.getListaDetallesCompra();
    }
}