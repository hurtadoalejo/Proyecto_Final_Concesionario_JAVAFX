package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Reporte {
    private int codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Empleado empleado;
    private Sede sede;
    private int comprasConcretadas;
    private int alquileresConcretados;
    private int ventasConcretadas;

    /**
     * Metodo constructor de la clase Reporte
     * @param codigo Codigo del reporte
     * @param fechaInicio Fecha de inicio del reporte
     * @param fechaFin Fecha fin del reporte
     * @param empleado Empleado del reporte
     */
    public Reporte(int codigo, LocalDate fechaInicio, LocalDate fechaFin, Empleado empleado) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.empleado = empleado;
        this.sede = empleado.getSede();
        this.comprasConcretadas = contarCompras();
        this.alquileresConcretados = contarAlquileres();
        this.ventasConcretadas = contarVentas();
    }

    /**
     * Metodo para contar las compras concretadas de un empleado
     * @return
     */
    public int contarCompras(){
        int cantidad = 0;
        for (Compra compra : empleado.getListaCompras()) {
            if (compra.isConcretada()) {
            }
            if (compra.isConcretada() && (compra.getFechaCompra().isBefore(fechaFin) || compra.getFechaCompra().isEqual(fechaFin)) && (compra.getFechaCompra().isAfter(fechaInicio) || compra.getFechaCompra().isEqual(fechaInicio))) {
                cantidad ++;
            }
        }
        return cantidad;
    }

    /**
     * Metodo para contar las ventas concretadas de un empleado
     * @return
     */
    public int contarVentas(){
        int cantidad = 0;
        for (Venta venta : empleado.getListaVentas()) {
            if ((venta.getFechaVenta().isBefore(fechaFin) || venta.getFechaVenta().isEqual(fechaFin)) && (venta.getFechaVenta().isAfter(fechaInicio)) || venta.getFechaVenta().isEqual(fechaInicio)) {
                cantidad ++;
            }
        }  
        return cantidad;
    }

    /**
     * Metodo para contar los alquileres concretados de un empleado
     * @return
     */
    public int contarAlquileres(){
        int cantidad = 0;
        for (Alquiler alquiler : empleado.getListaAlquileres()) {
            if (alquiler.getEstadoAlquiler().equals(Estado_alquiler.PAGADO)) {
                if ((alquiler.getFechaEntregaAlquiler().isBefore(fechaFin) || alquiler.getFechaEntregaAlquiler().isEqual(fechaFin)) && (alquiler.getFechaEntregaAlquiler().isAfter(fechaInicio)) || alquiler.getFechaEntregaAlquiler().isEqual(fechaInicio)) {
                    cantidad ++;
                }
            }
        }
        return cantidad;
    }

    /**
     * Metodo para obtener el codigo del reporte
     * @return Codigo del reporte
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener la fecha de inicio del reporte
     * @return Fecha de inicio del reporte
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    /**
     * Metodo para obtener la fecha de fin del reporte
     * @return Fecha de fin del reporte
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    /**
     * Metodo para obtener el empleado del reporte
     * @return Empleado del reporte
     */
    public Empleado getEmpleado() {
        return empleado;
    }
    /**
     * Metodo para obtener la sede del reporte
     * @return Sede del reporte
     */
    public Sede getSede() {
        return sede;
    }
    /**
     * Metodo para obtener las compras concretadas del reporte
     * @return Compras concretadas del reporte
     */
    public int getComprasConcretadas() {
        return comprasConcretadas;
    }
    /**
     * Metodo para obtener los alquileres concretados del reporte
     * @return Alquileres concretados del reporte
     */
    public int getAlquileresConcretados() {
        return alquileresConcretados;
    }
    /**
     * Metodo para obtener las ventas concretadas del reporte
     * @return Ventas concretadas del reporte
     */
    public int getVentasConcretadas() {
        return ventasConcretadas;
    }

    /**
     * Metodo para modificar el codigo del reporte
     * @param codigo Nuevo codigo del reporte
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar la fecha de inicio del reporte
     * @param fechaFin Nueva fecha de inicio del reporte
     */
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    /**
     * Metodo para modificar la fecha de fin del reporte
     * @param fechaInicio Nueva fecha de fin del reporte
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * Metodo para modificar el empleado del reporte
     * @param empleado Nuevo empleado del reporte
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo para modificar la sede del reporte
     * @param sede Nueva sede del reporte
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }
    /**
     * Metodo para modificar las compras concretadas del reporte
     * @param comprasConcretadas Nuevas compras concretadas del reporte
     */
    public void setComprasConcretadas(int comprasConcretadas) {
        this.comprasConcretadas = comprasConcretadas;
    }
    /**
     * Metodo para modificar los alquileres concretados del reporte
     * @param ventasConcretadas Nuevos alquileres concretados del reporte
     */
    public void setVentasConcretadas(int ventasConcretadas) {
        this.ventasConcretadas = ventasConcretadas;
    }
    /**
     * Metodo para modificar las ventas concretadas del reporte
     * @param alquileresConcretados Nuevas ventas concretadas del reporte
     */
    public void setAlquileresConcretados(int alquileresConcretados) {
        this.alquileresConcretados = alquileresConcretados;
    }
}