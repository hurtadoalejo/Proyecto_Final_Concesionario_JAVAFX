package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Administrador extends Persona implements ICredencialAcceso, IVerificarPersona{
    private double salarioBase;
    private Sede sede;
    private String usuario;
    private int password;
    private boolean autenticado;
    private Concesionario concesionario;
    private String respuestaPregunta;

    /**
     * Metodo constructor de la clase Administrador
     * @param nombre Nombre del administrador a crear
     * @param identificacion Identificacion del administrador a crear
     * @param correo Correo del administrador a crear
     * @param salarioBase Salario base del administrador a crear
     * @param sede Sede del administrador a crear
     * @param usuario Usuario del administrador a crear
     * @param password Contraseña del administrador a crear
     * @param concesionario Concesionario del administrador a crear
     * @param respuestaPregunta Respuesta de la pregunta de seguridad del administrador a crear
     */
    public Administrador(String nombre, String identificacion, String correo, double salarioBase, Sede sede, String usuario, int password, Concesionario concesionario, String respuestaPregunta) {
        super(nombre, identificacion, correo);
        this.salarioBase = salarioBase;
        this.sede = sede;
        this.usuario = usuario;
        this.password = password;
        this.autenticado = false;
        this.concesionario = concesionario;
        this.respuestaPregunta = respuestaPregunta;
    }

    /**
     * Metodo para obtener el salario base del administrador
     * @return Salario base del administrador
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    /**
     * Metodo para obtener la sede del administrador
     * @return Sede del administrador
     */
    public Sede getSede() {
        return sede;
    }
    /**
     * Metodo para obtener el usuario del administrador
     * @return Usuario del administrador
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Metodo para obtener la contraseña del administrador
     * @return Contraseña del administrador
     */
    public int getPassword() {
        return password;
    }
    /**
     * Metodo para saber si el administrador esta autenticado o no
     * @return Booleano sobre si el administrador esta autenticado o no
     */
    public boolean isAutenticado() {
        return autenticado;
    }
    /**
     * Metodo para obtener el concesionario del administrador
     * @return Concesionario del administrador
     */
    public Concesionario getConcesionario() {
        return concesionario;
    }
    /**
     * Metodo para obtener la respuesta de la pregunta del administrador
     * @return Respuesta de la pregunta del administrador
     */
    public String getRespuestaPregunta() {
        return respuestaPregunta;
    }

    /**
     * Metodo para modificar el salario base del administrador
     * @param salarioBase Nuevo salario base del administrador
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    /**
     * Metodo para modificar la sede del administrador
     * @param sede Nueva sede del administrador
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }
    /**
     * Metodo para modificar el usuario del administrador
     * @param usuario Nuevo usuario del administrador
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Metodo para modificar la contraseña del administrador
     * @param password Nueva contraseña del administrador
     */
    public void setPassword(int password) {
        this.password = password;
    }
    /**
     * Metodo para modificar si el administrador esta autenticado o no
     * @param autenticado Nuevo booleano sobre si el administrador esta autenticado o no
     */
    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
    /**
     * Metodo para modificar el concesionario del administrador
     * @param concesionario Nuevo concesionario del administrador
     */
    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }
    /**
     * Metodo para modificar la respuesta de la pregunta del administrador
     * @param respuestaPregunta Nueva respuesta de la pregunta del administrador
     */
    public void setRespuestaPregunta(String respuestaPregunta) {
        this.respuestaPregunta = respuestaPregunta;
    }

    /**
     * Metodo para autenticar el usuario y contraseña de un administrador
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
     * Metodo para agregar un empleado a la sede del administrador
     * @param empleado Empleado que se busca agregar
     * @return Booleano sobre si se pudo agregar el empleado o no
     */
    public boolean agregarEmpleado(Empleado empleado){
        boolean accion = false;
        if (!verificarPersona(empleado.getIdentificacion()) && isAutenticado() && verificarAdministradorAncladoSede() && !concesionario.verificarUsuario(empleado.getUsuario())) {
            empleado.setEstadoEmpleado(Estado_empleado.ACTIVO);
            concesionario.getListaEmpleados().add(empleado);
            sede.getListaEmpleados().add(empleado);
            accion = true;
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
     * Metodo para actualizar un empleado que coincida con un numero de cedula
     * @param cedula Cedula del empleado que se busca actualizar
     * @param empleadoNuevo Empleado con los datos nuevos
     * @return Booleanos sobre si se pudo o no actualizar el empleado
     */
    public boolean actualizarEmpleado(String cedula, Empleado empleadoNuevo){
        boolean accion = false;
        for (Empleado empleado : concesionario.getListaEmpleados()) {
            if (empleado.getIdentificacion().equals(cedula) && empleadoNuevo.getIdentificacion().equals(cedula) && isAutenticado() && verificarAdministradorAncladoSede()) {
                empleado.setNombre(empleadoNuevo.getNombre());
                empleado.setCorreo(empleadoNuevo.getCorreo());
                empleado.setSalarioBase(empleadoNuevo.getSalarioBase());
                empleado.setPassword(empleadoNuevo.getPassword());
                empleado.setRespuestaPregunta(empleadoNuevo.getRespuestaPregunta());
                if (!verificarNegociosPendientesEmpleado(empleado)) {
                    empleado.setSede(empleadoNuevo.getSede());
                }
                if (!empleadoNuevo.getUsuario().equals(usuario) && !concesionario.verificarUsuario(empleadoNuevo.getUsuario())) {
                    empleado.setUsuario(empleadoNuevo.getUsuario());
                }
                accion = true;
                break;
            }
        }
        return accion;
    }

    /**
     * Metodo para verificar si un empleado tiene negocios pendientes en su sede
     * @param empleado Empleado a verificar
     * @return Booleano sobre si tiene o no negocios pendientes en su sede
     */
    public boolean verificarNegociosPendientesEmpleado(Empleado empleado){
        boolean accion = false;
        for (Compra compra : empleado.getListaCompras()) {
            if (!compra.isConcretada()) {
                return accion = true;
            }
        }
        for (Alquiler alquiler : empleado.getListaAlquileres()) {
            if (alquiler.getEstadoAlquiler().equals(Estado_alquiler.PENDIENTE)) {
                return accion = true;
            }
        }
        return accion;
    }

    /**
     * Metodo para eliminar un empleado de la lista de empleados de su sede y del concesionario
     * @param identificacion Identificacion del empleado a eliminar
     * @return Booleano sobre si se pudo eliminar o no el empleado
     */
    public boolean eliminarEmpleado(String identificacion){
        boolean accion = false;
        if (isAutenticado() && verificarAdministradorAncladoSede()) {
            for (Empleado empleado : concesionario.getListaEmpleados()) {
                if (empleado.getIdentificacion().equals(identificacion) && !verificarNegociosPendientesEmpleado(empleado)) {
                    concesionario.getListaEmpleados().remove(empleado);
                    empleado.getSede().getListaEmpleados().remove(empleado);
                    empleado.setEstadoEmpleado(Estado_empleado.NO_ACTIVO);
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }

    /**
     * Metodo para recuperar las credenciales del administrador
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

    /**
     * Metodo para verificar si el administrador si esta anclado a la sede que tiene asignada
     * @return Booleano sobre si el administrador si esta anclado a la sede que tiene asignada o no
     */
    public boolean verificarAdministradorAncladoSede(){
        boolean accion = false;
        if (sede.getAdministrador() != null) {
            if (sede.getAdministrador().getIdentificacion().equals(super.getIdentificacion())) {
                accion = true;
            }
        }
        return accion;
    }

    /**
     * Metodo para agregar un reporte a la lista de reportes de la sede
     * @param reporte Reporte que se busca agregar
     * @return Booleano sobre si se pudo agregar el reporte o no
     */
    public boolean agregarReporte(Reporte reporte){
        boolean accion = false;
        if (verificarFechasReporte(reporte.getFechaInicio(), reporte.getFechaFin())) {
            if (!verificarReporte(reporte.getCodigo()) && isAutenticado()) {
                sede.getListaReportes().add(reporte);
                accion = true;
            }
        }
        return accion;
    }

    /**
     * Metodo para verificar si hay algun reporte en la sede con el mismo codigo que uno administrado
     * @param codigo Codigo a verificar
     * @return Booleano sobre si existe un reporte con esta condicion o no
     */
    public boolean verificarReporte(int codigo){
        boolean accion = false;
        for (Reporte reporte : sede.getListaReportes()) {
            if (reporte.getCodigo() == codigo) {
                accion = true;
            }
        }
        return accion;
    }

    public boolean verificarFechasReporte(LocalDate fechaInicio, LocalDate fechaFin){
        boolean accion = true;
        if (fechaInicio.isAfter(fechaFin)) {
            accion = false;
        }
        return accion;
    }

    /**
     * Metodo para eliminar un reporte de la lista de reportes de la sede
     * @param codigo Codigo del reporte a eliminar
     * @return Booleano sobre si se pudo eliminar el reporte o no
     */
    public boolean eliminarReporte(int codigo){
        boolean accion = false;
        if (isAutenticado()) {
            for (Reporte reporte : sede.getListaReportes()) {
                if (reporte.getCodigo() == codigo) {
                    sede.getListaReportes().remove(reporte);
                    accion = true;
                }
            } 
        }
        return accion;
    }
}