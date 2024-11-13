package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionAdministradoresController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Sede;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GestionAdministradoresViewController {

    GestionAdministradoresController gestionAdministradoresController;
    ObservableList<Administrador> listaAdministradores = FXCollections.observableArrayList();
    Administrador selectedAdministrador;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lb_9;

    @FXML
    private TableColumn<Administrador, Integer> cl_sedeCodigo;

    @FXML
    private Label lb_3;

    @FXML
    private Label lb_4;

    @FXML
    private Label lb_1;

    @FXML
    private Label lb_2;

    @FXML
    private Label lb_7;

    @FXML
    private Label lb_8;

    @FXML
    private Label lb_5;

    @FXML
    private Label lb_6;

    @FXML
    private TableView<Administrador> tbl_1;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_6;

    @FXML
    private Button bt_3;

    @FXML
    private TableColumn<Administrador, String> cl_identificacion;

    @FXML
    private Button bt_4;

    @FXML
    private TableColumn<Administrador, Integer> cl_password;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private TextField txt_7;

    @FXML
    private TableColumn<Administrador, String> cl_usuario;

    @FXML
    private Pane pane_1;

    @FXML
    private TableColumn<Administrador, String> cl_nombre;

    @FXML
    private TextField txt_1;

    @FXML
    private TextField txt_2;

    @FXML
    private TextField txt_5;

    @FXML
    private TextField txt_6;

    @FXML
    private TextField txt_3;

    @FXML
    private TextField txt_4;

    @FXML
    private ComboBox<Sede> cb_1;

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para inicializar la interfaz de la gestion de sedes
     */
    @FXML
    void onOpenGestionSedes() {
        app.openGestionSedes();
    }

    /**
     * Metodo para inicializar la interfaz del menu concesionario
     */
    @FXML
    void onOpenConcesionario() {
        app.openConcesionario();
    }

    /**
     * Metodo para manejar el evento de limpiar la seleccion actual
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    /**
     * Metodo para manejar el evento de eliminar un administrador
     */
    @FXML
    void onEliminarAdministrador() {
        eliminarAdministrador();
    }

    /**
     * Metodo para manejar el evento de actualizar un administrador
     */
    @FXML
    void onActualizarAdministrador() {
        actualizarAdministrador();
    }

    /**
     * Metodo para manejar el evento de agregar un nuevo Administrador
     */
    @FXML
    void onAgregarAdministrador() {
        agregarAdministrador();
    }

    /**
     * Metodo para mostrar la informacion del administrador
     * @param administrador Administrador a mostrar
     */
    private void mostrarInformacionAdministrador(Administrador administrador){
        if (administrador != null) {
            txt_1.setText(administrador.getNombre());
            txt_2.setText(administrador.getIdentificacion());
            txt_2.setDisable(true);
            txt_3.setText(administrador.getCorreo());
            txt_4.setText(String.valueOf(administrador.getSalarioBase()));
            txt_5.setText(administrador.getUsuario());
            txt_6.setText(String.valueOf(administrador.getPassword()));
            txt_7.setText(administrador.getRespuestaPregunta());
            cb_1.getSelectionModel().select(administrador.getSede());
        }
    }

    /**
     * Metodo para crear un Administrador con los datos ingresados en los campos de texto
     * @return Administrador creado
     */
    private Administrador builAdministrador(){
        Sede sedeSeleccionada = cb_1.getSelectionModel().getSelectedItem();
        Administrador administrador = new Administrador(txt_1.getText(), txt_2.getText(), txt_3.getText(), Double.parseDouble(txt_4.getText()), sedeSeleccionada, txt_5.getText(), Integer.parseInt(txt_6.getText()), App.concesionario, txt_7.getText());
        return administrador;
    }

    /**
     * Metodo para agregar un administrador a la lista de administradores de la tabla
     */
    private void agregarAdministrador(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            Administrador administrador = builAdministrador();
            if (gestionAdministradoresController.crearAdministrador(administrador)) {
                listaAdministradores.add(administrador);
                limpiarCamposAdministradores();
            }
        }
    }

    /**
     * Metodo para actualizar la informacion del administrador seleccionado
     */
    private void actualizarAdministrador(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            if (selectedAdministrador != null && gestionAdministradoresController.actualizarAdministrador(selectedAdministrador.getIdentificacion(), builAdministrador())) {
                tbl_1.refresh();
                limpiarSeleccion();
                limpiarCamposAdministradores();
            }
        }
    }

    /**
     * Metodo para eliminar una sede de la lista de administradores segun la indentificacion proporcionada
     */
    private void eliminarAdministrador(){
        if (gestionAdministradoresController.eliminarAdministrador(txt_2.getText())) {
            listaAdministradores.remove(selectedAdministrador);
            limpiarCamposAdministradores();
            limpiarSeleccion();
        }
    }

    /**
     * Metodo para obtener la lista de administradores del concesionario y asignarla a la lista de administradores del controlador
     */
    private void obtenerAdministradores(){
        listaAdministradores.addAll(gestionAdministradoresController.obtenerListaAdministradores());
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con la informacion de los administradores estan llenas
     * @return Booleano sobre si todos los campos estan llenos o no
     */
    private boolean verificarCasillasLlenas(){
        boolean decision = false;
        if (!txt_1.getText().isEmpty() && !txt_2.getText().isEmpty() && !txt_3.getText().isEmpty() && !txt_4.getText().isEmpty() && !txt_5.getText().isEmpty() && !txt_6.getText().isEmpty() && !txt_7.getText().isEmpty() && !cb_1.getSelectionModel().isEmpty()){
            decision = true;
        }
        return decision;
    }

    /**
     * 
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de los administradores tienen el tipo de dato adecuado
     * @return Booleano sobre si todos los campos estan con los datos correctos o no
     */
    private boolean verificarCasillasCorrecta(){
        boolean decision = false;
        if (esEntero(txt_2.getText()) && esDouble(txt_4.getText()) && esEntero(txt_6.getText())) {
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerAdministradores();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaAdministradores);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla administradores del controlador
     */
    private void initDataBinding() {
        cl_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        cl_identificacion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdentificacion()));
        cl_sedeCodigo.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getSede().getCodigo()).asObject());
        cl_usuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario()));
        cl_password.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getPassword()).asObject());
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de administradores
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedAdministrador = newSelection;
            mostrarInformacionAdministrador(selectedAdministrador);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de administradores
     */
    private void limpiarSeleccion() {
        tbl_1.getSelectionModel().clearSelection();
        txt_2.setDisable(false);
        limpiarCamposAdministradores();
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de los administradores
     */
    private void limpiarCamposAdministradores() {
        txt_1.clear();
        txt_2.clear();
        txt_3.clear();
        txt_4.clear();
        txt_5.clear();
        txt_6.clear();
        txt_7.clear();
        cb_1.getSelectionModel().clearSelection();
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
     * Metodo para configurar la visualizacion del combobox, mostrando el codigo de las sedes
     */
    public void configurarComboBox(){
        cb_1.setCellFactory(param -> new ListCell<Sede>() {
            @Override
            protected void updateItem(Sede sede, boolean empty) {
                super.updateItem(sede, empty);
                if (empty || sede == null) {
                    setText(null);
                } else {
                    setText(String.valueOf(sede.getCodigo()));
                }
            }
        });
    
        cb_1.setButtonCell(new ListCell<Sede>() {
            @Override
            protected void updateItem(Sede sede, boolean empty) {
                super.updateItem(sede, empty);
                if (empty || sede == null) {
                    setText(null);
                } else {
                    setText(String.valueOf(sede.getCodigo()));
                }
            }
        });
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado, ademas de asignar su debido controlador, configurar el combobox e inicializar la vista
     */
    @FXML
    void initialize() {
        gestionAdministradoresController = new GestionAdministradoresController(App.concesionario);
        cb_1.getItems().addAll(gestionAdministradoresController.obtenerListaSedes());
        configurarComboBox();
        initView();
        assert lb_9 != null : "fx:id=\"lb_9\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert cl_sedeCodigo != null : "fx:id=\"cl_sedeCodigo\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_4 != null : "fx:id=\"lb_4\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_7 != null : "fx:id=\"lb_7\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_8 != null : "fx:id=\"lb_8\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_5 != null : "fx:id=\"lb_5\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert lb_6 != null : "fx:id=\"lb_6\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert bt_6 != null : "fx:id=\"bt_6\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert cl_identificacion != null : "fx:id=\"cl_identificacion\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert cl_password != null : "fx:id=\"cl_password\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert txt_7 != null : "fx:id=\"txt_7\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert cl_usuario != null : "fx:id=\"cl_usuario\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert cl_nombre != null : "fx:id=\"cl_nombre\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert txt_2 != null : "fx:id=\"txt_2\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert txt_5 != null : "fx:id=\"txt_5\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert txt_6 != null : "fx:id=\"txt_6\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert txt_3 != null : "fx:id=\"txt_3\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert txt_4 != null : "fx:id=\"txt_4\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";
        assert cb_1 != null : "fx:id=\"cb_1\" was not injected: check your FXML file 'gestionAdministradores.fxml'.";

    }
}