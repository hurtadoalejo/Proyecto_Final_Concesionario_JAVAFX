package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Venta {
    private int codigo;
    private double totalVenta;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double precioVehiculo;
    private LocalDate fechaVenta;
    private Sede sede;

    /**
     * Metodo constructor de la clase venta
     * @param codigo Codigo de la venta a crear
     * @param empleado Empleado de la venta a crear
     * @param cliente Cliente de la venta a crear
     * @param vehiculo Vehiculo de la venta a crear
     * @param precioVenta Precio del vehiculo de la venta a crear
     * @param fechaVenta Fecha de venta de la venta a crear
     * @param sede Sede de la venta a crear
     */
    public Venta(int codigo, Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precioVehiculo, LocalDate fechaVenta, Sede sede) {
        this.codigo = codigo;
        this.precioVehiculo = precioVehiculo;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.totalVenta = calcularTotalVenta();
        this.fechaVenta = fechaVenta;
        this.sede = sede;
    }

    /**
     * Metodo para calcular el total de la venta
     * @return Costo total de la venta
     */
    public double calcularTotalVenta(){
        double costoTotal = precioVehiculo;
        return costoTotal;
    }

    /**
     * Metodo para obtener el codigo de la venta
     * @return Codigo de la venta
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener el empleado de la venta
     * @return Empleado de la venta
     */
    public Empleado getEmpleado() {
        return empleado;
    }
    /**
     * Metodo para obtener el cliente de la venta
     * @return Cliente de la venta
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Metodo para obtener el total de la venta
     * @return Total de la venta
     */
    public double getTotalVenta() {
        return totalVenta;
    }
    /**
     * Metodo para obtener el vehiculo de la venta
     * @return Vehiculo de la venta
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    /**
     * Metodo para obtener el precio del vehiculo de la venta
     * @return Precio del vehiculo de la venta
     */
    public double getPrecioVehiculo() {
        return precioVehiculo;
    }
    /**
     * Metodo para obtener la fecha de venta de la venta
     * @return Fecha de venta de la venta
     */
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
    /**
     * Metodo para obtener la sede de la venta
     * @return Sede de la venta
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * Metodo para modificar el codigo de la venta
     * @param codigo Nuevo codigo de la venta
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar el empleado de la venta
     * @param empleado Nuevo empleado de la venta
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo para modificar el cliente de la venta
     * @param cliente Nuevo cliente de la venta
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo para modificar el total de la venta
     * @param totalVenta Nuevo total de la venta
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    /**
     * Metodo para modificar el vehiculo de la venta
     * @param vehiculo Nuevo vehiculo de la venta
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    /**
     * Metodo para modificar el precio del vehiculo de la venta
     * @param precioVehiculo Nuevo precio del vehiculo de la venta
     */
    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }
    /**
     * Metodo para modificar la fecha de venta de la venta
     * @param fechaVenta Nueva fecha de venta de la venta
     */
    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    /**
     * Metodo para modificar la sede de la venta
     * @param sede Nueva sede de la venta
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }
}