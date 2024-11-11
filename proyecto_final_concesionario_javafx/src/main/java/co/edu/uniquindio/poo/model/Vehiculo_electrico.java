package co.edu.uniquindio.poo.model;

public class Vehiculo_electrico extends Vehiculo{
    private int autonomiaMinutos;
    private int tiempoCarga;
    
    /**
     * Metodo constructor de la clase vehiculo electrico
     * @param placa Placa del vehiculo electrico a crear
     * @param marca Marca del vehiculo electrico a crear
     * @param estadoVehiculo Estado del vehiculo electrico a crear
     * @param modelo Modelo del vehiculo electrico a crear
     * @param cantidadCambios Cantidad de cambios del vehiculo electrico a crear
     * @param velocidadMax Velocidad maxima del vehiculo electrico a crear
     * @param cilindraje Cilindraje del vehiculo electrico a crear
     * @param tipoTransmision Tipo de transmision del vehiculo electrico a crear
     * @param tipoUso Tipo de uso del vehiculo electrico a crear
     * @param autonomiaMinutos Autonomio de carga completa del vehiculo electrico a crear
     * @param tiempoCarga Tiempo de carga completa del vehiculo electrico a crear
     * @param Sede Sede del vehiculo a crear
     */
    public Vehiculo_electrico(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, int autonomiaMinutos, int tiempoCarga, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
        this.autonomiaMinutos = autonomiaMinutos;
        this.tiempoCarga = tiempoCarga;
    }

    /**
     * Metodo para obtener la autonomia en minutos del vehiculo electrico
     * @return Autonomia en minutos del vehiculo electrico
     */
    public int getAutonomiaMinutos() {
        return autonomiaMinutos;
    }
    /**
     * Metodo para obtener el tiempo de carga del vehiculo electrico
     * @return Tiempo de carga del vehiculo electrico
     */
    public int getTiempoCarga() {
        return tiempoCarga;
    }

    /**
     * Metodo para modificar la autonomia en minutos del vehiculo electrico
     * @param autonomiaMinutos Nueva autonomia en minutos del vehiculo electrico
     */
    public void setAutonomiaMinutos(int autonomiaMinutos) {
        this.autonomiaMinutos = autonomiaMinutos;
    }
    /**
     * Metodo para modificar el tiempo de carga del vehiculo electrico
     * @param tiempoCarga Nuevo tiempo de carga del vehiculo electrico
     */
    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }
}
