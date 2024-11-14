package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Cliente;

public class GestionClienteController {
    Empleado empleado;
    Concesionario concesionario;

    /**
     * Metodo constructor de la clase GestionClienteController
     * @param empleado Empleado de la clase GestionClienteController
     * @param concesionario Concesionario de la clase GestionClienteController
     */
    public GestionClienteController(Empleado empleado, Concesionario concesionario) {
        this.empleado = empleado;
        this.concesionario = concesionario;
    }

    /**
     * Metodo para crear un cliente
     * @param cliente Cliente que se busca crear
     * @return Booleanos sobre si se puede crear el cliente o no
     */
    public boolean crearCliente(Cliente cliente){
        return empleado.agregarCliente(cliente);
    }

    /**
     * Metodo para obtener la lista de clientes del concesionario
     * @return Coleccion de clientes del concesionario
     */
    public Collection<Cliente> obtenerListaClientes(){
        return concesionario.getListaClientes();
    }

    /**
     * Metodo para eliminar un cliente
     * @param identificacion Identificacion del cliente que se busca eliminar
     * @return Booleano sobre si se pudo eliminar el cliente o no
     */
    public boolean eliminarCliente(String identificacion){
        return empleado.eliminarCliente(identificacion);
    }

    /**
     * Metodo para actualizar un cliente
     * @param identificacion Identificacion del cliente que se busca actualizar
     * @param clienteNuevo Cliente con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el cliente o no
     */
    public boolean actualizarCliente(String identificacion, Cliente clienteNuevo){
        return empleado.actualizarCliente(identificacion, clienteNuevo);
    }
}