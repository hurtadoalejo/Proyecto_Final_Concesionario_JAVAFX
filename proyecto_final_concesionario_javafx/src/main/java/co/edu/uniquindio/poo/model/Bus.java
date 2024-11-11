package co.edu.uniquindio.poo.model;

public class Bus extends Vehiculo_hibrido{
    private int numPasajeros, numPuertas, numBolsasAire, numEjes, numSalidasEmergencia;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneABS;
    
    /**
     * Metodo constructor de la clase Bus
     * @param placa Placa del bus a crear
     * @param marca Marca del bus a crear
     * @param estadoVehiculo Estado del bus a crear
     * @param modelo Modelo del bus a crear
     * @param cantidadCambios Cantidad de cambios del bus a crear
     * @param velocidadMax Velocidad maxima del bus a crear
     * @param cilindraje Cilindraje del bus a crear
     * @param tipoTransmision Tipo de transmision del bus a crear
     * @param tipoUso Tipo de uso del bus a crear
     * @param esEnchufable Booleano sobre si el bus a crear es enchufable o no
     * @param esHibridoLigero Booleano sobre si el bus a crear es hibrido ligero o no
     * @param numPasajeros Numero de pasajeros del bus a crear
     * @param numPuertas Numero de puertas del bus a crear
     * @param numBolsasAire Numero de bolsas de aire del bus a crear
     * @param numEjes Numero de ejes de aire del bus a crear
     * @param numSalidasEmergencia Numero de salidas de emergencia del bus a crear
     * @param capacidadMaletero Capacidad de maletero del bus a crear
     * @param tieneAireAcondicionado Booleano sobre si el bus a crear tiene aire acondicionado o no
     * @param tieneCamaraReversa Booleano sobre si el bus a crear tiene camara de reversa o no
     * @param tieneABS Booleano sobre si el bus a crear tiene ABS o no
     * @param Sede Sede del vehiculo a crear
     */
    public Bus(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios,double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, boolean esEnchufable, boolean esHibridoLigero, int numPasajeros, int numPuertas, int numBolsasAire, int numEjes, int numSalidasEmergencia, double capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, boolean tieneABS, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, esEnchufable, esHibridoLigero, sede);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneABS = tieneABS;
    }

    /**
     * Metodo para obtener el numero de pasajeros del bus
     * @return Numero de pasajeros del bus
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    /**
     * Metodo para obtener el numero de puertas del bus
     * @return Numero de puertas del bus
     */
    public int getNumPuertas() {
        return numPuertas;
    }
    /**
     * Metodo para obtener el numero de bolsas de aire del bus
     * @return Numero de bolsas de aire del bus
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    /**
     * Metodo para obtener la capacidad del maletero del bus
     * @return Capacidad del maletero del bus
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    /**
     * Metodo para obtener el numero de ejes del bus
     * @return Numero de ejes del bus
     */
    public int getNumEjes() {
        return numEjes;
    }
    /**
     * Metodo para obtener la capacidad del maletero del bus
     * @return Capacidad del maletero del bus
     */
    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }
    /**
     * Metodo para saber si el bus tiene aire acondicionado o no
     * @return Booleano sobre si el bus tiene aire acondicionado o no
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    /**
     * Metodo para saber si el bus tiene camara de reversa o no
     * @return Booleano sobre si el bus tiene camara de reversa o no
     */
    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }
    /**
     * Metodo para saber si el bus tiene abs o no
     * @return Booleano sobre si el bus tiene abs o no
     */
    public boolean isTieneABS() {
        return tieneABS;
    }

    /**
     * Metodo para modificar el numero de pasajeros del bus
     * @param numPasajeros Nuevo numero de pasajeros del bus
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    /**
     * Metodo para modificar el numero de puertas del bus
     * @param numPuertas Nuevo numero de puertas del bus
    */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    /**
     * Metodo para modificar el numero de bolsas de aire del bus
     * @param numBolsasAire Nuevo numero de bolsas de aire del bus
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    /**
     * Metodo para modificar la capacidad del maletero del bus
     * @param capacidadMaletero Nueva capacidad del maletero del bus
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    /**
     * Metodo para modificar el numero de ejes del bus
     * @param numEjes Nuevo numero de ejes del bus
     */
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    /**
     * Metodo para modificar el numero de salidas de emergencia del bus
     * @param numSalidasEmergencia Nuevo numero de salidas de emergencia del bus
     */
    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
    }
    /**
     * Metodo para modificar si el bus tiene aire acondicionado o no
     * @param tieneAireAcondicionado Nuevo booleano sobre el bus tiene aire acondicionado o no
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    /**
     * Metodo para modificar si el bus tiene camara de reversa o no
     * @param tieneCamaraReversa Nuevo booleano sobre el bus tiene camara de reversa o no
     */
    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }
    /**
     * Metodo para modificar si el bus tiene abs o no
     * @param tieneABS Nuevo booleano sobre si el bus tiene abs o no
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
}