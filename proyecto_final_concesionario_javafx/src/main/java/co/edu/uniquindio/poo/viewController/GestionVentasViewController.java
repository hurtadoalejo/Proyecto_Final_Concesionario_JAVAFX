package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionVentasController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Venta;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GestionVentasViewController {

    GestionVentasController gestionVentasController;
    private Empleado empleado;
    ObservableList<Venta> listaVentas = FXCollections.observableArrayList();
    Venta selectedVenta;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Venta> tbl_1;

    @FXML
    private Label lb_vehiculo;

    @FXML
    private TableColumn<Venta, String> cl_placa;

    @FXML
    private TableColumn<Venta, Double> cl_precio;

    @FXML
    private TextField txt_codigo;

    @FXML
    private ComboBox<Vehiculo> cb_vehiculo;

    @FXML
    private Button bt_3;

    @FXML
    private Button bt_4;

    @FXML
    private TableColumn<Venta, String> cl_cedula;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private ComboBox<Cliente> cb_cliente;

    @FXML
    private TableColumn<Venta, Integer> cl_codigo;

    @FXML
    private DatePicker dp_fecha;

    @FXML
    private Pane pane_1;

    @FXML
    private Label lb_cliente;

    @FXML
    private Label lb_precio;

    @FXML
    private Label lb_1;

    @FXML
    private TextField txt_precio;

    @FXML
    private Label lb_fecha;

    @FXML
    private Label lb_codigo;

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
     * Metodo para inicializar el controller con el empleado administrador, configura los comboBox y luego inicia el initView
     * @param empleado
     */
    @SuppressWarnings("exports")
    public void inicializarController(Empleado empleado) {
        gestionVentasController = new GestionVentasController(empleado, App.concesionario);
        cb_vehiculo.getItems().addAll(empleado.getSede().getListaVehiculos());
        cb_cliente.getItems().addAll(empleado.getConcesionario().getListaClientes());
        configurarComboBoxVehiculo();
        configurarComboBoxCliente();
        initView();
    }

    /**
     * Metodo para manejar el evento de limpiar seleccion
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
        limpiarCamposVentas();
    }

    /**
     * Metodo para manejar el evento de eliminar una venta
     */
    @FXML
    void onEliminarVenta() {
        eliminarVenta();
    }

    /**
     * Metodo para manejar el evento de agregar una venta
     */
    @FXML
    void onAgregarVenta() {
        agregarVenta();
    }

    /**
     * Metodo para inicializar la interfaz del menu del empleado
     */
    @FXML
    void onOpenEmpleado() {
        app.openMenuEmpleado(empleado);
    }

    private void mostrarInformacionVenta(Venta venta) {
        if (venta != null) {
            dp_fecha.setValue(venta.getFechaVenta());
            txt_codigo.setText(String.valueOf(venta.getCodigo()));
            txt_precio.setText(String.valueOf(venta.getTotalVenta()));
            if (empleado.getConcesionario().getListaClientes().contains(venta.getCliente())) {
                cb_cliente.setValue(venta.getCliente());
            }
            if (venta.getSede().getListaVehiculos().contains(venta.getVehiculo())) {
                cb_vehiculo.setValue(venta.getVehiculo());
            }
            txt_codigo.setDisable(true);
            txt_precio.setDisable(true);
            cb_vehiculo.setDisable(true);
            cb_cliente.setDisable(true);
            dp_fecha.setDisable(true);
        }
    }

    /**
     * Metodo para crear una venta con los datos ingresados en los campos de texto
     * @return Venta creada
     */
    private Venta buildVenta(){
        Venta venta = new Venta(Integer.parseInt(txt_codigo.getText()), empleado, cb_cliente.getSelectionModel().getSelectedItem(), cb_vehiculo.getSelectionModel().getSelectedItem(), Double.parseDouble(txt_precio.getText()), dp_fecha.getValue(), empleado.getSede());
        return venta;
    }

    /**
     * Metodo para agregar una venta a la lista de ventas de la tabla
     */
    private void agregarVenta(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            Venta venta = buildVenta();
            if (gestionVentasController.crearVenta(venta)) {
                listaVentas.add(venta);
                limpiarCamposVentas();
            }
        }
    }

    /**
     * Metodo para eliminar una sede de la lista de ventas segun el codgio proporcionado
     */
    private void eliminarVenta(){
        if (esEntero(txt_codigo.getText())) {
            if (gestionVentasController.eliminarVenta(Integer.parseInt(txt_codigo.getText()))) {
                listaVentas.remove(selectedVenta);
                limpiarCamposVentas();
                limpiarSeleccion();
            }
        }
    }

    /**
     * Metodo para obtener la lista de venta de la sede del empleado y asignarla a la lista de ventas del controlador
     */
    private void obtenerVentas() {
        listaVentas.addAll(gestionVentasController.obtenerListaVentas());
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con la informacion de las ventas estan llenas
     * @return Booleano sobre si todos los campos estan llenos o no
     */
    private boolean verificarCasillasLlenas(){
        boolean decision = false;
        if (!txt_codigo.getText().isEmpty() && !txt_precio.getText().isEmpty() && !cb_cliente.getSelectionModel().isEmpty() && !cb_vehiculo.getSelectionModel().isEmpty() && dp_fecha.getValue() != null){
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de los ventas tienen el tipo de dato adecuado
     * @return Booleano sobre si todos los campos estan con los datos correctos o no
     */
    private boolean verificarCasillasCorrecta(){
        boolean decision = false;
        if (esEntero(txt_codigo.getText()) && esDouble(txt_precio.getText())) {
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerVentas();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaVentas);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla ventas del controlador
     */
    private void initDataBinding() {
        cl_codigo.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCodigo()).asObject());
        cl_cedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getIdentificacion()));
        cl_placa.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getPlaca()));
        cl_precio.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getTotalVenta()).asObject());
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de ventas
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVenta = newSelection;
            mostrarInformacionVenta(selectedVenta);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de ventas
     */
    private void limpiarSeleccion() {
        tbl_1.getSelectionModel().clearSelection();
        txt_codigo.setDisable(false);
        txt_precio.setDisable(false);
        cb_vehiculo.setDisable(false);
        cb_cliente.setDisable(false);
        dp_fecha.setDisable(false);
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de las ventas
     */
    private void limpiarCamposVentas() {
        txt_codigo.clear();
        txt_precio.clear();
        cb_cliente.getSelectionModel().clearSelection();
        cb_vehiculo.getSelectionModel().clearSelection();
        dp_fecha.setValue(null);
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
     * Método para configurar la visualización del ComboBox de vehiculo, mostrando la placa de los vehiculos
     */
    public void configurarComboBoxVehiculo() {
        cb_vehiculo.setCellFactory(param -> new ListCell<Vehiculo>() {
            @Override
            protected void updateItem(Vehiculo vehiculo, boolean empty) {
                super.updateItem(vehiculo, empty);
                if (empty || vehiculo == null) {
                    setText(null);
                } else {
                    setText(vehiculo.getPlaca());
                }
            }
        });

        cb_vehiculo.setButtonCell(new ListCell<Vehiculo>() {
            @Override
            protected void updateItem(Vehiculo vehiculo, boolean empty) {
                super.updateItem(vehiculo, empty);
                if (empty || vehiculo == null) {
                    setText(null);
                } else {
                    setText(vehiculo.getPlaca());
                }
            }
        });
    }

    /**
     * Método para configurar la visualización del ComboBox, mostrando la identificación de los clientes.
     */
    public void configurarComboBoxCliente() {
        cb_cliente.setCellFactory(param -> new ListCell<Cliente>() {
            @Override
            protected void updateItem(Cliente cliente, boolean empty) {
                super.updateItem(cliente, empty);
                if (empty || cliente == null) {
                    setText(null);
                } else {
                    setText(cliente.getIdentificacion());
                }
            }
        });

        cb_cliente.setButtonCell(new ListCell<Cliente>() {
            @Override
            protected void updateItem(Cliente cliente, boolean empty) {
                super.updateItem(cliente, empty);
                if (empty || cliente == null) {
                    setText(null);
                } else {
                    setText(cliente.getIdentificacion());
                }
            }
        });
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado
     */
    @FXML
    void initialize() {
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert lb_vehiculo != null : "fx:id=\"lb_vehiculo\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert cl_placa != null : "fx:id=\"cl_placa\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert cl_precio != null : "fx:id=\"cl_precio\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert txt_codigo != null : "fx:id=\"txt_codigo\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert cb_vehiculo != null : "fx:id=\"cb_vehiculo\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert cl_cedula != null : "fx:id=\"cl_cedula\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert cb_cliente != null : "fx:id=\"cb_cliente\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert cl_codigo != null : "fx:id=\"cl_codigo\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert dp_fecha != null : "fx:id=\"dp_fecha\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert lb_cliente != null : "fx:id=\"lb_cliente\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert lb_precio != null : "fx:id=\"lb_precio\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert txt_precio != null : "fx:id=\"txt_precio\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert lb_fecha != null : "fx:id=\"lb_fecha\" was not injected: check your FXML file 'gestionVentas.fxml'.";
        assert lb_codigo != null : "fx:id=\"lb_codigo\" was not injected: check your FXML file 'gestionVentas.fxml'.";
    }
}