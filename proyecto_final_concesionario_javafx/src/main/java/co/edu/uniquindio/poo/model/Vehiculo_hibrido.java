package co.edu.uniquindio.poo.model;

public class Vehiculo_hibrido extends Vehiculo{
    private boolean esEnchufable;
    private boolean esHibridoLigero;
    
    /**
     * Metodo constructor de la clase vehiculo hibrido
     * @param placa Placa del vehiculo hibrido a crear
     * @param marca Marca del vehiculo hibrido a crear
     * @param estadoVehiculo Estado del vehiculo hibrido a crear
     * @param modelo Modelo del vehiculo hibrido a crear
     * @param cantidadCambios Cantidad de cambios del vehiculo hibrido a crear
     * @param velocidadMax Velocidad maxima del vehiculo hibrido a crear
     * @param cilindraje Cilindraje del vehiculo hibrido a crear
     * @param tipoTransmision Tipo de transmision del vehiculo hibrido a crear
     * @param tipoUso Tipo de uso del vehiculo hibrido a crear
     * @param esEnchufable Booleano sobre si el vehiculo hibrido a crear es enchufable o no
     * @param esHibridoLigero Booleano sobre si el vehiculo hibrido a crear es hibrido ligero o no
     * @param Sede Sede del vehiculo a crear
     */
    public Vehiculo_hibrido(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, boolean esEnchufable, boolean esHibridoLigero, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
        this.esEnchufable = esEnchufable;
        this.esHibridoLigero = determinarHibridoLigero(esEnchufable, esHibridoLigero);
    }

    /**
     * Metodo para determinar si un vehiculo es hibrido ligero o no determinado con si es enchufable o no
     * @param esEnchufable Booleano sobre si el vehiculo es enchufable o no
     * @param esHibridoLigero Booleano sobre si el vehiculo es hibrido ligero o no dado por el usuario
     * @return Booleano sobre si el vehiculo es verdaderamente hibrido ligero o no
     */
    public boolean determinarHibridoLigero(boolean esEnchufable, boolean esHibridoLigero){
        boolean esHibridoLigeroTemporal;
        if (esEnchufable) {
            esHibridoLigeroTemporal = esHibridoLigero;
        }
        else{
            esHibridoLigeroTemporal = false;
        }
        return esHibridoLigeroTemporal;
    }

    /**
     * Metodo para obtener si el vehiculo hibrido es enchufable o no
     * @return Booleano sobre si el vehiculo hibrido es enchufable o no
     */
    public boolean isEsEnchufable() {
        return esEnchufable;
    }
    /**
     * Metodo para obtener si el vehiculo hibrido es ligero o no
     * @return Booleano sobre si el vehiculo hibrido es ligero o no
     */
    public boolean isEsHibridoLigero() {
        return esHibridoLigero;
    }

    /**
     * Metodo para modificar si el vehiculo hibrido es enchufable o no
     * @param esEnchufable Nuevo booleano sobre si el vehiculo hibrido es enchufable o no
     */
    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }
    /**
     * Metodo para obtener si el vehiculo hibrido es ligero o no
     * @param esHibridoLigero Nuevo booleano sobre si el vehiculo hibrido es ligero o no
     */
    public void setEsHibridoLigero(boolean esHibridoLigero) {
        this.esHibridoLigero = esHibridoLigero;
    }
}
