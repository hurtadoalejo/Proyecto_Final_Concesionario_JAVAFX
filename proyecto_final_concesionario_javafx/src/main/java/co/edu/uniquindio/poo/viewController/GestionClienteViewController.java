package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionClienteController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
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

public class GestionClienteViewController {

    GestionClienteController gestionClienteController;
    private Empleado empleado;
    ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Cliente> tbl_1;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_3;

    @FXML
    private TableColumn<Cliente, String> cl_identificacion;

    @FXML
    private Button bt_4;

    @FXML
    private Button bt_1;

    @FXML
    private TableColumn<Cliente, String> cl_correo;

    @FXML
    private Button bt_2;

    @FXML
    private Pane pane_1;

    @FXML
    private TableColumn<Cliente, String> cl_nombre;

    @FXML
    private TextField txt_1;

    @FXML
    private Label lb_3;

    @FXML
    private TextField txt_2;

    @FXML
    private Label lb_4;

    @FXML
    private Label lb_1;

    @FXML
    private Label lb_2;

    @FXML
    private TextField txt_3;

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
     * Metodo para inicializar el GestionClienteViewController con el empleado administrado y luego inicializar el initView
     * @param empleado Empleado administrado
     */
    @SuppressWarnings("exports")
    public void inicializarEmpleado(Empleado empleado) {
        gestionClienteController = new GestionClienteController(empleado, App.concesionario);
        initView();
    }

    /**
     * Metodo para manejar el evento de agregar un cliente
     */
    @FXML
    void onAgregarCliente() {
        agregarCliente();
    }

    /**
     * Metodo para manejar el evento de actualizar un cliente
     */
    @FXML
    void onActualizarCliente() {
        actualizarCliente();
    }

    /**
     * Metodo para manejar el evento de eliminar un cliente
     */
    @FXML
    void onEliminarCliente() {
        eliminarCliente();
    }

    /**
     * Metodo para inicializar la interfaz del menu del empleado
     */
    @FXML
    void onOpenEmpleado() {
        app.openMenuEmpleado(empleado);
    }

    /**
     * Metodo para manejar el evento de limpiar seleccion
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    /**
     * Metodo para mostrar la informacion del cliente
     * @param cliente Cliente a mostrar
     */
    private void mostrarInformacionCliente(Cliente cliente){
        if (cliente != null) {
            txt_1.setText(cliente.getNombre());
            txt_2.setText(cliente.getIdentificacion());
            txt_2.setDisable(true);
            txt_3.setText(cliente.getCorreo());
        }
    }

    /**
     * Metodo para crear un cliente con los datos ingresados en los campos de texto
     * @return Cliente creado
     */
    private Cliente builCliente(){
        Cliente cliente = new Cliente(txt_1.getText(), txt_2.getText(), txt_3.getText());
        return cliente;
    }

    /**
     * Metodo para agregar un cliente a la lista de clientes de la tabla
     */
    private void agregarCliente(){
        if (verificarCasillas()) {
            Cliente cliente = builCliente();
            if (gestionClienteController.crearCliente(cliente)) {
                listaClientes.add(cliente);
                limpiarCamposClientes();
            }
        }
    }

    /**
     * Metodo para actualizar la informacion del cliente seleccionado
     */
    private void actualizarCliente(){
        if (verificarCasillas()) {
            if (selectedCliente != null && gestionClienteController.actualizarCliente(txt_2.getText(), builCliente())) {
                tbl_1.refresh();
                limpiarSeleccion();
            }
        }
    }

    /**
     * Metodo para eliminar un cliente de la lista de cliente del concesionario segun la indentificacion proporcionada
     */
    private void eliminarCliente(){
        if (gestionClienteController.eliminarCliente(txt_2.getText())) {
            listaClientes.remove(selectedCliente);
            limpiarSeleccion();
        }
    }

    /**
     * Metodo para obtener la lista de clientes de la sede del administrador y asignarla a la lista de clientes del controlador
     */
    private void obtenerClientes(){
        listaClientes.addAll(gestionClienteController.obtenerListaClientes());
    }

    /**
     * 
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de los clientes estan llenas correctamente
     * @return Booleano sobre si todos los campos estan con los datos correctos o no
     */
    private boolean verificarCasillas(){
        boolean decision = false;
        if (esEntero(txt_2.getText()) && !txt_1.getText().isEmpty() && !txt_3.getText().isEmpty()) {
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerClientes();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaClientes);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla clientes del controlador
     */
    private void initDataBinding() {
        cl_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        cl_identificacion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdentificacion()));
        cl_correo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de clientes
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
            mostrarInformacionCliente(selectedCliente);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de clientes
     */
    private void limpiarSeleccion() {
        txt_2.setDisable(false);
        limpiarCamposClientes();
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de los clientes
     */
    private void limpiarCamposClientes() {
        txt_1.clear();
        txt_2.clear();
        txt_3.clear();
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
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado
     */
    @FXML
    void initialize() {
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert cl_identificacion != null : "fx:id=\"cl_identificacion\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert cl_correo != null : "fx:id=\"cl_correo\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert cl_nombre != null : "fx:id=\"cl_nombre\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert txt_2 != null : "fx:id=\"txt_2\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert lb_4 != null : "fx:id=\"lb_4\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'gestionClientes.fxml'.";
        assert txt_3 != null : "fx:id=\"txt_3\" was not injected: check your FXML file 'gestionClientes.fxml'.";

    }
}