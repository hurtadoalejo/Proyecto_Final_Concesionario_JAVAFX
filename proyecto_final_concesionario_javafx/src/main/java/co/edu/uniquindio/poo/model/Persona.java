package co.edu.uniquindio.poo.model;

public class Persona {
    private String nombre, identificacion, correo;
    
    /**
     * Metodo constructor de la clase Persona
     * @param nombre Nombre de la persona a crear
     * @param identificacion Identificacion de la persona a crear
     * @param correo Correo de la persona a crear
     */
    public Persona(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    /**
     * Metodo para obtener el nombre de la persona
     * @return Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }   
    /**
     * Metodo para obtener la identificacion de la persona
     * @return Identificacion de la persona
     */
    public String getIdentificacion() {
        return identificacion;
    }
    /**
     * Metodo para obtener el correo de la persona
     * @return Correo de la persona
     */
    public String getCorreo() {
        return correo;
    }
    
    /**
     * Metodo para modificar el nombre de la persona
     * @param nombre Nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la identificacion de la persona
     * @param identificacion Nueva identificacion de la persona
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * Metodo para modificar el correo de la persona
     * @param correo Nuevo correo de la persona
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para obtener la informacion de la persona
     * @return Informacion de la persona
     */
    @Override
    public String toString() {
        String info = "";
        return info;
    }
}