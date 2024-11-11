package co.edu.uniquindio.poo.model;

public class Van extends Vehiculo_diesel{
    private int numPasajeros, numPuertas, numBolsasAire;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneABS;
    
    /**
     * Metodo constructor de la clase Van
     * @param placa Placa de la van a crear
     * @param marca Marca de la van a crear
     * @param estadoVehiculo Estado de la van a crear
     * @param modelo Modelo de la van a crear
     * @param cantidadCambios Cantidad de cambios de la van a crear
     * @param velocidadMax Velocidad maxima de la van a crear
     * @param cilindraje Cilindraje de la van a crear
     * @param tipoTransmision Tipo de transmision de la van a crear
     * @param tipoUso Tipo de uso de la van a crear
     * @param numPasajeros Numero de pasajeros de la van a crear
     * @param numPuertas Numero de puertas de la van a crear
     * @param numBolsasAire Numero de bolsas de aire de la van a crear
     * @param capacidadMaletero Capacidad de maletero de la van a crear
     * @param tieneAireAcondicionado Booleano sobre si la van a crear tiene aire acondicionado o no
     * @param tieneCamaraReversa Booleano sobre si la van a crear tiene camara de reversa o no
     * @param tieneABS Booleano sobre si la van a crear tiene ABS o no
     * @param Sede Sede del vehiculo a crear
     */
    public Van(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, int numPasajeros, int numPuertas, int numBolsasAire, double capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, boolean tieneABS, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneABS = tieneABS;
    }

    /**
     * Metodo para obtener el numero de pasajeros de la van
     * @return Numero de pasajeros de la van
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    /**
     * Metodo para obtener el numero de puertas de la van
     * @return Numero de puertas de la van
     */
    public int getNumPuertas() {
        return numPuertas;
    }
    /**
     * Metodo para obtener el numero de bolsas de aire de la van
     * @return Numero de bolsas de aire de la van
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    /**
     * Metodo para obtener la capacidad del maletero de la van
     * @return Capacidad del maletero de la van
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    /**
     * Metodo para saber si la van tiene aire acondicionado o no
     * @return Booleano sobre si la van tiene aire acondicionado o no
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    /**
     * Metodo para saber si la van tiene camara de reversa o no
     * @return Booleano sobre si la van tiene camara de reversa o no
     */
    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }
    /**
     * Metodo para saber si la van tiene abs o no
     * @return Booleano sobre si la van tiene abs o no
     */
    public boolean isTieneABS() {
        return tieneABS;
    }

    /**
     * Metodo para modificar el numero de pasajeros de la van
     * @param numPasajeros Nuevo numero de pasajeros de la van
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    /**
     * Metodo para modificar el numero de puertas de la van
     * @param numPuertas Nuevo numero de puertas de la van
    */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    /**
     * Metodo para modificar el numero de bolsas de aire de la van
     * @param numBolsasAire Nuevo numero de bolsas de aire de la van
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    /**
     * Metodo para modificar la capacidad del maletero de la van
     * @param capacidadMaletero Nueva capacidad del maletero de la van
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    /**
     * Metodo para modificar si la van tiene aire acondicionado o no
     * @param tieneAireAcondicionado Nuevo booleano sobre si la van tiene aire acondicionado o no
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    /**
     * Metodo para modificar si la van tiene camara de reversa o no
     * @param tieneCamaraReversa Nuevo booleano sobre si la van tiene camara de reversa o no
     */
    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }
    /**
     * Metodo para modificar si la van tiene abs o no
     * @param tieneABS Nuevo booleano sobre si la van tiene abs o no
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
}