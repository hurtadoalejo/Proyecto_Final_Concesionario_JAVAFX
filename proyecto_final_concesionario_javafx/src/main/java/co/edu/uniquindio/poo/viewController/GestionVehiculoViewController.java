package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionClienteController;
import co.edu.uniquindio.poo.controller.GestionVehiculoController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Estado_disponibilidad;
import co.edu.uniquindio.poo.model.Estado_vehiculo;
import co.edu.uniquindio.poo.model.Motocicleta;
import co.edu.uniquindio.poo.model.Pick_up;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.Tipo_transmision;
import co.edu.uniquindio.poo.model.Tipo_uso;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Sede;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GestionVehiculoViewController {

    GestionVehiculoController gestionVehiculoController;
    private Empleado empleado;
    ObservableList<Vehiculo> listaVehiculos = FXCollections.observableArrayList();
    Vehiculo selectedVehiculo;

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
    private Button bt_2;

    @FXML
    private TextField txt_placa;

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
    private TableColumn<Vehiculo, String> cl_placa;

    @FXML
    private TableColumn<Vehiculo, String> cl_uso;

    @FXML
    private TableColumn<Vehiculo, String> cl_estado;

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
    private Label lb_marca;

    @FXML
    private TextField txt_autonomia;

    @FXML
    private TableView<Vehiculo> tbl_1;

    @FXML
    private Label lb_placa;

    @FXML
    private TextField txt_puertas;

    @FXML
    private TextField txt_cajacarga;

    @FXML
    private TableColumn<Vehiculo, String> cl_disponibilidad;

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
     * Metodo para establecer el empleado para este controlador
     * @param empleado empleado a establecer
     */
    @SuppressWarnings("exports")
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Metodo para inicializar el GestionVehiculoViewController con el empleado administrado y luego inicializar el initView
     * @param empleado Empleado administrado
     */
    @SuppressWarnings("exports")
    public void inicializarEmpleado(Empleado empleado) {
        gestionVehiculoController = new GestionVehiculoController(empleado, App.concesionario);
        initView();
    }

    /**
     * Metodo para manejar el evento de agregar un vehiculo
     */
    @FXML
    void onAgregarVehiculo() {
        agregarVehiculo();
    }

    /**
     * Metodo para manejar el evento de actualizar un vehiculo
     */
    @FXML
    void onActualizarVehiculo() {
        actualizarVehiculo();
    }

    /**
     * Metodo para manejar el evento de eliminar un vehiculo
     */
    @FXML
    void onEliminarVehiculo() {
        eliminarVehiculo();
    }

    /**
     * Metodo para manejar el evento de limpiar seleccion
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    /**
     * Metodo para inicializar la interfaz del menu del empleado
     */
    @FXML
    void onOpenEmpleado() {
        app.openMenuEmpleado(empleado);
    }

    /**
     * Metodo para crear un Vehiculo con los datos ingresados en los campos de texto
     * @return Vehiculo creado
     */
    private Vehiculo builVehiculo(){
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
        Sede sede = empleado.getSede();
        if (tipoVehiculo.equals("Bus")) {
            return new Bus(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, enchufable, hibrido, Integer.parseInt(txt_pasajeros.getText()), Integer.parseInt(txt_puertas.getText()), Integer.parseInt(txt_bolsas.getText()), Integer.parseInt(txt_ejes.getText()), Integer.parseInt(txt_salidas.getText()), Double.parseDouble(txt_maletero.getText()), aireAcondicionado, camaraReversa, frenosABS, sede);
        }
        else if (tipoVehiculo.equals("Camion")) {
            return new Camion(txt_placa.getText(), txt_marca.getText(), estadoVehiculo, Integer.parseInt(txt_modelo.getText()), Integer.parseInt(txt_cambios.getText()), Double.parseDouble(txt_velocidad.getText()), Double.parseDouble(txt_cilindraje.getText()), tipoTransmision, tipoUso, aireAcondicionado, camaraReversa, frenosABS, Integer.parseInt(txt_ejes.getText()), Double.parseDouble(txt_cajacarga.getText()), txt_camion.getText(), sede);
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
    }

    /**
     * Metodo para agregar un vehiculo a la lista de vehiculos de la tabla
     */
    private void agregarVehiculo(){
        if (verificarCasillasCorrectas() && verificarCasillasLlenas()) {
            Vehiculo vehiculo = builVehiculo();
            if (gestionVehiculoController.crearVehiculo(vehiculo)) {
                listaVehiculos.add(vehiculo);
                limpiarSeleccion();
            }
        }
    }

    /**
     * Metodo para actualizar la informacion del vehiculo seleccionado
     */
    private void actualizarVehiculo(){
        if (verificarCasillasCorrectas() && verificarCasillasLlenas()) {
            if (selectedVehiculo != null && gestionVehiculoController.actualizarVehiculo(selectedVehiculo.getPlaca(), builVehiculo())) {
                tbl_1.refresh();
                limpiarSeleccion();
            }
        }
    }

    /**
     * Metodo para eliminar un vehiculo de la lista de vehiculos de la sede segun la indentificacion proporcionada
     */
    private void eliminarVehiculo(){
        if (gestionVehiculoController.eliminarVehiculo(txt_placa.getText())) {
            listaVehiculos.remove(selectedVehiculo);
            limpiarSeleccion();
        }
    }

    /**
     * Metodo para obtener la lista de vehiculos de la sede del empleado y asignarla a la lista de vehiculos del controlador
     */
    private void obtenerVehiculos(){
        listaVehiculos.addAll(gestionVehiculoController.obtenerListaVehiculos());
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
        if (esEntero(txt_modelo.getText()) && esEntero(txt_cambios.getText()) && esDouble(txt_velocidad.getText()) && esDouble(txt_cilindraje.getText()) && tipoVehiculo != null) {
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
        obtenerVehiculos();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaVehiculos);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla vehiculos del controlador
     */
    private void initDataBinding() {
        cl_placa.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        cl_estado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstadoVehiculo().name()));
        cl_uso.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoUso().name()));
        cl_disponibilidad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstadoDisponibilidad().name()));
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de vehiculos
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculo = newSelection;
            mostrarInformacionVehiculo(selectedVehiculo);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de vehiculos
     */
    private void limpiarSeleccion() {
        tbl_1.getSelectionModel().clearSelection();
        lb_vehiculo.setVisible(false);
        txt_placa.setVisible(false);
        lb_marca.setVisible(false);
        txt_marca.setVisible(false);
        lb_estado.setVisible(false);
        cb_estado.setVisible(false);
        lb_modelo.setVisible(false);
        txt_modelo.setVisible(false);
        lb_cambios.setVisible(false);
        txt_cambios.setVisible(false);
        lb_vehiculo.setVisible(false);
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
        lb_cambios.setVisible(false);
        txt_camion.setVisible(false);
        lb_tiempo.setVisible(false);
        txt_tiempo.setVisible(false);
        lb_cajacarga.setVisible(false);
        txt_cajacarga.setVisible(false);        
        limpiarCamposVehiculos();
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de los vehiculos
     */
    private void limpiarCamposVehiculos() {
        cb_vehiculo.getSelectionModel().clearSelection();
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
    }

    /**
     * Metodo para saber si un String es un dato de tipo double
     * @param texto String a verificar
     * @return Booleano sobre si el String es double o no
     */
    private boolean esDouble(String texto){
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Metodo para saber si un String es un dato de tipo int
     * @param texto String a verificar
     * @return Booleano sobre si el String es int o no
     */
    private boolean esEntero(String texto){
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @FXML
    void initialize() {
        cb_vehiculo.getItems().addAll("Bus", "Camion", "Camioneta", "Deportivo", "Motocicleta", "Pick up", "Sedan", "Van");
        assert txt_marca != null : "fx:id=\"txt_marca\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_vehiculo != null : "fx:id=\"lb_vehiculo\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_modelo != null : "fx:id=\"lb_modelo\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_camara != null : "fx:id=\"checkb_camara\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_modelo != null : "fx:id=\"txt_modelo\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_cambios != null : "fx:id=\"lb_cambios\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_crucero != null : "fx:id=\"checkb_crucero\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_maletero != null : "fx:id=\"lb_maletero\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_uso != null : "fx:id=\"lb_uso\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_autonomia != null : "fx:id=\"lb_autonomia\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_aire != null : "fx:id=\"checkb_aire\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_cilindraje != null : "fx:id=\"lb_cilindraje\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_transmision != null : "fx:id=\"lb_transmision\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_bolsas != null : "fx:id=\"lb_bolsas\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_bolsas != null : "fx:id=\"txt_bolsas\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_estado != null : "fx:id=\"lb_estado\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_salidas != null : "fx:id=\"txt_salidas\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_cilindraje != null : "fx:id=\"txt_cilindraje\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_placa != null : "fx:id=\"txt_placa\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cb_uso != null : "fx:id=\"cb_uso\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_4x4 != null : "fx:id=\"checkb_4x4\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cl_placa != null : "fx:id=\"cl_placa\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_cajacarga != null : "fx:id=\"lb_cajacarga\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_enchufable != null : "fx:id=\"lb_enchufable\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cl_uso != null : "fx:id=\"cl_uso\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cl_estado != null : "fx:id=\"cl_estado\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_cambios != null : "fx:id=\"txt_cambios\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_abs != null : "fx:id=\"checkb_abs\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_velocidad != null : "fx:id=\"txt_velocidad\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_hibrido != null : "fx:id=\"lb_hibrido\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cb_estado != null : "fx:id=\"cb_estado\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_camion != null : "fx:id=\"lb_camion\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_aire != null : "fx:id=\"lb_aire\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_colision != null : "fx:id=\"checkb_colision\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_tiempocarga != null : "fx:id=\"lb_tiempocarga\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_camion != null : "fx:id=\"txt_camion\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cb_vehiculo != null : "fx:id=\"cb_vehiculo\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_puertas != null : "fx:id=\"lb_puertas\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_pasajeros != null : "fx:id=\"txt_pasajeros\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_tiempocarga != null : "fx:id=\"txt_tiempocarga\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cb_transmision != null : "fx:id=\"cb_transmision\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_ejes != null : "fx:id=\"txt_ejes\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_crucero != null : "fx:id=\"lb_crucero\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_hibrido != null : "fx:id=\"checkb_hibrido\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_asistente != null : "fx:id=\"checkb_asistente\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_marca != null : "fx:id=\"lb_marca\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_autonomia != null : "fx:id=\"txt_autonomia\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_placa != null : "fx:id=\"lb_placa\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_puertas != null : "fx:id=\"txt_puertas\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_cajacarga != null : "fx:id=\"txt_cajacarga\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert cl_disponibilidad != null : "fx:id=\"cl_disponibilidad\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_enchufable != null : "fx:id=\"checkb_enchufable\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_maletero != null : "fx:id=\"txt_maletero\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_colision != null : "fx:id=\"lb_colision\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_trafico != null : "fx:id=\"lb_trafico\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_pasajeros != null : "fx:id=\"lb_pasajeros\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_hp != null : "fx:id=\"lb_hp\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_tiempo != null : "fx:id=\"lb_tiempo\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert checkb_trafico != null : "fx:id=\"checkb_trafico\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_salidas != null : "fx:id=\"lb_salidas\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_camara != null : "fx:id=\"lb_camara\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_abs != null : "fx:id=\"lb_abs\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_hp != null : "fx:id=\"txt_hp\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_velocidad != null : "fx:id=\"lb_velocidad\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert txt_tiempo != null : "fx:id=\"txt_tiempo\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_ejes != null : "fx:id=\"lb_ejes\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_asistente != null : "fx:id=\"lb_asistente\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
        assert lb_4x4 != null : "fx:id=\"lb_4x4\" was not injected: check your FXML file 'gestionVehiculos.fxml'.";
    }
}