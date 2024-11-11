package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Alquiler {
    private int codigo;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Empleado empleado;
    private LocalDate fechaAlquiler;
    private LocalDate fechaEntregaAlquiler;
    private double precioPorDia;
    private double totalPrestamo;
    private Estado_alquiler estadoAlquiler;
    private Sede sede;
    
    /**
     * Metodo constructor de la clase Alquiler
     * @param codigo Codigo del alquiler a crear
     * @param cliente Cliente del alquiler a crear
     * @param vehiculo Vehiculo del alquiler a crear
     * @param empleado Empleado delalquiler a crear
     * @param fechaAlquiler Fecha del alquiler a crear
     * @param precioPorDia Precio por dia del alquiler a crear
     * @param totalPrestamo Total del alquiler a crear
     * @param sede Sede del alquiler a crear
     */
    public Alquiler(int codigo, Cliente cliente, Vehiculo vehiculo, Empleado empleado, LocalDate fechaAlquiler, double precioPorDia, Sede sede){
        this.codigo = codigo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.fechaAlquiler = fechaAlquiler;
        this.precioPorDia = precioPorDia;
        this.totalPrestamo = 0;
        this.estadoAlquiler = Estado_alquiler.PENDIENTE;
        this.fechaEntregaAlquiler = null;
        this.sede = sede;
    }
    
    /**
     * Metodo para obtener el codigo del alquiler
     * @return Codigo del alquiler
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener el cliente del alquiler
     * @return Cliente del alquiler
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Metodo para obtener el vehiculo del alquiler
     * @return Vehiculo del alquiler
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    /**
     * Metodo para obtener el empleado del alquiler
     * @return Empleado del alquiler
     */
    public Empleado getEmpleado() {
        return empleado;
    }
    /**
     * Metodo para obtener la fecha del alquiler
     * @return Fecha del alquiler
     */
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }
    /**
     * Metodo para obtener la fecha de entrega del alquiler
     * @return Fecha de entrega del alquiler
     */
    public LocalDate getFechaEntregaAlquiler() {
        return fechaEntregaAlquiler;
    }
    /**
     * Metodo para obtener el precio por dia del alquiler
     * @return Precio por dia del alquiler
     */
    public double getPrecioPorDia() {
        return precioPorDia;
    }
    /**
     * Metodo para obtener el total del prestamo del alquiler
     * @return Total del prestamo del alquiler
     */
    public double getTotalPrestamo() {
        return totalPrestamo;
    }
    /**
     * Metodo para obtener el estado del alquiler
     * @return Estado del alquiler
     */
    public Estado_alquiler getEstadoAlquiler() {
        return estadoAlquiler;
    }
    /**
     * Metodo para obtener la sede del alquiler
     * @return Sede del alquiler
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * Metodo para modificar el codigo del alquiler
     * @param codigo Nuevo codigo del alquiler
    */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar el cliente del alquiler
     * @param cliente Nuevo cliente del alquiler
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo para modificar el vehiculo del alquiler
     * @param vehiculo Nuevo vehiculo del alquiler
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    /**
     * Metodo para modificar el empleado del alquiler
     * @param empleado Nuevo empleado del alquiler 
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo para modificar la fecha del alquiler
     * @param fechaAlquiler Nueva fecha del alquiler
     */
    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    /**
     * Metodo para modificar la fecha de entrega del alquiler
     * @param fechaEntregaAlquiler Nueva fecha de entrega del alquiler
     */
    public void setFechaEntregaAlquiler(LocalDate fechaEntregaAlquiler) {
        this.fechaEntregaAlquiler = fechaEntregaAlquiler;
    }
    /**
     * Metodo para modificar el precio por dia del alquiler
     * @param precioPorDia Nuevo precio por dia del alquiler
     */
    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    /**
     * Metodo para modificar el total del prestamo del alquiler
     * @param totalPrestamo Nuevo total del prestamo del alquiler
     */
    public void setTotalPrestamo(double totalPrestamo) {
        this.totalPrestamo = totalPrestamo;
    }
    /**
     * Metodo para obtener el estado del alquiler
     * @param estadoAlquiler Nuevo estado del alquiler
     */
    public void setEstadoAlquiler(Estado_alquiler estadoAlquiler) {
        this.estadoAlquiler = estadoAlquiler;
    }
    /**
     * Metodo para modificar la sede del alquiler
     * @param sede Sede del alquiler
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }

}