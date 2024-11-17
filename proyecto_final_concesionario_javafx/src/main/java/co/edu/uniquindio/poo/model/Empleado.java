package co.edu.uniquindio.poo.model;

import java.util.List;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

public class Empleado extends Persona implements ICredencialAcceso, IVerificarPersona{
    private Concesionario concesionario;
    private double salarioBase;
    private Estado_empleado estadoEmpleado;
    private String usuario;
    private int password;
    private boolean autenticado;
    private List<Venta> listaVentas;
    private List<Compra> listaCompras;
    private List<Alquiler> listaAlquileres;
    private Sede sede;
    private String respuestaPregunta;
    
    /**
     * Metodo constructor de la clase Empleado
     * @param nombre Nombre del empleado a crear
     * @param identificacion Identificacion del empleado a crear
     * @param correo Correo del empleado a crear
     * @param salarioBase Salario base del empleado a crear
     * @param estadoEmpleado Estado del empleado a crear
     * @param usuario Usuario del empleado a crear
     * @param password Contraseña del empleado a crear
     * @param sede Sede del empleado a crear
     * @param respuestaPregunta Respuesta de la pregunta de seguridad del empleado a crear
     */
    public Empleado(String nombre, String identificacion, String correo, double salarioBase, String usuario, int password, Concesionario concesionario, Sede sede, String respuestaPregunta){
        super(nombre, identificacion, correo);
        this.salarioBase = salarioBase;
        this.estadoEmpleado = Estado_empleado.NO_ACTIVO;
        this.usuario = usuario;
        this.password = password;
        this.autenticado = false;
        this.listaVentas = new LinkedList<>();
        this.listaCompras = new LinkedList<>();
        this.listaAlquileres = new LinkedList<>();
        this.concesionario = concesionario;
        this.sede = sede;
        this.respuestaPregunta = respuestaPregunta;
    }

