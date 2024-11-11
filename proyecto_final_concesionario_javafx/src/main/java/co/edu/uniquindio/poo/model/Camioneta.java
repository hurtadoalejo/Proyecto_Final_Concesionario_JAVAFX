package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo_electrico{
    private int numPasajeros, numPuertas, numBolsasAire;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneVelocidadCrucero, tieneABS, tieneSensorColision, tieneSensorTraficoCruzado, tieneAsistentePermanenciaCarril, esCuatroXCuatro;
    
    /**
     * Metodo constructor de la clase Camioneta
     * @param placa Placa de la camioneta a crear
     * @param marca Marca de la camioneta a crear
     * @param estadoVehiculo Estado de la camioneta a crear
     * @param modelo Modelo de la camioneta a crear
     * @param cantidadCambios Cantidad de cambios de la camioneta a crear
     * @param velocidadMax Velocidad maxima de la camioneta a crear
     * @param cilindraje Cilindraje de la camioneta a crear
     * @param tipoTransmision Tipo de transmision de la camioneta a crear
     * @param tipoUso Tipo de uso de la camioneta a crear
     * @param autonomiaMinutos Autonomio de carga completa de la camioneta a crear
     * @param tiempoCarga Tiempo de carga completa de la camioneta a crear
     * @param numPasajeros Numero de pasajeros de la camioneta a crear
     * @param numPuertas Numero de puertas de la camioneta a crear
     * @param numBolsasAire Numero de bolsas de aire de la camioneta a crear
     * @param capacidadMaletero Capacidad de maletero de la camioneta a crear
     * @param tieneAireAcondicionado Booleano sobre si la camioneta a crear tiene aire acondicionado o no
     * @param tieneCamaraReversa Booleano sobre si la camioneta a crear tiene camara de reversa o no
     * @param tieneVelocidadCrucero Booleano sobre si la camioneta a crear tiene velocidad de crucero o no
     * @param tieneABS Booleano sobre si la camioneta a crear tiene ABS o no
     * @param tieneSensorColision Booleano sobre si la camioneta a crear tiene sensor de colision o no
     * @param tieneSensorTraficoCruzado Booleano sobre si la camioneta a crear tiene sensor de trafico cruzado o no
     * @param tieneAsistentePermanenciaCarril Booleano sobre si la camioneta a crear tiene asistente de permanencia de carril o no
     * @param esCuatroXCuatro Booleano sobre si la camioneta a crear es 4x4 o no
     * @param Sede Sede del vehiculo a crear
     */
    public Camioneta(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, int autonomiaMinutos, int tiempoCarga, int numPasajeros, int numPuertas, int numBolsasAire, double capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, boolean tieneVelocidadCrucero, boolean tieneABS, boolean tieneSensorColision, boolean tieneSensorTraficoCruzado, boolean tieneAsistentePermanenciaCarril, boolean esCuatroXCuatro, Sede sede) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, autonomiaMinutos, tiempoCarga, sede);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneABS = tieneABS;
        this.tieneSensorColision = tieneSensorColision;
        this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
        this.tieneAsistentePermanenciaCarril = tieneAsistentePermanenciaCarril;
        this.esCuatroXCuatro = esCuatroXCuatro;
    }
    
    /**
     * Metodo para obtener el numero de pasajeros de la camioneta
     * @return Numero de pasajeros de la camioneta
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    /**
     * Metodo para obtener el numero de puertas de la camioneta
     * @return Numero de puertas de la camioneta
     */
    public int getNumPuertas() {
        return numPuertas;
    }
    /**
     * Metodo para obtener el numero de bolsas de aire de la camioneta
     * @return Numero de bolsas de aire de la camioneta
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    /**
     * Metodo para obtener la capacidad del maletero de la camioneta
     * @return Capacidad del maletero de la camioneta
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    /**
     * Metodo para saber si la camioneta tiene aire acondicionado o no
     * @return Booleano sobre si la camioneta tiene aire acondicionado o no
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    /**
     * Metodo para saber si la camioneta tiene camara de reversa o no
     * @return Booleano sobre si la camioneta tiene camara de reversa o no
     */
    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }
    /**
     * Metodo para saber si la camioneta tiene velocidad de crucero o no
     * @return Booleano sobre si la camioneta tiene velocidad de crucero o no
     */
    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }
    /**
     * Metodo para saber si la camioneta tiene abs o no
     * @return Booleano sobre si la camioneta tiene abs o no
     */
    public boolean isTieneABS() {
        return tieneABS;
    }
    /**
     * Metodo para saber si la camioneta tiene sensor de colision o no
     * @return Booleano sobre si la camioneta tiene sensor de colision o no
     */
    public boolean isTieneSensorColision() {
        return tieneSensorColision;
    }
    /**
     * Metodo para saber si la camioneta tiene sensor de trafico cruzado o no
     * @return Booleano sobre si la camioneta tiene sensor de trafico cruzado o no
     */
    public boolean isTieneSensorTraficoCruzado() {
        return tieneSensorTraficoCruzado;
    }
    /**
     * Metodo para saber si la camioneta tiene asistente de permanencia de carril o no
     * @return Booleano sobre si la camioneta tiene asistente de permanencia de carril o no
     */
    public boolean isTieneAsistentePermanenciaCarril() {
        return tieneAsistentePermanenciaCarril;
    }
    /**
     * Metodo para saber si la camioneta es 4x4 o no
     * @return Booleano sobre si la camioneta es 4x4 o no
     */
    public boolean isEsCuatroXCuatro() {
        return esCuatroXCuatro;
    }

    /**
     * Metodo para modificar el numero de pasajeros de la camioneta
     * @param numPasajeros Nuevo numero de pasajeros de la camioneta
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    /**
     * Metodo para modificar el numero de puertas de la camioneta
     * @param numPuertas Nuevo numero de puertas de la camioneta
    */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    /**
     * Metodo para modificar el numero de bolsas de aire de la camioneta
     * @param numBolsasAire Nuevo numero de bolsas de aire de la camioneta
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    /**
     * Metodo para modificar la capacidad del maletero de la camioneta
     * @param capacidadMaletero Nueva capacidad del maletero de la camioneta
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    /**
     * Metodo para modificar si la camioneta tiene aire acondicionado o no
     * @param tieneAireAcondicionado Nuevo booleano sobre si la camioneta tiene aire acondicionado o no
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    /**
     * Metodo para modificar si la camioneta tiene camara de reversa o no
     * @param tieneCamaraReversa Nuevo booleano sobre si la camioneta tiene camara de reversa o no
     */
    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }
    /**
     * Metodo para modificar si la camioneta tiene velocidad de crucero o no
     * @param tieneVelocidadCrucero Nuevo booleano sobre si la camioneta tiene velocidad de crucero o no
     */
    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }
    /**
     * Metodo para modificar si la camioneta tiene abs o no
     * @param tieneABS Nuevo booleano sobre si la camioneta tiene abs o no
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
    /**
     * Metodo para modificar si la camioneta tiene sensor de colision o no
     * @param tieneSensorColision Nuevo booleano sobre si la camioneta tiene sensor de colision o no
     */
    public void setTieneSensorColision(boolean tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }
    /**
     * Metodo para modificar si la camioneta tiene sensor de trafico cruzado o no
     * @param tieneSensorTraficoCruzado Nuevo booleano sobre si la camioneta tiene sensor de trafico cruzado o no
     */
    public void setTieneSensorTraficoCruzado(boolean tieneSensorTraficoCruzado) {
        this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
    }
    /**
     * Metodo para modificar si la camioneta tiene asistente de permanencia de carril o no
     * @param tieneAsistentePermanenciaCarril Nuevo booleano sobre si la camioneta tiene asistente de permanencia de carril o no
     */
    public void setTieneAsistentePermanenciaCarril(boolean tieneAsistentePermanenciaCarril) {
        this.tieneAsistentePermanenciaCarril = tieneAsistentePermanenciaCarril;
    }
    /**
     * Metodo para modificar si la camioneta es 4x4 o no
     * @param esCuatroXCuatro Nuevo booleano sobre si la camioneta es 4x4 o no
     */
    public void setEsCuatroXCuatro(boolean esCuatroXCuatro) {
        this.esCuatroXCuatro = esCuatroXCuatro;
    }
}