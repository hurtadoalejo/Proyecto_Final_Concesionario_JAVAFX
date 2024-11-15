package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionEmpleadoController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GestionEmpleadosViewController {

    GestionEmpleadoController gestionEmpleadoController;
    private Administrador administrador;
    ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();
    Empleado selectedEmpleado;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Empleado, Integer> cl_sedeCodigo;

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
    private TableView<Empleado> tbl_1;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_6;

    @FXML
    private Button bt_3;

    @FXML
    private TableColumn<Empleado, String> cl_identificacion;

    @FXML
    private Button bt_4;

    @FXML
    private TableColumn<Empleado, Integer> cl_password;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private TextField txt_7;

    @FXML
    private TableColumn<Empleado, String> cl_usuario;

    @FXML
    private Pane pane_1;

    @FXML
    private TableColumn<Empleado, String> cl_nombre;

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

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para establecer el administrador para este controlador
     * @param administrador Administrador a establecer
     */
    @SuppressWarnings("exports")
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Metodo para inicializar el gestionEmpleadoController con el administrador administrado y luego inicializar el initView
     * @param administrador Administrador administrado
     */
    @SuppressWarnings("exports")
    public void inicializarAdministrador(Administrador administrador) {
        gestionEmpleadoController = new GestionEmpleadoController(administrador, App.concesionario);
        initView();
    }

    /**
     * Metodo para inicializar la interfaz de la gestion de reportes
     */
    @FXML
    void onOpenGestionReportes() {
        app.openGestionReportes(administrador);
    }

    /**
     * Metodo para inicializar la interfaz del menu de administrador
     */
    @FXML
    void onOpenMenuAdmin() {
        app.openMenuAdmin(administrador);
    }

    /**
     * Metodo para manejar el evento de eliminar un empleado
     */
    @FXML
    void onEliminarEmpleado() {
        eliminarEmpleado();
    }

    /**
     * Metodo para manejar el evento de actualizar un empleado
     */
    @FXML
    void onActualizarEmpleado() {
        actualizarEmpleado();
    }

    /**
     * Metodo para manejar el evento de agregar un empleado
     */
    @FXML
    void onAgregarEmpleado() {
        agregarEmpleado();
    }

    /**
     * Metodo para manejar el evento de limpiar seleccion
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    /**
     * Metodo para mostrar la informacion del empleado
     * @param empleado Empleado a mostrar
     */
    private void mostrarInformacionEmpleado(Empleado empleado){
        if (empleado != null) {
            txt_1.setText(empleado.getNombre());
            txt_2.setText(empleado.getIdentificacion());
            txt_2.setDisable(true);
            txt_3.setText(empleado.getCorreo());
            txt_4.setText(String.valueOf(empleado.getSalarioBase()));
            txt_5.setText(empleado.getUsuario());
            txt_6.setText(String.valueOf(empleado.getPassword()));
            txt_7.setText(empleado.getRespuestaPregunta());
        }
    }

    /**
     * Metodo para crear un Empleado con los datos ingresados en los campos de texto
     * @return Empleado creado
     */
    private Empleado builEmpleado(){
        Empleado empleado = new Empleado(txt_1.getText(), txt_2.getText(), txt_3.getText(), Double.parseDouble(txt_4.getText()), txt_5.getText(), Integer.parseInt(txt_6.getText()), App.concesionario, administrador.getSede(), txt_7.getText());
        return empleado;
    }

    /**
     * Metodo para agregar un empleado a la lista de empleados de la tabla
     */
    private void agregarEmpleado(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            Empleado empleado = builEmpleado();
            if (gestionEmpleadoController.crearEmpleado(empleado)) {
                listaEmpleados.add(empleado);
                limpiarCamposEmpleados();
            }
        }
    }

    /**
     * Metodo para actualizar la informacion del empleado seleccionado
     */
    private void actualizarEmpleado(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            if (selectedEmpleado != null && gestionEmpleadoController.actualizarEmpleado(selectedEmpleado.getIdentificacion(), builEmpleado())) {
                tbl_1.refresh();
                limpiarSeleccion();
                limpiarCamposEmpleados();
            }
        }
    }

    /**
     * Metodo para eliminar una sede de la lista de empleados de la sede segun la indentificacion proporcionada
     */
    private void eliminarEmpleado(){
        if (gestionEmpleadoController.eliminarEmpleado(txt_2.getText())) {
            listaEmpleados.remove(selectedEmpleado);
            limpiarSeleccion();
        }
    }

    /**
     * Metodo para obtener la lista de empleados de la sede del administrador y asignarla a la lista de empleados del controlador
     */
    private void obtenerEmpleados(){
        listaEmpleados.addAll(gestionEmpleadoController.obtenerListaEmpleados());
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con la informacion de los administradores estan llenas
     * @return Booleano sobre si todos los campos estan llenos o no
     */
    private boolean verificarCasillasLlenas(){
        boolean decision = false;
        if (!txt_1.getText().isEmpty() && !txt_2.getText().isEmpty() && !txt_3.getText().isEmpty() && !txt_4.getText().isEmpty() && !txt_5.getText().isEmpty() && !txt_6.getText().isEmpty() && !txt_7.getText().isEmpty()){
            decision = true;
        }
        return decision;
    }

    /**
     * 
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de los empleados tienen el tipo de dato adecuado
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
        obtenerEmpleados();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaEmpleados);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla empleados del controlador
     */
    private void initDataBinding() {
        cl_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        cl_identificacion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdentificacion()));
        cl_sedeCodigo.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getSede().getCodigo()).asObject());
        cl_usuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario()));
        cl_password.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getPassword()).asObject());
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de empleados
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedEmpleado = newSelection;
            mostrarInformacionEmpleado(selectedEmpleado);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de empleados
     */
    private void limpiarSeleccion() {
        tbl_1.getSelectionModel().clearSelection();
        txt_2.setDisable(false);
        limpiarCamposEmpleados();
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de los empleados
     */
    private void limpiarCamposEmpleados() {
        txt_1.clear();
        txt_2.clear();
        txt_3.clear();
        txt_4.clear();
        txt_5.clear();
        txt_6.clear();
        txt_7.clear();
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
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado
     */
    @FXML
    void initialize() {
        assert cl_sedeCodigo != null : "fx:id=\"cl_sedeCodigo\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_4 != null : "fx:id=\"lb_4\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_7 != null : "fx:id=\"lb_7\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_8 != null : "fx:id=\"lb_8\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_5 != null : "fx:id=\"lb_5\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert lb_6 != null : "fx:id=\"lb_6\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert bt_6 != null : "fx:id=\"bt_6\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert cl_identificacion != null : "fx:id=\"cl_identificacion\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert cl_password != null : "fx:id=\"cl_password\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert txt_7 != null : "fx:id=\"txt_7\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert cl_usuario != null : "fx:id=\"cl_usuario\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert cl_nombre != null : "fx:id=\"cl_nombre\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert txt_2 != null : "fx:id=\"txt_2\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert txt_5 != null : "fx:id=\"txt_5\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert txt_6 != null : "fx:id=\"txt_6\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert txt_3 != null : "fx:id=\"txt_3\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";
        assert txt_4 != null : "fx:id=\"txt_4\" was not injected: check your FXML file 'gestionEmpleados.fxml'.";

    }
}