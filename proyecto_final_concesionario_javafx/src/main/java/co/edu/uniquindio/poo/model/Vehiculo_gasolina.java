package co.edu.uniquindio.poo.model;

public class Vehiculo_gasolina extends Vehiculo{
    
    /**
     * Metodo constructor de la clase vehiculo gasolina
     * @param placa Placa del vehiculo gasolina a crear
     * @param marca Marca del vehiculo gasolina a crear
     * @param estadoVehiculo Estado del vehiculo gasolina a crear
     * @param modelo Modelo del vehiculo gasolina a crear
     * @param cantidadCambios Cantidad de cambios del vehiculo gasolina a crear
     * @param velocidadMax Velocidad maxima del vehiculo gasolina a crear
     * @param cilindraje Cilindraje del vehiculo gasolina a crear
     * @param tipoTransmision Tipo de transmision del vehiculo gasolina a crear
     * @param tipoUso Tipo de uso del vehiculo gasolina a crear
     * @param Sede Sede del vehiculo a crear
     */
    public Vehiculo_gasolina(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
    }
    
}
