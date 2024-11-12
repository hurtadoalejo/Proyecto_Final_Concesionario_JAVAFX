package co.edu.uniquindio.poo.model;

public interface ICredencialAcceso {
    public boolean recuperarCredenciales(String respuesta, String nuevoUsuario, int nuevaPassword);
    public boolean autenticar(String usuarioDado, int passwordDada);
    public void cerrarSesion();
}
