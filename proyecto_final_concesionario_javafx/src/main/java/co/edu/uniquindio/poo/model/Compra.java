package co.edu.uniquindio.poo.model;
import java.util.List;
import java.time.LocalDate;
import java.util.LinkedList;

public class Compra {
    private int codigo;
    private double totalCompra;
    private Empleado empleado;
    private Cliente cliente;
    private List<Detalle_compra> listaDetallesCompra;
    private Sede sede;
    private boolean concretada;
    private LocalDate fechaCompra;

    /**
     * Metodo constructor de la clase compra
     * @param codigo Codigo de la compra a crear
     * @param empleado Empleado de la compra a crear
     * @param cliente Cliente de la compra a crear
     * @param sede Sede de la compra a crear
     * @param fechaCompra Fecha de la compra a crear
     */
    public Compra(int codigo, Empleado empleado, Cliente cliente, Sede sede, LocalDate fechaCompra) {
        this.codigo = codigo;
        this.empleado = empleado;
        this.cliente = cliente;
        this.sede = sede;
        this.totalCompra = 0;
        this.listaDetallesCompra = new LinkedList<>();
        this.concretada = false;
        this.fechaCompra = fechaCompra;
    }

    /**
     * Metodo para obtener el codigo de la compra
     * @return Codigo de la compra
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener el empleado de la compra
     * @return Empleado de la compra
     */
    public Empleado getEmpleado() {
        return empleado;
    }
    /**
     * Metodo para obtener el cliente de la compra
     * @return Cliente de la compra
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Metodo para obtener el total de la compra
     * @return Total de la compra
     */
    public double getTotalCompra() {
        return totalCompra;
    }
    /**
     * Metodo para obtener la lista de detalles de compra
     * @return Lista de detalles de compra
     */
    public List<Detalle_compra> getListaDetallesCompra() {
        return listaDetallesCompra;
    }
    /**
     * Metodo para obtener la sede de la compra
     * @return Sede de la compra
     */
    public Sede getSede() {
        return sede;
    }
    /**
     * Metodo para obtener si la compra ya ha sido concretada o no
     * @return Booleano si la compra ya ha sido concretada o no
     */
    public boolean isConcretada() {
        return concretada;
    }
    /**
     * Metodo para obtener la fecha de compra de la compra
     * @return Fecha de compra de la compra
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Metodo para modificar el codigo de la compra
     * @param codigo Nuevo codigo de la compra
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar el empleado de la compra
     * @param empleado Nuevo empleado de la compra
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo para modificar el cliente de la compra
     * @param cliente Nuevo cliente de la compra
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo para modificar el total de la compra
     * @param totalCompra Nuevo total de la compra
     */
    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    /**
     * Metodo para modificar la lista de detalles de compra
     * @param listaDetallesCompra Nueva lista de detalles de compra
     */
    public void setListaDetallesCompra(List<Detalle_compra> listaDetallesCompra) {
        this.listaDetallesCompra = listaDetallesCompra;
    }
    /**
     * Metodo para modificar la sede de la compra
     * @param sede Nueva sede de la compra
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }
    /**
     * Metodo para modificar si la compra ha sido concretada o no
     * @param concretada Nuevo booleano si la compra ha sido concretada o no
     */
    public void setConcretada(boolean concretada) {
        this.concretada = concretada;
    }
    /**
     * Metodo para modificar la fecha de compra de la compra
     * @param fechaCompra Nueva fecha de compra de la compra
     */
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * Metodo para calcular el total de la compra
     * @return Total de la compra
     */
    public double calcularTotal(){
        double total = 0;
        for (Detalle_compra detalleTemporal : listaDetallesCompra) {
            total += detalleTemporal.getSubtotal();
        }
        return total;
    }

    /**
     * Metodo para agregar un detalle de compra a la lista de detalles de compra de la compra
     * @param detalleCompra Detalle de compra que se busca agregar
     * @return Booleano sobre si se pudo agregar el detalle de compra o no
     */
    public boolean agregarDetalleCompra(Detalle_compra detalleCompra){
        boolean accion = false;
        if (verificarDetalleCompra(detalleCompra)) {
            listaDetallesCompra.add(detalleCompra);
            setTotalCompra(calcularTotal());
            accion = true;
        }
        return accion;
    }

    /**
     * Metodo para verificar si el detalle de compra se puede agregar a la lista de detalles de compra de la compra
     * @param detalleCompra Detalle de compra a verificar
     * @return Booleano sobre si se puede agregar el detalle de compra o no
     */
    public boolean verificarDetalleCompra(Detalle_compra detalleCompra){
        boolean accion = false;
        if (detalleCompra.isTecnomecanicaValida() && detalleCompra.getVehiculo().getTipoUso().equals(Tipo_uso.VENTA) && detalleCompra.getCompra().getCodigo() == codigo && detalleCompra.getVehiculo().getEstadoDisponibilidad().equals(Estado_disponibilidad.DISPONIBLE) && !empleado.verificarVehiculo(detalleCompra.getVehiculo().getPlaca()) && !concretada && !verificarVehiculoEnCompra(detalleCompra.getVehiculo().getPlaca())) {
            accion = true;
        }
        return accion;
    }

    /**
     * Metodo para verificar si hay algun vehiculo con la misma placa en la lista de detalles de compra de la compra
     * @param placa Placa a verificar
     * @return Booleano sobre si existe algun vehiculo con esta condicion o no
     */
    public boolean verificarVehiculoEnCompra(String placa){
        boolean accion = false;
        for (Detalle_compra detalle_compra : listaDetallesCompra) {
            if (detalle_compra.getVehiculo().getPlaca().equals(placa)) {
                accion = true;
                break;
            }
        }
        return accion;
    }

    /**
     * Metodo para eliminar un detalle de compra de la lista de detalles de compra de la compra
     * @param placa Placa del vehiculo a eliminar
     * @return Booleano sobre si se pudo eliminar el detalle de compra
     */
    public boolean eliminarDetalleCompra(String placa){
        boolean accion = false;
        for (Detalle_compra detalle_compra : listaDetallesCompra) {
            if (detalle_compra.getVehiculo().getPlaca().equals(placa)) {
                detalle_compra.getVehiculo().setEstadoDisponibilidad(Estado_disponibilidad.DISPONIBLE);
                setTotalCompra(calcularTotal());
                listaDetallesCompra.remove(detalle_compra);
                accion = true;
                break;
            }
        }
        return accion;
    }
}