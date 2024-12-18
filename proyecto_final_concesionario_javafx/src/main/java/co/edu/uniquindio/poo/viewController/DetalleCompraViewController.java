package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DetalleCompraController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Detalle_compra;
import co.edu.uniquindio.poo.model.Estado_vehiculo;
import co.edu.uniquindio.poo.model.Motocicleta;
import co.edu.uniquindio.poo.model.Pick_up;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.Sede;
import co.edu.uniquindio.poo.model.Tipo_transmision;
import co.edu.uniquindio.poo.model.Tipo_uso;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class DetalleCompraViewController {

    DetalleCompraController detalleCompraController;
    private Compra compra;
    ObservableList<Detalle_compra> listaDetallesCompra = FXCollections.observableArrayList();
    Detalle_compra selectedDetalleCompra;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_marca;

    @FXML
    private Label lb_vehiculo;

    @FXML
    private Label lb_modelo;

    @FXML
    private TableColumn<Detalle_compra, String> cl_placa;

    @FXML
    private CheckBox checkb_camara;

    @FXML
    private TextField txt_modelo;

    @FXML
    private Label lb_cambios;

    @FXML
    private CheckBox checkb_crucero;

    @FXML
    private Label lb_maletero;

    @FXML
    private Label lb_uso;

    @FXML
    private Label lb_autonomia;

    @FXML
    private CheckBox checkb_aire;

    @FXML
    private Label lb_1;

    @FXML
    private Label lb_cilindraje;

    @FXML
    private CheckBox checkb_frenosaire;

    @FXML
    private Label lb_transmision;

    @FXML
    private Label lb_bolsas;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_3;

    @FXML
    private TextField txt_bolsas;

    @FXML
    private Button bt_4;

    @FXML
    private Label lb_estado;

    @FXML
    private TextField txt_salidas;

    @FXML
    private Button bt_1;

    @FXML
    private TextField txt_cilindraje;

    @FXML
    private TextField txt_placa;

    @FXML
    private TableView<Detalle_compra> tbl_vehiculos;

    @FXML
    private ComboBox<Tipo_uso> cb_uso;

    @FXML
    private CheckBox checkb_4x4;

    @FXML
    private Pane pane_1;

    @FXML
    private Label lb_cajacarga;

    @FXML
    private Label lb_enchufable;

    @FXML
    private TableColumn<Detalle_compra, String> cl_estado;

    @FXML
    private TextField txt_cambios;

    @FXML
    private CheckBox checkb_abs;

    @FXML
    private TextField txt_velocidad;

    @FXML
    private Label lb_hibrido;

    @FXML
    private ComboBox<Estado_vehiculo> cb_estado;

    @FXML
    private Label lb_camion;

    @FXML
    private Label lb_tecnomecanica;

    @FXML
    private Label lb_aire;

    @FXML
    private CheckBox checkb_colision;

    @FXML
    private Label lb_tiempocarga;

    @FXML
    private TextField txt_camion;

    @FXML
    private ComboBox<String> cb_vehiculo;

    @FXML
    private Label lb_puertas;

    @FXML
    private TextField txt_pasajeros;

    @FXML
    private TableColumn<Detalle_compra, Integer> cl_modelo;

    @FXML
    private Label lb_frenosaire;

    @FXML
    private TextField txt_tiempocarga;

    @FXML
    private ComboBox<Tipo_transmision> cb_transmision;

    @FXML
    private TextField txt_ejes;

    @FXML
    private Label lb_crucero;

    @FXML
    private CheckBox checkb_hibrido;

    @FXML
    private CheckBox checkb_asistente;

    @FXML
    private TextField txt_precio;

    @FXML
    private Label lb_marca;

    @FXML
    private TextField txt_autonomia;

    @FXML
    private CheckBox checkb_tecnomecanica;

    @FXML
    private Label lb_placa;

    @FXML
    private TextField txt_puertas;

    @FXML
    private TextField txt_cajacarga;

    @FXML
    private TableColumn<Detalle_compra, Double> cl_precio;

    @FXML
    private CheckBox checkb_enchufable;

    @FXML
    private TextField txt_maletero;

    @FXML
    private Label lb_colision;

    @FXML
    private Label lb_trafico;

    @FXML
    private Label lb_pasajeros;

    @FXML
    private Label lb_hp;

    @FXML
    private Label lb_tiempo;

    @FXML
    private CheckBox checkb_trafico;

    @FXML
    private Label lb_salidas;

    @FXML
    private Label lb_camara;

    @FXML
    private Label lb_precio;

    @FXML
    private Label lb_abs;

    @FXML
    private TextField txt_hp;

    @FXML
    private Label lb_velocidad;

    @FXML
    private TextField txt_tiempo;

    @FXML
    private Label lb_ejes;

    @FXML
    private Label lb_asistente;

    @FXML
    private Label lb_4x4;

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para establecer la compra para este controlador
     * @param compra Compra a establecer
     */
    @SuppressWarnings("exports")
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    /**
     * Metodo para inicializar el controller con la compra administrada, configura los comboBox y luego inicia el initView
     * @param empleado
     */
    @SuppressWarnings("exports")
    public void inicializarController(Compra compra) {
        detalleCompraController = new DetalleCompraController(compra, App.concesionario);
        initView();
    }

    /**
     * Metodo para manejar el evento de agregar un detalle de compra
     */
    @FXML
    void onAgregarDetalleCompra() {
        agregarDetalleCompra();
    }

    /**
     * Metodo para manejar el evento de eliminar un detalle de compra
     */
    @FXML
    void onEliminarDetalleCompra() {
        eliminarDetalleCompra();
    }

    /**
     * Metodo para manejar el evento de limpiar seleccion
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
        limpiarCamposVehiculos();
        cb_vehiculo.getSelectionModel().clearSelection();
    }

    /**
     * Metodo para inicializar la interfaz del menu del empleado
     */
    @FXML
    void onOpenEmpleado() {
        app.openGestionCompras(compra.getEmpleado());
    }

    /**
     * Metodo para mostrar la informacion de un vehiculo en los campos correspondientes de la tabla de vehiculos
     * @param vehiculo Vehiculo con la informacion que se busca mostrar
     */
    private void mostrarInformacionDetalleCompra(Detalle_compra detalleCompra) {
        if (detalleCompra != null && detalleCompra.getVehiculo() != null) {
            Vehiculo vehiculo = detalleCompra.getVehiculo();
            mostrarInformacionPersonalizadaVehiculo(vehiculo);
            txt_precio.setText(String.valueOf(detalleCompra.getSubtotal()));
            checkb_tecnomecanica.setSelected(detalleCompra.isTecnomecanicaValida());
            txt_placa.setText(vehiculo.getPlaca());
            txt_marca.setText(vehiculo.getMarca());
            cb_estado.getSelectionModel().select(vehiculo.getEstadoVehiculo());
            txt_modelo.setText(String.valueOf(vehiculo.getModelo()));
            txt_cambios.setText(String.valueOf(vehiculo.getCantidadCambios()));
            txt_velocidad.setText(String.valueOf(vehiculo.getVelocidadMax()));
            txt_cilindraje.setText(String.valueOf(vehiculo.getCilindraje()));
            cb_transmision.getSelectionModel().select(vehiculo.getTipoTransmision());
            cb_uso.getSelectionModel().select(vehiculo.getTipoUso());
            cb_vehiculo.setDisable(true);      
        }
    }

    /**
     * Metodo para mostrar la informacion de un vehiculo dependiendo de su tipo de vehiculo
     * @param vehiculo Vehiculo con la informacion que se busca mostrar
     */
    private void mostrarInformacionPersonalizadaVehiculo(Vehiculo vehiculo){
        if (vehiculo instanceof Bus) {
            Bus bus = (Bus) vehiculo;
            checkb_enchufable.setSelected(bus.isEsEnchufable());
            checkb_hibrido.setSelected(bus.isEsHibridoLigero());
            txt_pasajeros.setText(String.valueOf(bus.getNumPasajeros()));
            txt_puertas.setText(String.valueOf(bus.getNumPuertas()));
            txt_bolsas.setText(String.valueOf(bus.getNumBolsasAire()));
            txt_ejes.setText(String.valueOf(bus.getNumEjes()));
            txt_salidas.setText(String.valueOf(bus.getNumPasajeros()));
            txt_maletero.setText(String.valueOf(bus.getCapacidadMaletero()));
            checkb_aire.setSelected(bus.isTieneAireAcondicionado());
            checkb_camara.setSelected(bus.isTieneCamaraReversa());
            checkb_abs.setSelected(bus.isTieneABS());
            cb_vehiculo.getSelectionModel().select(0);
        } 
        else if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            checkb_aire.setSelected(camion.isTieneABS());
            checkb_frenosaire.setSelected(camion.isTieneFrenosAire());
            checkb_abs.setSelected(camion.isTieneABS());
            txt_ejes.setText(String.valueOf(camion.getNumEjes()));
            txt_cajacarga.setText(String.valueOf(camion.getCapacidadCajaCarga()));
            txt_camion.setText(camion.getTipoCamion());
            cb_vehiculo.getSelectionModel().select(1);
        }
        else if (vehiculo instanceof Camioneta) {
            Camioneta camioneta = (Camioneta) vehiculo;
            txt_autonomia.setText(String.valueOf(camioneta.getAutonomiaMinutos()));
            txt_tiempocarga.setText(String.valueOf(camioneta.getTiempoCarga()));
            txt_pasajeros.setText(String.valueOf(camioneta.getNumPasajeros()));
            txt_puertas.setText(String.valueOf(camioneta.getNumPuertas()));
            txt_bolsas.setText(String.valueOf(camioneta.getNumBolsasAire()));
            txt_maletero.setText(String.valueOf(camioneta.getCapacidadMaletero()));
            checkb_aire.setSelected(camioneta.isTieneAireAcondicionado());
            checkb_camara.setSelected(camioneta.isTieneCamaraReversa());
            checkb_crucero.setSelected(camioneta.isTieneVelocidadCrucero());
            checkb_abs.setSelected(camioneta.isTieneABS());
            checkb_colision.setSelected(camioneta.isTieneSensorColision());
            checkb_trafico.setSelected(camioneta.isTieneSensorTraficoCruzado());
            checkb_asistente.setSelected(camioneta.isTieneAsistentePermanenciaCarril());
            checkb_4x4.setSelected(camioneta.isEsCuatroXCuatro());
            cb_vehiculo.getSelectionModel().select(2);
        }
        else if (vehiculo instanceof Deportivo) {
            Deportivo deportivo = (Deportivo) vehiculo;
            txt_pasajeros.setText(String.valueOf(deportivo.getNumPasajeros()));
            txt_puertas.setText(String.valueOf(deportivo.getNumPuertas()));
            txt_bolsas.setText(String.valueOf(deportivo.getNumBolsasAire()));
            txt_hp.setText(String.valueOf(deportivo.getNumHP()));
            txt_tiempo.setText(String.valueOf(deportivo.getTiempoCienKm()));
            cb_vehiculo.getSelectionModel().select(3);
        }
        else if (vehiculo instanceof Motocicleta) {
            cb_vehiculo.getSelectionModel().select(4);
        }
        else if (vehiculo instanceof Pick_up) {
            Pick_up pickUp = (Pick_up) vehiculo;
            txt_autonomia.setText(String.valueOf(pickUp.getAutonomiaMinutos()));
            txt_tiempocarga.setText(String.valueOf(pickUp.getTiempoCarga()));
            txt_pasajeros.setText(String.valueOf(pickUp.getNumPasajeros()));
            txt_puertas.setText(String.valueOf(pickUp.getNumPuertas()));
            txt_bolsas.setText(String.valueOf(pickUp.getNumBolsasAire()));
            txt_cajacarga.setText(String.valueOf(pickUp.getCapacidadCajaCarga()));
            checkb_aire.setSelected(pickUp.isTieneAireAcondicionado());
            checkb_camara.setSelected(pickUp.isTieneCamaraReversa());
            checkb_abs.setSelected(pickUp.isTieneABS());
            checkb_4x4.setSelected(pickUp.isEsCuatroXCuatro());
            cb_vehiculo.getSelectionModel().select(5);
        }
        else if (vehiculo instanceof Sedan) {
            Sedan sedan = (Sedan) vehiculo;
            checkb_enchufable.setSelected(sedan.isEsEnchufable());
            checkb_hibrido.setSelected(sedan.isEsHibridoLigero());
            txt_pasajeros.setText(String.valueOf(sedan.getNumPasajeros()));
            txt_puertas.setText(String.valueOf(sedan.getNumPuertas()));
            txt_bolsas.setText(String.valueOf(sedan.getNumBolsasAire()));
            txt_maletero.setText(String.valueOf(sedan.getCapacidadMaletero()));
            checkb_aire.setSelected(sedan.isTieneAireAcondicionado());
            checkb_camara.setSelected(sedan.isTieneCamaraReversa());
            checkb_crucero.setSelected(sedan.isTieneVelocidadCrucero());
            checkb_abs.setSelected(sedan.isTieneABS());
            checkb_colision.setSelected(sedan.isTieneSensorColision());
            checkb_trafico.setSelected(sedan.isTieneSensorTraficoCruzado());
            checkb_asistente.setSelected(sedan.isTieneAsistentePermanenciaCarril());
            cb_vehiculo.getSelectionModel().select(6);
        }
        else if (vehiculo instanceof Van) {
            Van van = (Van) vehiculo;
            txt_pasajeros.setText(String.valueOf(van.getNumPasajeros()));
            txt_puertas.setText(String.valueOf(van.getNumPuertas()));
            txt_bolsas.setText(String.valueOf(van.getNumBolsasAire()));
            txt_maletero.setText(String.valueOf(van.getCapacidadMaletero()));
            checkb_aire.setSelected(van.isTieneAireAcondicionado());
            checkb_camara.setSelected(van.isTieneCamaraReversa());
            checkb_abs.setSelected(van.isTieneABS());
            cb_vehiculo.getSelectionModel().select(7);
        }
    }

    /**
     * Metodo para crear un detalle de compra
     * @param vehiculoDado Vehiculo para el detalle de compra
     * @return Detalle de compra creado
     */
    private Detalle_compra buildDetalleCompra(Vehiculo vehiculoDado){
        return new Detalle_compra(vehiculoDado, Double.parseDouble(txt_precio.getText()), compra, checkb_tecnomecanica.isSelected());
    }

    /**
     * Metodo para crear un Vehiculo con los datos ingresados en los campos de texto
     * @return Vehiculo creado
     */
    private Vehiculo buildVehiculo(){
        String tipoVehiculo = cb_vehiculo.getSelectionModel().getSelectedItem();
        if (tipoVehiculo == null) {
            return null;
        }
        Estado_vehiculo estadoVehiculo = (Estado_vehiculo) cb_estado.getSelectionModel().getSelectedItem();
        Tipo_transmision tipoTransmision = (Tipo_transmision) cb_transmision.getSelectionModel().getSelectedItem();
        Tipo_uso tipoUso = (Tipo_uso) cb_uso.getSelectionModel().getSelectedItem();
        boolean enchufable = checkb_enchufable.isSelected();
        boolean hibrido = checkb_hibrido.isSelected();
        boolean CuatroXCuatro = checkb_4x4.isSelected();
        boolean aireAcondicionado = checkb_aire.isSelected();
        boolean camaraReversa = checkb_camara.isSelected();
        boolean velocidadCrucero = checkb_crucero.isSelected();
        boolean sensorTC = checkb_trafico.isSelected();
        boolean asistentePC = checkb_asistente.isSelected();
        boolean colision = checkb_colision.isSelected();
        boolean frenosABS = checkb_abs.isSelected();
        boolean frenosAire = checkb_frenosaire.isSelected();
        Sede sede = compra.getEmpleado().getSede();
        if (tipoVehiculo.equals("Bus")) {
            return new Bus(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, enchufable, hibrido, Integer.parseInt(txt_pasajeros.getText()), Integer.parseInt(txt_puertas.getText()), Integer.parseInt(txt_bolsas.getText()), Integer.parseInt(txt_ejes.getText()), Integer.parseInt(txt_salidas.getText()), Double.parseDouble(txt_maletero.getText()), aireAcondicionado, camaraReversa, frenosABS, sede);
        }
        else if (tipoVehiculo.equals("Camion")) {
            return new Camion(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, aireAcondicionado, frenosAire, frenosABS, Integer.parseInt(txt_ejes.getText()), Double.parseDouble(txt_cajacarga.getText()), txt_camion.getText(), sede);
        }
        else if (tipoVehiculo.equals("Camioneta")) {
            return new Camioneta(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, Integer.parseInt(txt_autonomia.getText()), Integer.parseInt(txt_tiempocarga.getText()), Integer.parseInt(txt_pasajeros.getText()), Integer.parseInt(txt_puertas.getText()), Integer.parseInt(txt_bolsas.getText()), Double.parseDouble(txt_maletero.getText()), aireAcondicionado, camaraReversa, velocidadCrucero, frenosABS, colision, sensorTC, asistentePC, CuatroXCuatro, sede);
        }
        else if (tipoVehiculo.equals("Deportivo")) {
            return new Deportivo(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, Integer.parseInt(txt_pasajeros.getText()), Integer.parseInt(txt_puertas.getText()),Integer.parseInt(txt_bolsas.getText()), Double.parseDouble(txt_hp.getText()), Double.parseDouble(txt_tiempo.getText()), sede);
        }
        else if (tipoVehiculo.equals("Motocicleta")) {
            return new Motocicleta(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, sede);
        }
        else if (tipoVehiculo.equals("Pick up")) {
            return new Pick_up(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, Integer.parseInt(txt_autonomia.getText()), Integer.parseInt(txt_tiempocarga.getText()), Integer.parseInt(txt_pasajeros.getText()), Integer.parseInt(txt_puertas.getText()), Integer.parseInt(txt_bolsas.getText()), Double.parseDouble(txt_cajacarga.getText()), aireAcondicionado, camaraReversa, frenosABS, CuatroXCuatro, sede);
        }
        else if (tipoVehiculo.equals("Sedan")) {
            return new Sedan(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, enchufable, hibrido, Integer.parseInt(txt_pasajeros.getText()), Integer.parseInt(txt_puertas.getText()), Integer.parseInt(txt_bolsas.getText()), Double.parseDouble(txt_bolsas.getText()), aireAcondicionado, camaraReversa, velocidadCrucero, frenosABS, colision, sensorTC, asistentePC, sede);
        }
        else if (tipoVehiculo.equals("Van")) {
            return new Van(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, Integer.parseInt(txt_pasajeros.getText()), Integer.parseInt(txt_puertas.getText()), Integer.parseInt(txt_bolsas.getText()), Double.parseDouble(txt_maletero.getText()), aireAcondicionado, camaraReversa, frenosABS, sede);
        }
        else{
            return null;
        }
    }

    /**
     * Metodo para agregar un detalle de compra a la lista de detalles de compra de la tabla
     */
    private void agregarDetalleCompra(){
        if (verificarCasillasCorrectas() && verificarCasillasLlenas()) {
            Vehiculo vehiculo = buildVehiculo();
            Detalle_compra detalleCompra = buildDetalleCompra(vehiculo);
            if (detalleCompraController.crearDetalleCompra(detalleCompra)) {
                listaDetallesCompra.add(detalleCompra);
                limpiarSeleccion();
                limpiarCamposVehiculos();
                cb_vehiculo.getSelectionModel().clearSelection();
            }
        }
    }

    /**
     * Metodo para eliminar un detalle de compra de la lista de detalles de compra de la compra segun el codigo proporcionado
     */
    private void eliminarDetalleCompra(){
        if (detalleCompraController.eliminarDetalleCompra(txt_placa.getText())) {
            listaDetallesCompra.remove(selectedDetalleCompra);
            limpiarSeleccion();
            limpiarCamposVehiculos();
            cb_vehiculo.getSelectionModel().clearSelection();
        }
    }

    /**
     * Metodo para obtener la lista de detalles de compra de la compra y asignarla a la lista de detalles de compra del controlador
     */
    private void obtenerDetallesCompra(){
        listaDetallesCompra.addAll(detalleCompraController.obtenerListaDetallesCompra());
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con la informacion de los vehiculos estan llenas
     * @return Booleano sobre si todos los campos estan llenos o no
     */
    private boolean verificarCasillasLlenas(){
        String tipoVehiculo = cb_vehiculo.getSelectionModel().getSelectedItem();
        boolean decision = false;
        if (tipoVehiculo != null && !cb_estado.getSelectionModel().isEmpty() && !cb_transmision.getSelectionModel().isEmpty()&& !cb_uso.getSelectionModel().isEmpty()){
            if (tipoVehiculo.equals("Camion")) {
                if (!txt_camion.getText().isEmpty()) {
                    decision = true;
                }
            }
            else{
                decision = true;
            }
        }
        return decision;
    }

    /**
     * 
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de los vehiculos tienen el tipo de dato adecuado
     * @return Booleano sobre si todos los campos estan con los datos correctos o no
     */
    private boolean verificarCasillasCorrectas(){
        String tipoVehiculo = cb_vehiculo.getSelectionModel().getSelectedItem();
        boolean decision = false;
        if (esEntero(txt_modelo.getText()) && esEntero(txt_cambios.getText()) && esDouble(txt_velocidad.getText()) && esDouble(txt_cilindraje.getText()) && tipoVehiculo != null && esDouble(txt_precio.getText())) {
            if (tipoVehiculo.equals("Bus")) {
                if (esEntero(txt_pasajeros.getText()) && esEntero(txt_puertas.getText()) && esEntero(txt_bolsas.getText()) && esEntero(txt_ejes.getText()) && esEntero(txt_salidas.getText()) && esDouble(txt_maletero.getText())) {
                    decision = true;
                }
            }
            else if (tipoVehiculo.equals("Camion")) {
                if (esEntero(txt_ejes.getText()) && esDouble(txt_cajacarga.getText())) {
                    decision = true;
                }
            }
            else if (tipoVehiculo.equals("Camioneta")) {
                if (esEntero(txt_autonomia.getText()) && esEntero(txt_tiempocarga.getText()) && esEntero(txt_pasajeros.getText()) && esEntero(txt_puertas.getText()) && esEntero(txt_bolsas.getText()) && esDouble(txt_maletero.getText())) {
                    decision = true;
                }
            }
            else if (tipoVehiculo.equals("Deportivo")) {
                if (esEntero(txt_pasajeros.getText()) && esEntero(txt_puertas.getText()) && esEntero(txt_bolsas.getText()) && esDouble(txt_hp.getText()) && esDouble(txt_tiempo.getText())) {
                    decision = true;
                }
            }
            else if (tipoVehiculo.equals("Motocicleta")) {
                decision = true;
            }
            else if (tipoVehiculo.equals("Pick up")) {
                if (esEntero(txt_autonomia.getText()) && esEntero(txt_tiempocarga.getText()) && esEntero(txt_pasajeros.getText()) && esEntero(txt_puertas.getText()) && esEntero(txt_bolsas.getText()) && esDouble(txt_cajacarga.getText())) {
                    decision = true;
                }
            }
            else if (tipoVehiculo.equals("Sedan")) {
                if (esEntero(txt_pasajeros.getText()) && esEntero(txt_puertas.getText()) && esEntero(txt_bolsas.getText()) && esDouble(txt_maletero.getText())) {
                    decision = true;
                }
            }
            else if (tipoVehiculo.equals("Van")) {
                if (esEntero(txt_pasajeros.getText()) && esEntero(txt_puertas.getText()) && esEntero(txt_bolsas.getText()) && esDouble(txt_maletero.getText())) {
                    decision = true;
                }
            }
        }
        return decision;
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerDetallesCompra();
        tbl_vehiculos.getItems().clear();
        tbl_vehiculos.setItems(listaDetallesCompra);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla detalles de compra del controlador
     */
    private void initDataBinding() {
        cl_placa.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getPlaca()));
        cl_modelo.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getVehiculo().getModelo()).asObject());
        cl_estado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getEstadoVehiculo().name()));
        cl_precio.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getSubtotal()).asObject());
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de detalles de compra
     */
    private void listenerSelection() {
        tbl_vehiculos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedDetalleCompra = newSelection;
            mostrarInformacionDetalleCompra(selectedDetalleCompra);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de vehiculos
     */
    private void limpiarSeleccion() {
        cb_vehiculo.setDisable(false);
        tbl_vehiculos.getSelectionModel().clearSelection();
        lb_placa.setVisible(false);
        txt_placa.setVisible(false);
        lb_marca.setVisible(false);
        txt_marca.setVisible(false);
        lb_estado.setVisible(false);
        cb_estado.setVisible(false);
        lb_modelo.setVisible(false);
        txt_modelo.setVisible(false);
        lb_cambios.setVisible(false);
        txt_cambios.setVisible(false);
        lb_velocidad.setVisible(false);
        txt_velocidad.setVisible(false);
        lb_cilindraje.setVisible(false);
        txt_cilindraje.setVisible(false);
        lb_transmision.setVisible(false);
        cb_transmision.setVisible(false);
        lb_uso.setVisible(false);
        cb_uso.setVisible(false);
        lb_enchufable.setVisible(false);
        checkb_enchufable.setVisible(false);
        lb_hibrido.setVisible(false);
        checkb_hibrido.setVisible(false);
        lb_pasajeros.setVisible(false);
        txt_pasajeros.setVisible(false);
        lb_puertas.setVisible(false);
        txt_puertas.setVisible(false);
        lb_bolsas.setVisible(false);
        txt_bolsas.setVisible(false);
        lb_4x4.setVisible(false);
        checkb_4x4.setVisible(false);
        lb_ejes.setVisible(false);
        txt_ejes.setVisible(false);
        lb_salidas.setVisible(false);
        txt_salidas.setVisible(false);
        lb_maletero.setVisible(false);
        txt_maletero.setVisible(false);
        lb_aire.setVisible(false);
        checkb_aire.setVisible(false);
        lb_camara.setVisible(false);
        checkb_camara.setVisible(false);
        lb_crucero.setVisible(false);
        checkb_crucero.setVisible(false);
        lb_tiempocarga.setVisible(false);
        txt_tiempocarga.setVisible(false);
        lb_autonomia.setVisible(false);
        txt_autonomia.setVisible(false);
        lb_colision.setVisible(false);
        checkb_colision.setVisible(false);
        lb_abs.setVisible(false);
        checkb_abs.setVisible(false);
        lb_hp.setVisible(false);
        txt_hp.setVisible(false);
        lb_camion.setVisible(false);
        txt_camion.setVisible(false);
        lb_tiempo.setVisible(false);
        txt_tiempo.setVisible(false);
        lb_cajacarga.setVisible(false);
        txt_cajacarga.setVisible(false);  
        lb_trafico.setVisible(false);      
        checkb_trafico.setVisible(false);
        lb_asistente.setVisible(false);
        checkb_asistente.setVisible(false);
        lb_frenosaire.setVisible(false);
        checkb_frenosaire.setVisible(false);
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de los vehiculos
     */
    private void limpiarCamposVehiculos() {
        checkb_tecnomecanica.setSelected(false);
        txt_precio.clear();
        txt_placa.clear();
        txt_marca.clear();
        cb_estado.getSelectionModel().clearSelection();
        txt_modelo.clear();
        txt_cambios.clear();
        txt_velocidad.clear();
        txt_cilindraje.clear();
        cb_transmision.getSelectionModel().clearSelection();
        cb_uso.getSelectionModel().clearSelection();
        checkb_enchufable.setSelected(false);
        checkb_hibrido.setSelected(false);
        txt_pasajeros.clear();
        txt_puertas.clear();
        txt_bolsas.clear();
        checkb_4x4.setSelected(false);
        txt_ejes.clear();
        txt_salidas.clear();
        txt_maletero.clear();
        checkb_aire.setSelected(false);
        checkb_camara.setSelected(false);
        checkb_crucero.setSelected(false);
        txt_tiempocarga.clear();
        txt_autonomia.clear();
        checkb_colision.setSelected(false);
        checkb_abs.setSelected(false);
        txt_hp.clear();
        txt_camion.clear();
        txt_tiempo.clear();
        txt_cajacarga.clear();
        checkb_trafico.setSelected(false);
        checkb_asistente.setSelected(false);
        checkb_frenosaire.setSelected(false);
    }

    /**
     * Metodo para saber si un String es un dato de tipo double positivo y diferente de 0
     * @param texto String a verificar
     * @return Booleano sobre si el String es double o no
     */
    private boolean esDouble(String texto){
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        try {
            double numero = Double.parseDouble(texto);
            return numero > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Metodo para saber si un String es un dato de tipo int positivo y diferente de 0
     * @param texto String a verificar
     * @return Booleano sobre si el String es int o no
     */
    private boolean esEntero(String texto){
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        try {
            int numero = Integer.parseInt(texto);
            return numero > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Metodo para u ocultar diferentes casillas relacionadas con los datos de un vehiculo dependiendo de la seleccion que tenga el ComboBox cb_vehiculo
     */
    private void manejarSeleccionTipo(){
        String tipoVehiculo = cb_vehiculo.getSelectionModel().getSelectedItem();
        if (tipoVehiculo == null) {
            limpiarSeleccion();
            return;
        }
        lb_placa.setVisible(true);
        txt_placa.setVisible(true);
        lb_marca.setVisible(true);
        txt_marca.setVisible(true);
        lb_estado.setVisible(true);
        cb_estado.setVisible(true);
        lb_modelo.setVisible(true);
        txt_modelo.setVisible(true);
        lb_cambios.setVisible(true);
        txt_cambios.setVisible(true);
        lb_vehiculo.setVisible(true);
        lb_velocidad.setVisible(true);
        txt_velocidad.setVisible(true);
        lb_cilindraje.setVisible(true);
        txt_cilindraje.setVisible(true);
        lb_transmision.setVisible(true);
        cb_transmision.setVisible(true);
        lb_uso.setVisible(true);
        cb_uso.setVisible(true);
        txt_placa.clear();
        txt_marca.clear();
        cb_estado.getSelectionModel().clearSelection();
        txt_modelo.clear();
        txt_cambios.clear();
        txt_velocidad.clear();
        txt_cilindraje.clear();
        cb_transmision.getSelectionModel().clearSelection();
        cb_uso.getSelectionModel().clearSelection();
        if (tipoVehiculo.equals("Bus")) {
            lb_enchufable.setVisible(true);
            checkb_enchufable.setVisible(true);
            lb_hibrido.setVisible(true);
            checkb_hibrido.setVisible(true);
            lb_pasajeros.setVisible(true);
            txt_pasajeros.setVisible(true);
            lb_puertas.setVisible(true);
            txt_puertas.setVisible(true);
            lb_bolsas.setVisible(true);
            txt_bolsas.setVisible(true);
            lb_ejes.setVisible(true);
            txt_ejes.setVisible(true);
            lb_salidas.setVisible(true);
            txt_salidas.setVisible(true);
            lb_maletero.setVisible(true);
            txt_maletero.setVisible(true);
            lb_aire.setVisible(true);
            checkb_aire.setVisible(true);
            lb_camara.setVisible(true);
            checkb_camara.setVisible(true);
            lb_abs.setVisible(true);
            checkb_abs.setVisible(true);
            checkb_crucero.setSelected(false);
            txt_tiempocarga.clear();
            txt_autonomia.clear();
            checkb_colision.setSelected(false);
            txt_hp.clear();
            txt_camion.clear();
            txt_tiempo.clear();
            txt_cajacarga.clear();
            checkb_trafico.setSelected(false);
            checkb_asistente.setSelected(false);
        }
        else if (tipoVehiculo.equals("Camion")) {
            lb_aire.setVisible(true);
            checkb_aire.setVisible(true);
            lb_camara.setVisible(true);
            checkb_camara.setVisible(true);
            lb_abs.setVisible(true);
            checkb_abs.setVisible(true);
            lb_ejes.setVisible(true);
            txt_ejes.setVisible(true);
            lb_cajacarga.setVisible(true);
            txt_cajacarga.setVisible(true);
            lb_camion.setVisible(true);
            txt_camion.setVisible(true);
            checkb_enchufable.setSelected(false);
            checkb_hibrido.setSelected(false);
            txt_pasajeros.clear();
            txt_puertas.clear();
            txt_bolsas.clear();
            checkb_4x4.setSelected(false);
            txt_salidas.clear();
            txt_maletero.clear();
            checkb_crucero.setSelected(false);
            txt_tiempocarga.clear();
            txt_autonomia.clear();
            checkb_colision.setSelected(false);
            txt_tiempo.clear();
            checkb_trafico.setSelected(false);
            checkb_asistente.setSelected(false);
        }
        else if (tipoVehiculo.equals("Camioneta")) {
            lb_autonomia.setVisible(true);
            txt_autonomia.setVisible(true);
            lb_tiempocarga.setVisible(true);
            txt_tiempocarga.setVisible(true);
            lb_pasajeros.setVisible(true);
            txt_pasajeros.setVisible(true);
            lb_puertas.setVisible(true);
            txt_puertas.setVisible(true);
            lb_bolsas.setVisible(true);
            txt_bolsas.setVisible(true);
            lb_maletero.setVisible(true);
            txt_maletero.setVisible(true);
            lb_aire.setVisible(true);
            checkb_aire.setVisible(true);
            lb_camara.setVisible(true);
            checkb_camara.setVisible(true);
            lb_crucero.setVisible(true);
            checkb_crucero.setVisible(true);
            lb_abs.setVisible(true);
            checkb_abs.setVisible(true);
            lb_colision.setVisible(true);
            checkb_colision.setVisible(true);
            lb_trafico.setVisible(true);
            checkb_trafico.setVisible(true);
            lb_asistente.setVisible(true);
            checkb_asistente.setVisible(true);
            lb_4x4.setVisible(true);
            checkb_4x4.setVisible(true);
            checkb_enchufable.setSelected(false);
            checkb_hibrido.setSelected(false);
            txt_ejes.clear();
            txt_salidas.clear();
            txt_hp.clear();
            txt_camion.clear();
            txt_tiempo.clear();
            txt_cajacarga.clear();
        }
        else if (tipoVehiculo.equals("Deportivo")) {
            lb_pasajeros.setVisible(true);
            txt_pasajeros.setVisible(true);
            lb_puertas.setVisible(true);
            txt_puertas.setVisible(true);
            lb_bolsas.setVisible(true);
            txt_bolsas.setVisible(true);
            lb_hp.setVisible(true);
            txt_hp.setVisible(true);
            lb_tiempo.setVisible(true);
            txt_tiempo.setVisible(true);
            checkb_enchufable.setSelected(false);
            checkb_enchufable.setSelected(false);
            checkb_hibrido.setSelected(false);
            checkb_4x4.setSelected(false);
            txt_ejes.clear();
            txt_salidas.clear();
            txt_maletero.clear();
            checkb_aire.setSelected(false);
            checkb_camara.setSelected(false);
            checkb_crucero.setSelected(false);
            txt_tiempocarga.clear();
            txt_autonomia.clear();
            checkb_colision.setSelected(false);
            checkb_abs.setSelected(false);
            txt_camion.clear();
            txt_cajacarga.clear();
            checkb_trafico.setSelected(false);
            checkb_asistente.setSelected(false);
        }
        else if (tipoVehiculo.equals("Pick up")) {
            lb_autonomia.setVisible(true);
            txt_autonomia.setVisible(true);
            lb_tiempocarga.setVisible(true);
            txt_tiempocarga.setVisible(true);
            lb_pasajeros.setVisible(true);
            txt_pasajeros.setVisible(true);
            lb_puertas.setVisible(true);
            txt_puertas.setVisible(true);
            lb_bolsas.setVisible(true);
            txt_bolsas.setVisible(true);
            lb_cajacarga.setVisible(true);
            txt_cajacarga.setVisible(true);
            lb_aire.setVisible(true);
            checkb_aire.setVisible(true);
            lb_camara.setVisible(true);
            checkb_camara.setVisible(true);
            lb_abs.setVisible(true);
            checkb_abs.setVisible(true);
            lb_4x4.setVisible(true);
            checkb_4x4.setVisible(true);
            checkb_enchufable.setSelected(false);
            checkb_hibrido.setSelected(false);
            txt_ejes.clear();
            txt_salidas.clear();
            txt_maletero.clear();
            checkb_crucero.setSelected(false);
            checkb_colision.setSelected(false);
            txt_hp.clear();
            txt_camion.clear();
            txt_tiempo.clear();
            checkb_trafico.setSelected(false);
            checkb_asistente.setSelected(false);
        }
        else if (tipoVehiculo.equals("Motocicleta")) {
            checkb_enchufable.setSelected(false);
            checkb_hibrido.setSelected(false);
            txt_pasajeros.clear();
            txt_puertas.clear();
            txt_bolsas.clear();
            checkb_4x4.setSelected(false);
            txt_ejes.clear();
            txt_salidas.clear();
            txt_maletero.clear();
            checkb_aire.setSelected(false);
            checkb_camara.setSelected(false);
            checkb_crucero.setSelected(false);
            txt_tiempocarga.clear();
            txt_autonomia.clear();
            checkb_colision.setSelected(false);
            checkb_abs.setSelected(false);
            txt_hp.clear();
            txt_camion.clear();
            txt_tiempo.clear();
            txt_cajacarga.clear();
            checkb_trafico.setSelected(false);
            checkb_asistente.setSelected(false);
        }
        else if (tipoVehiculo.equals("Sedan")) {
            lb_enchufable.setVisible(true);
            checkb_enchufable.setVisible(true);
            lb_hibrido.setVisible(true);
            checkb_hibrido.setVisible(true);
            lb_pasajeros.setVisible(true);
            txt_pasajeros.setVisible(true);
            lb_puertas.setVisible(true);
            txt_puertas.setVisible(true);
            lb_bolsas.setVisible(true);
            txt_bolsas.setVisible(true);
            lb_maletero.setVisible(true);
            txt_maletero.setVisible(true);
            lb_aire.setVisible(true);
            checkb_aire.setVisible(true);
            lb_camara.setVisible(true);
            checkb_camara.setVisible(true);
            lb_crucero.setVisible(true);
            checkb_crucero.setVisible(true);
            lb_abs.setVisible(true);
            checkb_abs.setVisible(true);
            lb_colision.setVisible(true);
            checkb_colision.setVisible(true);
            lb_trafico.setVisible(true);
            checkb_trafico.setVisible(true);
            lb_asistente.setVisible(true);
            checkb_asistente.setVisible(true);
            checkb_4x4.setSelected(false);
            txt_ejes.clear();
            txt_salidas.clear();
            txt_tiempocarga.clear();
            txt_autonomia.clear();
            txt_hp.clear();
            txt_camion.clear();
            txt_tiempo.clear();
            txt_cajacarga.clear();
        }
        else if (tipoVehiculo.equals("Van")) {
            lb_pasajeros.setVisible(true);
            txt_pasajeros.setVisible(true);
            lb_puertas.setVisible(true);
            txt_puertas.setVisible(true);
            lb_bolsas.setVisible(true);
            txt_bolsas.setVisible(true);
            lb_maletero.setVisible(true);
            txt_maletero.setVisible(true);
            lb_aire.setVisible(true);
            checkb_aire.setVisible(true);
            lb_camara.setVisible(true);
            checkb_camara.setVisible(true);
            lb_abs.setVisible(true);
            checkb_abs.setVisible(true);
            checkb_4x4.setSelected(false);
            txt_ejes.clear();
            txt_salidas.clear();
            checkb_crucero.setSelected(false);
            txt_tiempocarga.clear();
            txt_autonomia.clear();
            checkb_colision.setSelected(false);
            txt_hp.clear();
            txt_camion.clear();
            txt_tiempo.clear();
            txt_cajacarga.clear();
            checkb_trafico.setSelected(false);
            checkb_asistente.setSelected(false);
        }
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado y configura los combo box
     */
    @FXML
    void initialize() {
        cb_estado.getItems().addAll(Estado_vehiculo.values());
        cb_uso.getItems().addAll(Tipo_uso.values());
        cb_transmision.getItems().addAll(Tipo_transmision.values());
        cb_vehiculo.getItems().addAll("Bus", "Camion", "Camioneta", "Deportivo", "Motocicleta", "Pick up", "Sedan", "Van");
        cb_vehiculo.setOnAction(event -> manejarSeleccionTipo());
        manejarSeleccionTipo();
        assert txt_marca != null : "fx:id=\"txt_marca\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_vehiculo != null : "fx:id=\"lb_vehiculo\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_modelo != null : "fx:id=\"lb_modelo\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cl_placa != null : "fx:id=\"cl_placa\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_camara != null : "fx:id=\"checkb_camara\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_modelo != null : "fx:id=\"txt_modelo\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_cambios != null : "fx:id=\"lb_cambios\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_crucero != null : "fx:id=\"checkb_crucero\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_maletero != null : "fx:id=\"lb_maletero\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_uso != null : "fx:id=\"lb_uso\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_autonomia != null : "fx:id=\"lb_autonomia\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_aire != null : "fx:id=\"checkb_aire\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_cilindraje != null : "fx:id=\"lb_cilindraje\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_frenosaire != null : "fx:id=\"checkb_frenosaire\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_transmision != null : "fx:id=\"lb_transmision\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_bolsas != null : "fx:id=\"lb_bolsas\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_bolsas != null : "fx:id=\"txt_bolsas\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_estado != null : "fx:id=\"lb_estado\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_salidas != null : "fx:id=\"txt_salidas\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_cilindraje != null : "fx:id=\"txt_cilindraje\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_placa != null : "fx:id=\"txt_placa\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert tbl_vehiculos != null : "fx:id=\"tbl_vehiculos\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cb_uso != null : "fx:id=\"cb_uso\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_4x4 != null : "fx:id=\"checkb_4x4\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_cajacarga != null : "fx:id=\"lb_cajacarga\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_enchufable != null : "fx:id=\"lb_enchufable\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cl_estado != null : "fx:id=\"cl_estado\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_cambios != null : "fx:id=\"txt_cambios\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_abs != null : "fx:id=\"checkb_abs\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_velocidad != null : "fx:id=\"txt_velocidad\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_hibrido != null : "fx:id=\"lb_hibrido\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cb_estado != null : "fx:id=\"cb_estado\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_camion != null : "fx:id=\"lb_camion\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_tecnomecanica != null : "fx:id=\"lb_tecnomecanica\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_aire != null : "fx:id=\"lb_aire\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_colision != null : "fx:id=\"checkb_colision\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_tiempocarga != null : "fx:id=\"lb_tiempocarga\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_camion != null : "fx:id=\"txt_camion\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cb_vehiculo != null : "fx:id=\"cb_vehiculo\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_puertas != null : "fx:id=\"lb_puertas\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_pasajeros != null : "fx:id=\"txt_pasajeros\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cl_modelo != null : "fx:id=\"cl_modelo\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_frenosaire != null : "fx:id=\"lb_frenosaire\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_tiempocarga != null : "fx:id=\"txt_tiempocarga\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cb_transmision != null : "fx:id=\"cb_transmision\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_ejes != null : "fx:id=\"txt_ejes\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_crucero != null : "fx:id=\"lb_crucero\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_hibrido != null : "fx:id=\"checkb_hibrido\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_asistente != null : "fx:id=\"checkb_asistente\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_precio != null : "fx:id=\"txt_precio\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_marca != null : "fx:id=\"lb_marca\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_autonomia != null : "fx:id=\"txt_autonomia\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_tecnomecanica != null : "fx:id=\"checkb_tecnomecanica\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_placa != null : "fx:id=\"lb_placa\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_puertas != null : "fx:id=\"txt_puertas\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_cajacarga != null : "fx:id=\"txt_cajacarga\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert cl_precio != null : "fx:id=\"cl_precio\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_enchufable != null : "fx:id=\"checkb_enchufable\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_maletero != null : "fx:id=\"txt_maletero\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_colision != null : "fx:id=\"lb_colision\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_trafico != null : "fx:id=\"lb_trafico\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_pasajeros != null : "fx:id=\"lb_pasajeros\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_hp != null : "fx:id=\"lb_hp\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_tiempo != null : "fx:id=\"lb_tiempo\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert checkb_trafico != null : "fx:id=\"checkb_trafico\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_salidas != null : "fx:id=\"lb_salidas\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_camara != null : "fx:id=\"lb_camara\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_precio != null : "fx:id=\"lb_precio\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_abs != null : "fx:id=\"lb_abs\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_hp != null : "fx:id=\"txt_hp\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_velocidad != null : "fx:id=\"lb_velocidad\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert txt_tiempo != null : "fx:id=\"txt_tiempo\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_ejes != null : "fx:id=\"lb_ejes\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_asistente != null : "fx:id=\"lb_asistente\" was not injected: check your FXML file 'detalleCompra.fxml'.";
        assert lb_4x4 != null : "fx:id=\"lb_4x4\" was not injected: check your FXML file 'detalleCompra.fxml'.";
    }
}