    /**
     * Metodo para obtener el salario base de un empleado
     * @return Salario base de un empleado
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    /**
     * Metodo para obtener el estado de un empleado
     * @return Estado de un empleado
     */
    public Estado_empleado getEstadoEmpleado() {
        return estadoEmpleado;
    }
    /**
     * Metodo para obtener el usuario de un empleado
     * @return Usuario de un empleado
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Metodo para obtener la contraseña de un empleado
     * @return Contraseña de un empleado
     */
    public int getPassword() {
        return password;
    }
    /**
     * Metodo para obtener si el empleado esta autenticado o no
     * @return Booleano sobre si el empleado esta autenticado o no
     */
    public boolean isAutenticado() {
        return autenticado;
    }
    /**
     * Metodo para obtener la lista de ventas de un empleado
     * @return Lista de ventas de un empleado
     */
    public List<Venta> getListaVentas() {
        return listaVentas;
    }
    /**
     * Metodo para obtener la lista de compras de un empleado
     * @return Lista de compras de un empleado
     */
    public List<Compra> getListaCompras() {
        return listaCompras;
    }
    /**
     * Metodo para obtener la lista de alquileres de un empleado
     * @return Lista de alquileres de un empleado
     */
    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }
    /**
     * Metodo para obtener el concesionario al que esta asociado el empleado
     * @return Concesionario al que esta asociado el empleado
     */
    public Concesionario getConcesionario() {
        return concesionario;
    }
    /**
     * Metodo para obtener la sede a la que esta asociado el empleado
     * @return Sede a la que esta asociado el empleado
     */
    public Sede getSede() {
        return sede;
    }
    /**
     * Metodo para obtener la respuesta de la pregunta del empleado
     * @return Respuesta de la pregunta del empleado
     */
    public String getRespuestaPregunta() {
        return respuestaPregunta;
    }

    /**
     * Metodo para modificar el salario base de un empleado
     * @param salarioBase Nuevo salario base de un empleado
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    /**
     * Metodo para modificar el estado de un empleado
     * @param estadoEmpleado Nuevo estado del empleado
     */
    public void setEstadoEmpleado(Estado_empleado estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }
    /**
     * Metodo para modificar el usuario de un empleado
     * @param usuario Nuevo usuario de un empleado
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Metodo para modificar la contraseña de un empleado
     * @param password Nueva contraseña de un empleado
     */
    public void setPassword(int password) {
        this.password = password;
    }
    /**
     * Metodo para modificar si el empleado esta autenticado o no
     * @param autenticado Nuevo booleano si el empleado esta autenticado o no
     */
    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
    /**
     * Metodo para modificar la lista de ventas de un empleado
     * @param listaCompras Nueva lista de ventas de un empleado
     */
    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }
    /**
     * Metodo para modificar la lista de compras de un empleado
     * @param listaVentas Nueva lista de compras de un empleado
     */
    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
    /**
     * Metodo para modificar la lista de alquileres de un empleado
     * @param listaAlquileres Nueva lista de alquileres de un empleado
     */
    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }
    /**
     * Metodo para modificar el concesionario la que esta asociado un empleado
     * @param concesionario Nuevo concesionario la que esta asociado un empleado
     */
    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }
    /**
     * Metodo para modificar la sede a la que esta asociado un empleado
     * @param sede Nueva sede a la que esta asociado un empleado
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }
    /**
     * Metodo para modificar la respuesta de la pregunta del empleado
     * @param respuestaPregunta Nueva respuesta de la pregunta del empleado
     */
    public void setRespuestaPregunta(String respuestaPregunta) {
        this.respuestaPregunta = respuestaPregunta;
    }

    /**
     * Metodo para autenticar el usuario y contraseña de un usuario
     * @param usuarioDado Usuario a verificar
     * @param passwordDada Contraseña a verificar
     * @return Booleano sobre si la autenticacion fue lograda o no
     */
    @Override
    public boolean autenticar(String usuarioDado, int passwordDada){
        if (usuario.equals(usuarioDado) && password == passwordDada) {
            setAutenticado(true);
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Metodo para cerrar la sesion de un empleado
     */
    @Override
    public void cerrarSesion(){
        setAutenticado(false);
    }

    /**
     * Metodo para agregar un cliente a la lista de clientes del concesionario
     * @param cliente Cliente que se busca agregar a la lista de clientes del concesionario
     * @return Booleano sobre si se pudo agregar el cliente o no
     */
    public boolean agregarCliente(Cliente cliente) {
        boolean accion = false;
        if (!verificarPersona(cliente.getIdentificacion()) && isAutenticado() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            concesionario.getListaClientes().add(cliente);
            accion = true;
        }
        return accion;
    }
    /**
     * Metodo para verificar si una cedula coincide con alguna cedula de un cliente de la lista de clientes del concesionario
     * @param cedula Cedula a verificar
     * @return Booleano sobre si hay un cliente que cumple con esta condicion o no
     */
    public boolean verificarCliente(String cedula) {
        boolean accion = false;
        if (isAutenticado()) {
            for (Cliente cliente : concesionario.getListaClientes()) {
                if (cliente.getIdentificacion().equals(cedula)) {
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para verificar si existe una persona con la misma identificacion administrada en la lista de empleados, administradores o clientes del concesionario
     * @param identificacion Identificacion a verificar
     * @return Booleano sobre si existe una persona con esta condicion o no
     */
    @Override
    public boolean verificarPersona(String identificacion){
        boolean accion = false;
        for (Empleado empleado : concesionario.getListaEmpleados()) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        for (Cliente cliente : concesionario.getListaClientes()) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        for (Administrador administrador : concesionario.getListaAdministradores()) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        return accion;
    }
    /**
     * Metodo para actualizar algunos datos de un cliente de la lista de clientes del concesionario
     * @param cedula Cedula del cliente que se quiere actualizar
     * @param clienteNuevo Cliente con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el cliente o no
     */
    public boolean actualizarCliente(String cedula, Cliente clienteNuevo) {
        boolean accion = false;
        if (isAutenticado() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            for (Cliente cliente : concesionario.getListaClientes()) {
                if (cliente.getIdentificacion().equals(cedula) && clienteNuevo.getIdentificacion().equals(cedula)) {
                    cliente.setNombre(clienteNuevo.getNombre());
                    cliente.setCorreo(clienteNuevo.getCorreo());
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para eliminar un cliente de la lista de clientes del concesionario
     * @param cedula Cedula del cliente que se busca eliminar
     * @return Booleano sobre si se pudo eliminar el cliente o no
     */
    public boolean eliminarCliente(String cedula) {
        boolean accion = false;
        if (isAutenticado() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            for (Cliente cliente : concesionario.getListaClientes()) {
                if (cliente.getIdentificacion().equals(cedula)) {
                    concesionario.getListaClientes().remove(cliente);
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    
    /**
     * Metodo para agregar un vehiculo a la lista de vehiculos del concesionario y a la lista de vehiculos de la sede del empleado
     * @param vehiculo Vehiculo que se busca agregar
     * @return Booleano sobre si se pudo agregar el vehiculo o no
     */
    public boolean agregarVehiculo(Vehiculo vehiculo){
        boolean accion = false;
        if (isAutenticado() && !verificarVehiculo(vehiculo.getPlaca()) && vehiculo.getSede().equals(sede) && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            concesionario.getListaVehiculos().add(vehiculo);
            sede.getListaVehiculos().add(vehiculo);
            accion = true;
        }
        return accion;
    }
    /**
     * Metodo para verificar si una placa es igual a un vehiculo en la lista de vehiculos del concesionario
     * @param placa Placa a verificar
     * @return Booleano sobre si existe un vehiculo con estas condiciones o no
     */
    public boolean verificarVehiculo(String placa){
        boolean accion = false;
        if (isAutenticado()) {
            for (Vehiculo vehiculo : concesionario.getListaVehiculos()) {
                if (vehiculo.getPlaca().equals(placa)) {
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para actualizar un vehiculo de la lista de vehiculos del concesionario y la lista de vehiculos de la sede del empleado
     * @param placa Placa a verificar
     * @param vehiculoDado Vehiculo con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el vehiculo o no
     */
    public boolean actualizarVehiculo(String placa, Vehiculo vehiculoDado){
        boolean accion = false;
        if (isAutenticado() && vehiculoDado.getSede().equals(sede) && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            for (int a = 0; a < concesionario.getListaVehiculos().size(); a++) {
                Vehiculo vehiculo = concesionario.getListaVehiculos().get(a);
                if (vehiculo.getPlaca().equals(placa) && vehiculo.getEstadoDisponibilidad().equals(Estado_disponibilidad.DISPONIBLE)) {
                    accion = true;
                    concesionario.getListaVehiculos().set(a, vehiculoDado);
                    sede.getListaVehiculos().set(a, vehiculoDado);
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para eliminar un vehiculo de la lista de vehiculos del concesionario y la lista de vehiculos de la sede del empleado dada una placa
     * @param placa Placa a verificar
     * @return Booleano sobre si se pudo eliminar el vehiculo o no
     */
    public boolean eliminarVehiculo(String placa){
        boolean accion = false;
        if (isAutenticado() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            for (Vehiculo vehiculo : concesionario.getListaVehiculos()) {
                if (vehiculo.getPlaca().equals(placa) && vehiculo.getSede().equals(sede) && vehiculo.getEstadoDisponibilidad().equals(Estado_disponibilidad.DISPONIBLE)) {
                    accion = true;
                    concesionario.getListaVehiculos().remove(vehiculo);
                    sede.getListaVehiculos().remove(vehiculo);
                    break;
                }
            }
        }
        return accion;
    }

    /**
     * Metodo para agregar una venta a la lista de ventas de la sede del empleado
     * @param venta Venta que se busca agregar
     * @return Booleano sobre si se pudo agregar la venta o no
     */
    public boolean agregarVenta(Venta venta){
        boolean accion = false;
        if (isAutenticado() && !verificarVenta(venta.getCodigo()) && venta.getVehiculo().getEstadoDisponibilidad().equals(Estado_disponibilidad.DISPONIBLE) && venta.getSede().equals(sede) && venta.getVehiculo().getTipoUso().equals(Tipo_uso.VENTA) && venta.getEmpleado().getIdentificacion().equals(super.getIdentificacion()) && verificarCliente(venta.getCliente().getIdentificacion()) && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            listaVentas.add(venta);
            sede.getListaVentas().add(venta);
            sede.aumentarDineroGenerado(venta.getTotalVenta());
            sede.setDineroGanadoNeto(sede.calcularDineroGanadoNeto());
            sede.getListaVehiculos().remove(venta.getVehiculo());
            concesionario.getListaVehiculos().remove(venta.getVehiculo());
            accion = true;
        }
        return accion;
    }
    /**
     * Metodo para verificar si hay una venta en la lista de ventas de la sede que tenga el mismo codigo que uno dado
     * @param codigo Codigo a verificar
     * @return Booleano sobre si existe una venta que cumpla con esa condición o no
     */
    public boolean verificarVenta(int codigo){
        boolean accion = false;
        if (isAutenticado()) {
            for (Venta venta : sede.getListaVentas()) {
                if (venta.getCodigo() == codigo) {
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para eliminar la venta de la lista de ventas de la sede que tenga el mismo codigo que uno dado
     * @param codigo Codigo de la venta a eliminar
     * @return Booleano sobre si se pudo eliminar la venta o no
     */
    public boolean eliminarVenta(int codigo){
        boolean accion = false;
        if (isAutenticado() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            for (Venta venta : sede.getListaVentas()) {
                if (venta.getCodigo() == codigo && venta.getEmpleado().getIdentificacion().equals(super.getIdentificacion())) {
                    venta.getVehiculo().setEstadoDisponibilidad(Estado_disponibilidad.DISPONIBLE);
                    listaVentas.remove(venta);
                    sede.aumentarDineroGenerado(venta.getTotalVenta()*-1);
                    sede.getListaVentas().remove(venta);
                    sede.getListaVehiculos().add(venta.getVehiculo());
                    concesionario.getListaVehiculos().add(venta.getVehiculo());
                    sede.setDineroGanadoNeto(sede.calcularDineroGanadoNeto());
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para agregar un alquiler a la lista de alquileres de la sede y del empleado
     * @param alquiler Alquiler que se busca agregar
     * @return Booleano sobre si se pudo agregar el alquiler o no
     */
    public boolean agregarAlquiler(Alquiler alquiler){
        boolean accion = false;
        if (isAutenticado() && !verificarAlquiler(alquiler.getCodigo()) && alquiler.getVehiculo().getEstadoDisponibilidad().equals(Estado_disponibilidad.DISPONIBLE) && alquiler.getSede().equals(sede) && alquiler.getVehiculo().getTipoUso().equals(Tipo_uso.ALQUILER) && verificarCliente(alquiler.getCliente().getIdentificacion()) && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            sede.getListaAlquileres().add(alquiler);
            alquiler.getVehiculo().setEstadoDisponibilidad(Estado_disponibilidad.NO_DISPONIBLE);
            listaAlquileres.add(alquiler);
            accion = true;
        }
        return accion;
    }

    /**
     * Metodo para verificar si hay un alquiler con el mismo codigo que uno administrado
     * @param codigo Codigo a verificar
     * @return Booleano sobre si hay algun alquiler con esa condicion o no
     */
    public boolean verificarAlquiler(int codigo){
        boolean accion = false;
        if (isAutenticado()) {
            for (Alquiler alquiler : sede.getListaAlquileres()) {
                if (alquiler.getCodigo() == codigo) {
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para eliminar un alquiler de la lista de alquileres de la sede y del empleado
     * @param codigo Codigo del alquiler que se busca eliminar
     * @return Booleano sobre si se pudo eliminar el alquiler o no
     */
    public boolean eliminarAlquiler(int codigo){
        boolean accion = false;
        if (isAutenticado() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            for (Alquiler alquiler : listaAlquileres) {
                if (alquiler.getCodigo() == codigo && alquiler.getEmpleado().getIdentificacion().equals(super.getIdentificacion())) {
                    if (alquiler.getEstadoAlquiler().equals(Estado_alquiler.PAGADO)) {
                        sede.aumentarDineroGenerado(alquiler.getTotalPrestamo()*-1);
                        sede.setDineroGanadoNeto(sede.calcularDineroGanadoNeto());
                    }
                    else{
                        alquiler.getVehiculo().setEstadoDisponibilidad(Estado_disponibilidad.DISPONIBLE);
                    }
                    listaAlquileres.remove(alquiler);
                    sede.getListaAlquileres().remove(alquiler);
                    accion = true;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para entregar un alquiler
     * @param codigo Codigo del alquiler
     * @param fechaEntrega Fecha de entrega del alquiler
     * @return Booleano sobre si se pudo entregar el alquiler o no
     */
    public boolean entregarAlquiler(int codigo, LocalDate fechaEntrega){
        boolean accion = false;
        if (isAutenticado()) {
            for (Alquiler alquiler : listaAlquileres) {
                if (alquiler.getCodigo() == codigo && alquiler.getEmpleado().getIdentificacion().equals(super.getIdentificacion()) && alquiler.getEstadoAlquiler().equals(Estado_alquiler.PENDIENTE) && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
                    LocalDate fechaAlquiler = alquiler.getFechaAlquiler();
                    if (fechaEntrega.isAfter(fechaAlquiler) || fechaEntrega.isEqual(fechaAlquiler)) {
                        int diasPrestamo = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaEntrega);
                        double totalPrestamo = diasPrestamo*alquiler.getPrecioPorDia();
                        alquiler.setTotalPrestamo(totalPrestamo);
                        alquiler.getVehiculo().setEstadoDisponibilidad(Estado_disponibilidad.DISPONIBLE);
                        alquiler.setEstadoAlquiler(Estado_alquiler.PAGADO);
                        alquiler.setFechaEntregaAlquiler(fechaEntrega);
                        sede.aumentarDineroGenerado(totalPrestamo);
                        sede.setDineroGanadoNeto(sede.calcularDineroGanadoNeto());
                        accion = true;
                    }
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para actualizar un alquiler de la lista de alquileres de la sede del empleado
     * @param codigo Codigo a verificar
     * @param alquilerNuevo Alquiler con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el alquiler o no
     */
    public boolean actualizarAlquiler(int codigo, Alquiler alquilerNuevo){
        boolean accion = false;
        if (isAutenticado() && alquilerNuevo.getSede().equals(sede) && estadoEmpleado.equals(Estado_empleado.ACTIVO)){
            for (Alquiler alquiler : listaAlquileres) {
                if (alquiler.getCodigo() == codigo && alquilerNuevo.getCodigo() == codigo && alquiler.getEstadoAlquiler().equals(Estado_alquiler.PENDIENTE)) {
                    accion = true;
                    alquiler.setCliente(alquilerNuevo.getCliente());
                    alquiler.setVehiculo(alquilerNuevo.getVehiculo());
                    alquiler.setPrecioPorDia(alquilerNuevo.getPrecioPorDia());
                    alquiler.setFechaAlquiler(alquilerNuevo.getFechaAlquiler());
                }
            }
        }
        return accion;
    }

    /**
     * Metodo para agregar una compra a la lista de compras del empleado y de la sede
     * @param compra Compra que se busca agregar
     * @return Booleano sobre si se pudo agregar la compra o no
     */
    public boolean agregarCompra(Compra compra){
        boolean accion = false;
        if (!verificarCompra(compra.getCodigo()) && isAutenticado() && !compra.isConcretada() && compra.getSede().equals(sede) && verificarCliente(compra.getCliente().getIdentificacion()) && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            listaCompras.add(compra);
            sede.getListaCompras().add(compra);
            accion = true;
        }
        return accion;
    }
    /**
     * Metodo para verificar si hay una compra con el mismo codigo que uno dado en la lista de compras de la sede 
     * @param codigo Codigo a verificar
     * @return Booleano sobre si existe una compra con esta condicion o no
     */
    public boolean verificarCompra(int codigo){
        boolean accion = false;
        if (isAutenticado()) {
            for (Compra compra : sede.getListaCompras()) {
                if (compra.getCodigo() == codigo) {
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para eliminar una compra de la lista de compras del empleado y su sede
     * @param codigo Codigo de la compra a eliminar
     * @return Booleano sobre si se pudo eliminar la compra o no
     */
    public boolean eliminarCompra(int codigo){
        boolean accion = false;
        if (isAutenticado() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
            for (Compra compra : sede.getListaCompras()) {
                if (compra.getCodigo() == codigo) {
                    if (compra.isConcretada()) {
                        devolverVehiculos(compra.getListaDetallesCompra());
                    }
                    sede.getListaCompras().remove(compra);
                    listaCompras.remove(compra);
                    sede.setDineroGanadoNeto(sede.calcularDineroGanadoNeto());
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para devolver todos los vehiculos que se compraron y reembolsar el dinero
     * @param listaDetallesCompra Lista de detalles de compra de la compra que se va a devolver
     */
    public void devolverVehiculos(List<Detalle_compra> listaDetallesCompra){
        for (Detalle_compra detalle_compra : listaDetallesCompra) {
            if (detalle_compra.getVehiculo().getEstadoDisponibilidad().equals(Estado_disponibilidad.DISPONIBLE)) {
                sede.getListaVehiculos().remove(detalle_compra.getVehiculo());
                concesionario.getListaVehiculos().remove(detalle_compra.getVehiculo());
                sede.aumentarDineroGastado(detalle_compra.getSubtotal()*-1); 
            }
        }
    }
    /**
     * Metodo para concretar una compra relacionada a un codigo administrado
     * @param codigo Codigo administrado
     * @return Booleano sobre si se pudo concretar la compra o no
     */
    public boolean concretarCompra(int codigo){
        boolean accion = false;
        for (Compra compraTemporal : sede.getListaCompras()) {
            if (compraTemporal.getCodigo() == codigo && !compraTemporal.isConcretada() && estadoEmpleado.equals(Estado_empleado.ACTIVO)) {
                compraTemporal.setConcretada(true);
                for (Detalle_compra detalleCompra : compraTemporal.getListaDetallesCompra()) {
                    Vehiculo vehiculo = detalleCompra.getVehiculo();
                    sede.getListaVehiculos().add(vehiculo);
                    concesionario.getListaVehiculos().add(vehiculo);
                }
                accion = true;
                sede.aumentarDineroGastado(compraTemporal.getTotalCompra());
                sede.setDineroGanadoNeto(sede.calcularDineroGanadoNeto());
                break;
            }
        }
        return accion;
    }
    /**
     * Metodo para actualizar una compra de la lista de compras de la sede del empleado
     * @param codigo Codigo a verificar
     * @param compraNueva Compra con los datos nuevos
     * @return Booleano sobre si se pudo actualizar el alquiler o no
     */
    public boolean actualizarCompra(int codigo, Compra compraNueva){
        boolean accion = false;
        if (isAutenticado() && compraNueva.getSede().equals(sede) && estadoEmpleado.equals(Estado_empleado.ACTIVO)){
            for (Compra compra : listaCompras) {
                if (compra.getCodigo() == codigo && compraNueva.getCodigo() == codigo && !compra.isConcretada()) {
                    accion = true;
                    compra.setCliente(compraNueva.getCliente());
                    compra.setFechaCompra(compraNueva.getFechaCompra());
                }
            }
        }
        return accion;
    }

    /**
     * Metodo para recuperar las credenciales del empleado
     * @param respuesta Respuesta dada a la pregunta de seguridad
     * @param nuevoUsuario Nuevo usuario
     * @param nuevaPassword Nueva contraseña
     * @return Booleano sobre si se pudo recuperar las credenciales o no
     */
    @Override
    public boolean recuperarCredenciales(String respuesta, String nuevoUsuario, int nuevaPassword){
        boolean accion = false;
        if (respuesta.equals(respuestaPregunta)) {
            if (!nuevoUsuario.equals(usuario)) {
                if (!concesionario.verificarUsuario(nuevoUsuario)) {
                    setUsuario(nuevoUsuario);
                    setPassword(nuevaPassword);
                    return accion = true;
                }  
            }
            else if (nuevoUsuario.equals(usuario)) {
                setPassword(nuevaPassword);
                return accion = true;
            } 
        }
        return accion;
    }
}