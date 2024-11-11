package co.edu.uniquindio.poo.model;

public class Vehiculo_diesel extends Vehiculo{
    
    /**
     * Metodo constructor de la clase vehiculo diesel
     * @param placa Placa del vehiculo diesel a crear
     * @param marca Marca del vehiculo diesel a crear
     * @param estadoVehiculo Estado del vehiculo diesel a crear
     * @param modelo Modelo del vehiculo diesel a crear
     * @param cantidadCambios Cantidad de cambios del vehiculo diesel a crear
     * @param velocidadMax Velocidad maxima del vehiculo diesel a crear
     * @param cilindraje Cilindraje del vehiculo diesel a crear
     * @param tipoTransmision Tipo de transmision del vehiculo diesel a crear
     * @param tipoUso Tipo de uso del vehiculo diesel a crear
     * @param Sede Sede del vehiculo a crear
     */
    public Vehiculo_diesel(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
    }
    
}