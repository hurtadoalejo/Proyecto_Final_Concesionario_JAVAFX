package co.edu.uniquindio.poo.model;

public class Pick_up extends Vehiculo_electrico{
    private int numPasajeros, numPuertas, numBolsasAire;
    private double capacidadCajaCarga;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneABS, esCuatroXCuatro;
    
    /**
     * Metodo constructor de la clase Pick up
     * @param placa Placa de la Pick up a crear
     * @param marca Marca de la Pick up a crear
     * @param estadoVehiculo Estado de la Pick up a crear
     * @param modelo Modelo de la Pick up a crear
     * @param cantidadCambios Cantidad de cambios de la Pick up a crear
     * @param velocidadMax Velocidad maxima de la Pick up a crear
     * @param cilindraje Cilindraje de la Pick up a crear
     * @param tipoTransmision Tipo de transmision de la Pick up a crear
     * @param tipoUso Tipo de uso de la Pick up a crear
     * @param autonomiaMinutos Autonomio de carga completa de la Pick up a crear
     * @param tiempoCarga Tiempo de carga completa de la Pick up a crear
     * @param numPasajeros Numero de pasajeros de la Pick up a crear
     * @param numPuertas Numero de puertas de la Pick up a crear
     * @param numBolsasAire Numero de bolsas de aire de la Pick up a crear
     * @param capacidadCajaCarga Capacidad de la caja de carga de la Pick up a crear
     * @param tieneAireAcondicionado Booleano sobre si la Pick up a crear tiene aire acondicionado o no
     * @param tieneCamaraReversa Booleano sobre si la Pick up a crear tiene camara de reversa o no
     * @param tieneABS Booleano sobre si la Pick up a crear tiene ABS o no
     * @param esCuatroXCuatro Booleano sobre si la Pick up a crear es 4x4 o no
     * @param Sede Sede del vehiculo a crear
     */
    public Pick_up(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, int autonomiaMinutos, int tiempoCarga, int numPasajeros, int numPuertas, int numBolsasAire, double capacidadCajaCarga, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, boolean tieneABS, boolean esCuatroXCuatro, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, autonomiaMinutos, tiempoCarga, sede);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capacidadCajaCarga = capacidadCajaCarga;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneABS = tieneABS;
        this.esCuatroXCuatro = esCuatroXCuatro;
        setTipoVehiculo(Tipo_vehiculo.PICK_UP);
    }

    /**
     * Metodo para obtener el numero de pasajeros de la pick up
     * @return Numero de pasajeros de la pick up
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    /**
     * Metodo para obtener el numero de puertas de la pick up
     * @return Numero de puertas de la pick up
     */
    public int getNumPuertas() {
        return numPuertas;
    }
    /**
     * Metodo para obtener el numero de bolsas de aire de la pick up
     * @return Numero de bolsas de aire de la pick up
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    /**
     * Metodo para obtener la capacidad de la caja de carga de la pick up
     * @return Capacidad de la caja de carga de la pick up
     */
    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }
    /**
     * Metodo para saber si la pick up tiene aire acondicionado o no
     * @return Booleano sobre si la pick up tiene aire acondicionado o no
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    /**
     * Metodo para saber si la pick up tiene camara de reversa o no
     * @return Booleano sobre si la pick up tiene camara de reversa o no
     */
    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }
    /**
     * Metodo para saber si la pick up tiene abs o no
     * @return Booleano sobre si la pick up tiene abs o no
     */
    public boolean isTieneABS() {
        return tieneABS;
    }
    /**
     * Metodo para saber si la pick up es 4x4 o no
     * @return Booleano sobre si la pick up es 4x4 o no
     */
    public boolean isEsCuatroXCuatro() {
        return esCuatroXCuatro;
    }

    /**
     * Metodo para modificar el numero de pasajeros de la pick up
     * @param numPasajeros Nuevo numero de pasajeros de la pick up
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    /**
     * Metodo para modificar el numero de puertas de la pick up
     * @param numPuertas Nuevo numero de puertas de la pick up
    */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    /**
     * Metodo para modificar el numero de bolsas de aire de la pick up
     * @param numBolsasAire Nuevo numero de bolsas de aire de la pick up
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    /**
     * Metodo para modificar la capacidad de la caja de carga de la pick up
     * @param capacidadCajaCarga Nueva capacidad de la caja de carga de la pick up
     */
    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
    /**
     * Metodo para modificar si la pick up tiene aire acondicionado o no
     * @param tieneAireAcondicionado Nuevo booleano sobre si la pick up tiene aire acondicionado o no
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    /**
     * Metodo para modificar si la pick up tiene camara de reversa o no
     * @param tieneCamaraReversa Nuevo booleano sobre si la pick up tiene camara de reversa o no
     */
    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }
    /**
     * Metodo para modificar si la pick up tiene abs o no
     * @param tieneABS Nuevo booleano sobre si la pick up tiene abs o no
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
    /**
     * Metodo para modificar si la pick up es 4x4 o no
     * @param esCuatroXCuatro Nuevo booleano sobre si la pick up es 4x4 o no
     */
    public void setEsCuatroXCuatro(boolean esCuatroXCuatro) {
        this.esCuatroXCuatro = esCuatroXCuatro;
    }
}