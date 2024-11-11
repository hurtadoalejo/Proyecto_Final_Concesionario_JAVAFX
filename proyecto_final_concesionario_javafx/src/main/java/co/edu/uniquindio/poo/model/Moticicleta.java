package co.edu.uniquindio.poo.model;

public class Moticicleta extends Vehiculo_gasolina{
    
    /**
     * Metodo constructor de la clase vehiculo Moto
     * @param placa Placa de la moto a crear
     * @param marca Marca de la moto a crear
     * @param estadoVehiculo Estado de la moto a crear
     * @param modelo Modelo de la moto a crear
     * @param cantidadCambios Cantidad de cambios de la moto a crear
     * @param velocidadMax Velocidad maxima de la moto a crear
     * @param cilindraje Cilindraje de la moto a crear
     * @param tipoTransmision Tipo de transmision de la moto a crear
     * @param tipoUso Tipo de uso de la moto a crear
     * @param Sede Sede del vehiculo a crear
     */
    public Moticicleta(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
    }
}