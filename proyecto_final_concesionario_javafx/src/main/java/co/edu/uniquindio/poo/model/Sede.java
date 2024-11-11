package co.edu.uniquindio.poo.model;

import java.util.LinkedList;
import java.util.List;

public class Sede {
    private int codigo;
    private String direccion;
    private Ciudad ciudad;
    private double dineroGenerado;
    private double dineroGastado;
    private double dineroGanadoNeto;
    private List<Empleado> listaEmpleados;
    private List<Vehiculo> listaVehiculos;
    private List<Venta> listaVentas;
    private List<Compra> listaCompras;
    private List<Alquiler> listaAlquileres;
    private Administrador administrador;
    
    /**
     * Metodo constructor de la clase Sede
     * @param codigo Codigo de la sede a crear
     * @param direccion Direccion de la sede a crear
     * @param ciudad Ciudad de la sede a crear
     */
    public Sede(int codigo, String direccion, Ciudad ciudad) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.dineroGenerado = 0;
        this.dineroGastado = 0;
        this.dineroGanadoNeto = calcularDineroGanadoNeto();
        this.listaEmpleados = new LinkedList<>();
        this.listaVehiculos = new LinkedList<>();
        this.listaVentas = new LinkedList<>();
        this.listaCompras = new LinkedList<>();
        this.listaAlquileres = new LinkedList<>();
        this.administrador = null;
    }

    /**
     * Metodo para obtener el codigo de la sede
     * @return Codigo de la sede
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener la direccion de la sede
     * @return Direccion de la sede
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo para obtener la ciudad de la sede
     * @return Ciudad de la sede
     */
    public Ciudad getCiudad() {
        return ciudad;
    }
    /**
     * Metodo para obtener el dinero generado de la sede
     * @return Dinero generado de la sede
     */
    public double getDineroGenerado() {
        return dineroGenerado;
    }
    /**
     * Metodo para obtener el dinero gastado de la sede
     * @return Dinero gastado de la sede
     */
    public double getDineroGastado() {
        return dineroGastado;
    }
    /**
     * Metodo para obtener el dinero ganado neto de la sede
     * @return Dinero ganado neto de la sede
     */
    public double getDineroGanadoNeto() {
        return dineroGanadoNeto;
    }
    /**
     * Metodo para obtener la lista de empleados de la sede
     * @return Lista de empleados de la sede
     */
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    /**
     * Metodo para obtener la lista de vehiculos de la sede
     * @return Lista de vehiculos de la sede
     */
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    /**
     * Metodo para obtener la lista de ventas de la sede
     * @return Lista de ventas de la sede
     */
    public List<Venta> getListaVentas() {
        return listaVentas;
    }
    /**
     * Metodo para obtener la lista de compras de la sede
     * @return Lista de compras de la sede
     */
    public List<Compra> getListaCompras() {
        return listaCompras;
    }
    /**
     * Metodo para obtener la lista de alquileres de la sede
     * @return Lista de alquileres de la sede
     */
    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }
    /**
     * Metodo para obtener el administrador de la sede
     * @return Administrador de la sede
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    /**
     * Metodo para modificar el codigo de la sede
     * @param codigo Nuevo codigo de la sede
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar la direccion de la sede
     * @param direccion Nueva direccion de la sede
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo para modificar la ciudad de la sede
     * @param ciudad Nueva ciudad de la sede
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    /**
     * Metodo para modificar el dinero generado de la sede
     * @param dineroGenerado Nuevo dinero generado de la sede
     */
    public void setDineroGenerado(double dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }
    /**
     * Metodo para modificar el dinero gastado de la sede
     * @param dineroGastado Nuevo dinero gastado de la empresa
     */
    public void setDineroGastado(double dineroGastado) {
        this.dineroGastado = dineroGastado;
    }
    /**
     * Metodo para modificar el dinero ganado neto de la sede
     * @param dineroGanadoNeto Nuevo dinero ganado neto de la sede
     */
    public void setDineroGanadoNeto(double dineroGanadoNeto) {
        this.dineroGanadoNeto = dineroGanadoNeto;
    }
    /**
     * Metodo para modificar la lista de empleados de la sede
     * @param listaEmpleados Nueva lista de empleados de la sede
     */
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    /**
     * Metodo para modificar la lista de vehiculos de la sede
     * @param listaVehiculos Nueva lista de vehiculos de la sede
     */
    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    /**
     * Metodo para modificar la lista de ventas de la sede
     * @param listaVentas Nueva lista de ventas de la sede
     */
    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
    /**
     * Metodo para modificar la lista de compras de la sede
     * @param listaCompras Nueva lista de compras de la sede
     */
    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }
    /**
     * Metodo para modificar la lista de alquileres de la sede
     * @param listaAlquileres Nueva lista de alquileres de la sede
     */
    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }
    /**
     * Metodo para modificar el administrador de la sede
     * @param administrador Nuevo administrador de la sede
     */
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Metodo para aumentar el dinero total gastado de la sede
     * @param dinero Dinero que se busca añadir
     */
    public void aumentarDineroGastado(double dinero){
        double dineroTotalGastado = dineroGastado;
        setDineroGastado(dineroTotalGastado+dinero);
    }
    /**
     * Metodo para aumentar el dinero total generado de la sede
     * @param dinero Dinero que se busca añadir
     */
    public void aumentarDineroGenerado(double dinero){
        double dineroTotalGenerado = dineroGenerado;
        setDineroGenerado(dineroTotalGenerado+dinero);
    }
    /**
     * Metodo para calcular el dinero ganado neto de la sede
     * @return Dinero ganado neto de la sede
     */
    public double calcularDineroGanadoNeto(){
        double total = dineroGenerado - dineroGastado;
        return total;
    }
}