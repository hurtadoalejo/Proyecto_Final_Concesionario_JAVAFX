package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionSedesController;
import co.edu.uniquindio.poo.model.Ciudad;
import co.edu.uniquindio.poo.model.Sede;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GestionSedesViewController {

    GestionSedesController gestionSedesController;
    ObservableList<Sede> listaSedes = FXCollections.observableArrayList();
    Sede selectedSede;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Sede> tbl_1;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_6;

    @FXML
    private Button bt_3;

    @FXML
    private Button bt_4;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private TableColumn<Sede, Integer> cl_codigo;

    @FXML
    private Pane pane_1;

    @FXML
    private TextField txt_1;

    @FXML
    private Label lb_3;

    @FXML
    private TextField txt_2;

    @FXML
    private Label lb_1;

    @FXML
    private TableColumn<Sede, Double> cl_dinero;

    @FXML
    private Label lb_2;

    @FXML
    private TableColumn<Sede, String> cl_ciudad;

    @FXML
    private TableColumn<Sede, String> cl_direccion;

    @FXML
    private ComboBox<Ciudad> cb_1;

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para inicializar la interfaz del concesionario
     */
    @FXML
    void onOpenConcesionario() {
        app.openConcesionario();
    }

    /**
     * Metodo para inicializar la interfaz de la gestion de administradores
     */
    @FXML
    void onOpenGestionAdministradores() {
        app.openGestionAdministradores();
    }

    /**
     * Metodo para manejar el evento de agregar una nueva sede
     */
    @FXML
    void onAgregarSede() {
        agregarSede();
    }

    /**
     * Metodo para manejar el evento de actualizar una nueva sede
     */
    @FXML
    void onActualizarSede() {
        actualizarSede();
    }

    /**
     * Metodo para manejar el evento de eliminar una sede
     */
    @FXML
    void onEliminarSede() {
        eliminarSede();
    }

    /**
     * Metodo para manejar el evento de limpiar la seleccion actual
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
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

    /**
     * Metodo para verificar si las casillas de texto relacionadas con la informacion de la sede estan llenas
     * @return Booleano sobre si todos los campos estan llenos o no
     */
    private boolean verificarCasillasLlenas(){
        boolean decision = false;
        if (!txt_1.getText().isEmpty() && !txt_2.getText().isEmpty() && !cb_1.getSelectionModel().isEmpty()) {
            decision = true;
        }
        return decision;
    }

    /**
     * 
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de la sede tienen el tipo de dato adecuado
     * @return Booleano sobre si todos los campos estan con los datos correctos o no
     */
    private boolean verificarCasillasCorrecta(){
        boolean decision = false;
        if (esEntero(txt_1.getText())) {
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerSedes();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaSedes);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla sedes del controlador
     */
    private void initDataBinding() {
        cl_codigo.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCodigo()).asObject());
        cl_direccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        cl_ciudad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCiudad().name()));
        cl_dinero.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getDineroGanadoNeto()).asObject());
    }

    /**
     * Metodo para obtener la lista de sedes del concesionario y asignarla a la lista de sedes del controlador
     */
    private void obtenerSedes(){
        listaSedes.addAll(gestionSedesController.obtenerListaSedes());
    }

    /**
     * Metodo para mostrar la informacion de la sede
     * @param sede Sede a mostrar
     */
    private void mostrarInformacionSede(Sede sede){
        if (sede != null) {
            txt_1.setText(String.valueOf(sede.getCodigo()));
            txt_1.setDisable(true);
            txt_2.setText(sede.getDireccion());
            cb_1.getSelectionModel().select(sede.getCiudad());
        }
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de sedes
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedSede = newSelection;
            mostrarInformacionSede(selectedSede);
        });
    }
    
    /**
     * Metodo para agregar una sede a la lista de sede de la tabla
     */
    private void agregarSede(){
        if (verificarCasillasLlenas() && verificarCasillasCorrecta()) {
            Sede sede = buildSede();
            if (gestionSedesController.crearSede(sede)) {
                listaSedes.add(sede);
                limpiarCamposSedes();
            }
        }
    }

    /**
     * Metodo para crear una sede con los datos ingresados en los campos de texto
     * @return Sede creada
     */
    private Sede buildSede(){
        Sede sede = new Sede(Integer.parseInt(txt_1.getText()), txt_2.getText(), cb_1.getSelectionModel().getSelectedItem());
        return sede;
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de sedes
     */
    private void limpiarSeleccion() {
        tbl_1.getSelectionModel().clearSelection();
        txt_1.setDisable(false);
        limpiarCamposSedes();
    }

    /**
     * Metodo para eliminar una sede de la lista de sedes segun el codigo proporcionado
     */
    private void eliminarSede(){
        if (esEntero(txt_1.getText())) {
            if (gestionSedesController.eliminarSede(Integer.parseInt(txt_1.getText()))) {
                listaSedes.remove(selectedSede);
                limpiarCamposSedes();
                limpiarSeleccion();
            }
        }
    }

    /**
     * Metodo para actualizar la informacion de la sede seleccionada
     */
    private void actualizarSede(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            if (selectedSede != null && gestionSedesController.actualizarSede(selectedSede.getCodigo(), buildSede())) {
                tbl_1.refresh();
                limpiarSeleccion();
                limpiarCamposSedes();
            }
        }
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de la sede
     */
    private void limpiarCamposSedes() {
        txt_1.clear();
        txt_2.clear();
        cb_1.getSelectionModel().clearSelection();
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado, configura el gestionsedescontroller e inicializa el combobox usado
     */
    @FXML
    void initialize() {
        cb_1.getItems().addAll(Ciudad.values());
        gestionSedesController = new GestionSedesController(App.concesionario);
        initView();
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert bt_6 != null : "fx:id=\"bt_6\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert cl_dinero != null : "fx:id=\"cl_dinero\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert cl_codigo != null : "fx:id=\"cl_codigo\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert txt_2 != null : "fx:id=\"txt_2\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert cl_ciudad != null : "fx:id=\"cl_ciudad\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert cl_direccion != null : "fx:id=\"cl_direccion\" was not injected: check your FXML file 'gestionSedes.fxml'.";
        assert cb_1 != null : "fx:id=\"cb_1\" was not injected: check your FXML file 'gestionSedes.fxml'.";

    }
}
