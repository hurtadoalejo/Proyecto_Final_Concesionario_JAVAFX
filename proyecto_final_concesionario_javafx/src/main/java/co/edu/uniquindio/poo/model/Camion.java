package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo_diesel{
    private boolean tieneAireAcondicionado, tieneFrenosAire, tieneABS;
    private int numEjes;
    private double capacidadCajaCarga;
    private String tipoCamion;
    
    /**
     * Metodo constructor de la clase Camion
     * @param placa Placa del camion a crear
     * @param marca Marca del camion a crear
     * @param estadoVehiculo Estado del camion a crear
     * @param modelo Modelo del camion a crear
     * @param cantidadCambios Cantidad de cambios del camion a crear
     * @param velocidadMax Velocidad maxima del camion a crear
     * @param cilindraje Cilindraje del camion a crear
     * @param tipoTransmision Tipo de transmision del camion a crear
     * @param tipoUso Tipo de uso del camion a crear
     * @param tieneAireAcondicionado Booleano sobre si el camion a crear tiene aire acondicionado o no
     * @param tieneFrenosAire Booleano sobre si el camion a crear tiene frenos de aire o no
     * @param tieneABS Booleano sobre si el camion a crear tiene ABS o no
     * @param numEjes Numero de ejes del camion a crear
     * @param capacidadCajaCarga Capacidad de la caja de carga del camion a crear
     * @param tipoCamion Tipo de camion del camion a crear
     * @param Sede Sede del vehiculo a crear
     */
    public Camion(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, boolean tieneAireAcondicionado, boolean tieneFrenosAire, boolean tieneABS, int numEjes, double capacidadCajaCarga, String tipoCamion, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, sede);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneFrenosAire = tieneFrenosAire;
        this.tieneABS = tieneABS;
        this.numEjes = numEjes;
        this.capacidadCajaCarga = capacidadCajaCarga;
        this.tipoCamion = tipoCamion;
    }

    /**
     * Metodo para saber si el camion tiene aire acondicionado o no
     * @return Booleano sobre si el camion tiene aire acondicionado o no
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    /**
     * Metodo para saber si el camion tiene frenos de aire o no
     * @return Booleano sobre si el camion tiene frenos de aire o no
     */
    public boolean isTieneFrenosAire() {
        return tieneFrenosAire;
    }
    /**
     * Metodo para saber si el camion tiene abs o no
     * @return Booleano sobre si el camion tiene abs o no
     */
    public boolean isTieneABS() {
        return tieneABS;
    }
    /**
     * Metodo para obtener el numero de ejes del camion
     * @return Numero de ejes del camion
     */
    public int getNumEjes() {
        return numEjes;
    }
    /**
     * Metodo para obtener el tipo de camion del camion
     * @return Tipo de camion del camion
     */
    public String getTipoCamion() {
        return tipoCamion;
    }
    /**
     * Metodo para obtener la capacidad de la caja de carga del camion
     * @return Capacidad de la caja de carga del camion
     */
    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }
    
    /**
     * Metodo para modificar si el camion tiene aire acondicionado o no
     * @param tieneAireAcondicionado Nuevo booleano sobre si el camion tiene aire acondicionado o no
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    /**
     * Metodo para modificar si el camion tiene frenos de aire o no
     * @param tieneFrenosAire
     */
    public void setTieneFrenosAire(boolean tieneFrenosAire) {
        this.tieneFrenosAire = tieneFrenosAire;
    }
    /**
     * Metodo para modificar si el camion tiene abs o no
     * @param tieneABS Nuevo booleano sobre si el camion tiene abs o no
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
    /**
     * Metodo para modificar el numero de ejes del camion
     * @param numEjes Nuevo numero de ejes del camion
     */
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    /**
     * Metodo para modificar el tipo de camion del camion
     * @param tipoCamion Nuevo tipo de camion del camion
     */
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
    /**
     * Metodo para modificar la capacidad de la caja de carga del camion
     * @param capacidadCajaCarga Nueva capacidad de la caja de carga del camion
     */
    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
}
