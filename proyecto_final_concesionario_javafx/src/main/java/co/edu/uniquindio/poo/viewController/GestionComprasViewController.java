package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionComprasController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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

public class GestionComprasViewController {

    GestionComprasController gestionComprasController;
    private Empleado empleado;
    ObservableList<Compra> listaCompras = FXCollections.observableArrayList();
    Compra selectedCompra;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Compra> tbl_1;

    @FXML
    private DatePicker dp_fechaCompra;

    @FXML
    private TableColumn<Compra, Double> cl_precio;

    @FXML
    private TextField txt_codigo;

    @FXML
    private Label lb_fechaentrega;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_6;

    @FXML
    private Button bt_3;

    @FXML
    private Button bt_4;

    @FXML
    private TableColumn<Compra, String> cl_cedula;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private ComboBox<Cliente> cb_cliente;

    @FXML
    private TableColumn<Compra, Integer> cl_codigo;

    @FXML
    private Pane pane_1;

    @FXML
    private Label lb_cliente;

    @FXML
    private TableColumn<Compra, String> cl_fecha;

    @FXML
    private Label lb_1;

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
        gestionComprasController = new GestionComprasController(empleado, App.concesionario);
        cb_cliente.getItems().addAll(empleado.getConcesionario().getListaClientes());
        configurarComboBoxCliente();
        initView();
    }

    /**
     * Metodo para manejar el evento de limpiar seleccion
     */
    @FXML
    void onLimpiar() {
        limpiarSeleccion();
        limpiarCamposCompras();
    }

    /**
     * Metodo para manejar el evento de actualizar una compra
     */
    @FXML
    void onActualizarCompra() {
        actualizarCompra();
    }

    /**
     * Metodo para manejar el evento de agregar una compra
     */
    @FXML
    void onAgregarCompra() {
        agregarCompra();
    }

    /**
     * Metodo para inicializar la interfaz del menu del empleado
     */
    @FXML
    void onOpenEmpleado() {
        app.openMenuEmpleado(empleado);
    }

    /**
     * Metodo para manejar el evento de eliminar una compra
     */
    @FXML
    void onEliminarCompra() {
        eliminarCompra();
    }

    /**
     * Metodo para manejar el evento de concretar una compra
     */
    @FXML
    void onConcretarCompra() {
        concretarCompra();
    }

    /**
     * Metodo para inicializar la interfaz del menu del detalle de prestamo
     */
    @FXML
    void onOpenDetalleCompra() {
        app.openDetalleCompra(selectedCompra);
    }

    /**
     * Metodo para mostrar la informacion de la compra
     * @param compra Compra a mostrar
     */
    private void mostrarInformacionCompra(Compra compra){
        if (compra != null) {
            if (!mostrarInformacionPersonalizadaCompra(compra)) {
                txt_codigo.setDisable(true);
                txt_codigo.setText(String.valueOf(compra.getCodigo()));
                cb_cliente.getSelectionModel().select(compra.getCliente());
                dp_fechaCompra.setValue(compra.getFechaCompra());
                bt_6.setVisible(true);
            }
        }
    }

    /**
     * Metodo para mostrar la informacion de la compra ya pagada
     * @param compra Compra a mostrar
     * @return Booleano sobre si se pudo mostrar la compra ya pagado o no
     */
    private boolean mostrarInformacionPersonalizadaCompra(Compra compra){
        boolean accion = false;
        if (compra.isConcretada()) {
            txt_codigo.setDisable(true);
            cb_cliente.setDisable(true);
            dp_fechaCompra.setDisable(true);
            txt_codigo.setText(String.valueOf(compra.getCodigo()));
            cb_cliente.getSelectionModel().select(compra.getCliente());
            dp_fechaCompra.setValue(compra.getFechaCompra());
        }
        return accion;
    }

    /**
     * Metodo para crear una compra con los datos ingresados en los campos de texto
     * @return Compra creada
     */
    private Compra buildCompra(){
        Compra compra = new Compra(Integer.parseInt(txt_codigo.getText()), empleado, cb_cliente.getSelectionModel().getSelectedItem(), empleado.getSede(), dp_fechaCompra.getValue());
        return compra;
    }

    /**
     * Metodo para agregar una compra a la lista de compras de la tabla
     */
    private void agregarCompra(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            Compra compra = buildCompra();
            if (gestionComprasController.crearCompra(compra)) {
                listaCompras.add(compra);
                limpiarCamposCompras();
            }
        }
    }

    /**
     * Metodo para actualizar la informacion de la compra seleccionada
     */
    private void actualizarCompra(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            if (selectedCompra != null && gestionComprasController.actualizarCompra(selectedCompra.getCodigo(), buildCompra())) {
                tbl_1.refresh();
                limpiarSeleccion();
                limpiarCamposCompras();
            }
        }
    }

    /**
     * Metodo para concretar la compra seleccionada
     */
    private void concretarCompra(){
        if (esEntero(txt_codigo.getText())) {
            if (gestionComprasController.concretarCompra(Integer.parseInt(txt_codigo.getText()))) {
                tbl_1.refresh();
                limpiarSeleccion();
                limpiarCamposCompras();
            }
        }
    }

    /**
     * Metodo para eliminar una sede de la lista de compras segun el codigo proporcionado
     */
    private void eliminarCompra(){
        if (esEntero(txt_codigo.getText())) {
            if (gestionComprasController.eliminarCompra(Integer.parseInt(txt_codigo.getText()))) {
                listaCompras.remove(selectedCompra);
                limpiarCamposCompras();
                limpiarSeleccion();
            }
        }
    }

    /**
     * Metodo para obtener la lista de compras de la sede del empleado y asignarla a la lista de compras del controlador
     */
    private void obtenerCompras() {
        listaCompras.addAll(gestionComprasController.obtenerListaCompras());
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con la informacion de las compras estan llenas
     * @return Booleano sobre si todos los campos estan llenos o no
     */
    private boolean verificarCasillasLlenas(){
        boolean decision = false;
        if (dp_fechaCompra.getValue() != null && !cb_cliente.getSelectionModel().isEmpty()){
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de las compras tienen el tipo de dato adecuado
     * @return Booleano sobre si todos los campos estan con los datos correctos o no
     */
    private boolean verificarCasillasCorrecta(){
        boolean decision = false;
        if (esEntero(txt_codigo.getText())) {
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerCompras();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaCompras);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla compras del controlador
     */
    private void initDataBinding() {
        cl_codigo.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCodigo()).asObject());
        cl_cedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getIdentificacion()));
        cl_fecha.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFechaCompra().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        cl_precio.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getTotalCompra()).asObject());
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de compras
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCompra = newSelection;
            mostrarInformacionCompra(selectedCompra);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de alquileres
     */
    private void limpiarSeleccion() {
        tbl_1.getSelectionModel().clearSelection();
        bt_6.setVisible(false);
        txt_codigo.setDisable(false);
        dp_fechaCompra.setDisable(false);
        cb_cliente.setDisable(false);
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de las compras
     */
    private void limpiarCamposCompras() {
        txt_codigo.clear();
        cb_cliente.getSelectionModel().clearSelection();
        dp_fechaCompra.setValue(null);
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
        bt_6.setVisible(false);
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert dp_fechaCompra != null : "fx:id=\"dp_fechaCompra\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert cl_precio != null : "fx:id=\"cl_precio\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert txt_codigo != null : "fx:id=\"txt_codigo\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert lb_fechaentrega != null : "fx:id=\"lb_fechaentrega\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert bt_6 != null : "fx:id=\"bt_6\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert cl_cedula != null : "fx:id=\"cl_cedula\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert cb_cliente != null : "fx:id=\"cb_cliente\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert cl_codigo != null : "fx:id=\"cl_codigo\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert lb_cliente != null : "fx:id=\"lb_cliente\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert cl_fecha != null : "fx:id=\"cl_fecha\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionCompras.fxml'.";
        assert lb_codigo != null : "fx:id=\"lb_codigo\" was not injected: check your FXML file 'gestionCompras.fxml'.";
    }
}