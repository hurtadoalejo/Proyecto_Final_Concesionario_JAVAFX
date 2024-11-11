package co.edu.uniquindio.poo.model;

public class Deportivo extends Vehiculo_gasolina{
    private int numPasajeros, numPuertas, numBolsasAire;
    private double tiempoCienKm, numHP;
    
    /**
     * Metodo constructor de la clase Deportivo
     * @param placa Placa del deportivo a crear
     * @param marca Marca del deportivo a crear
     * @param estadoVehiculo Estado del deportivo a crear
     * @param modelo Modelo del deportivo a crear
     * @param cantidadCambios Cantidad de cambios del deportivo a crear
     * @param velocidadMax Velocidad maxima del deportivo a crear
     * @param cilindraje Cilindraje del deportivo a crear
     * @param tipoTransmision Tipo de transmision del deportivo a crear
     * @param tipoUso Tipo de uso del deportivo a crear
     * @param numPasajeros Numero de pasajeros del deportivo a crear
     * @param numPuertas Numero de puertas del deportivo a crear
     * @param numBolsasAire Numero de bolsas de aire del deportivo a crear
     * @param numHP Numero de caballos de fuerza del deportivo a crear
     * @param tiempoCienKm Tiempo en segundos que se demora en llegar de 0 a 100km por hora del deportivo a crear
     * @param Sede Sede del vehiculo a crear
     */
    public Deportivo(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, int numPasajeros, int numPuertas, int numBolsasAire, double numHP, double tiempoCienKm, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.numHP = numHP;
        this.tiempoCienKm = tiempoCienKm;
    }

    /**
     * Metodo para obtener el numero de pasajeros del deportivo
     * @return Numero de pasajeros del deportivo
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    /**
     * Metodo para obtener el numero de puertas del deportivo
     * @return Numero de puertas del deportivo
     */
    public int getNumPuertas() {
        return numPuertas;
    }
    /**
     * Metodo para obtener el numero de bolsas de aire del deportivo
     * @return Numero de bolsas de aire del deportivo
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    /**
     * Metodo para obtener el numero de caballos de fuerza del deportivo
     * @return Numero de caballos de fuerza del deportivo
     */
    public double getNumHP() {
        return numHP;
    }
    /**
     * Metodo para obtener el tiempo en segundos que se demora en llegar de 0 a 100km por hora del deportivo
     * @return Tiempo en segundos que se demora en llegar de 0 a 100km/h del deportivo
     */
    public double getTiempoCienKm() {
        return tiempoCienKm;
    }

    /**
     * Metodo para modificar el numero de pasajeros del deportivo
     * @param numPasajeros Nuevo numero de pasajeros del deportivo
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    /**
     * Metodo para modificar el numero de puertas del deportivo
     * @param numPuertas Nuevo numero de puertas del deportivo
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    /**
     * Metodo para modificar el numero de bolsas de aire del deportivo
     * @param numBolsasAire Nuevo numero de bolsas de aire del deportivo
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    /**
     * Metodo para modificar el numero de caballos de fuerza del deportivo
     * @param numHP Nuevo numero de caballos de fuerza del deportivo
     */
    public void setNumHP(double numHP) {
        this.numHP = numHP;
    }
    /**
     * Metodo para modificar el tiempo en segundos que se demora en llegar de 0 a 100km por hora del deportivo
     * @param tiempoCienKm Nuevo tiempo en segundos que se demora en llegar de 0 a 100km por hora del deportivo
     */
    public void setTiempoCienKm(double tiempoCienKm) {
        this.tiempoCienKm = tiempoCienKm;
    }
}