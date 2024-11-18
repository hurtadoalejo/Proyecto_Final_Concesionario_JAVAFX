package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionAlquileresController;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Estado_alquiler;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Cliente;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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

public class GestionAlquileresViewController {

    GestionAlquileresController gestionAlquileresController;
    private Empleado empleado;
    ObservableList<Alquiler> listaAlquileres = FXCollections.observableArrayList();
    Alquiler selectedAlquiler;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Alquiler> tbl_1;

    @FXML
    private Label lb_fechaventa;

    @FXML
    private Label lb_vehiculo;

    @FXML
    private TableColumn<Alquiler, String> cl_placa;

    @FXML
    private TableColumn<Alquiler, Double> cl_precio;

    @FXML
    private TextField txt_codigo;

    @FXML
    private Label lb_fechaentrega;

    @FXML
    private Button bt_5;

    @FXML
    private ComboBox<Vehiculo> cb_vehiculo;

    @FXML
    private Button bt_3;

    @FXML
    private Button bt_4;

    @FXML
    private DatePicker dp_fechaentrega;

    @FXML
    private TableColumn<Alquiler, String> cl_cedula;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private ComboBox<Cliente> cb_cliente;

    @FXML
    private TableColumn<Alquiler, Integer> cl_codigo;

    @FXML
    private Pane pane_1;

    @FXML
    private Label lb_cliente;

    @FXML
    private Label lb_precio;

    @FXML
    private Label lb_1;

    @FXML
    private DatePicker dp_fechaventa;

    @FXML
    private TextField txt_precio;

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
        gestionAlquileresController = new GestionAlquileresController(empleado, App.concesionario);
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
        limpiarCamposAlquileres();
    }

    /**
     * Metodo para manejar el evento de actualizar un alquiler
     */
    @FXML
    void onActualizarAlquiler() {
        actualizarAlquiler();
    }

    /**
     * Metodo para manejar el evento de agregar un alquiler
     */
    @FXML
    void onAgregarAlquiler() {
        agregarAlquiler();
    }

    /**
     * Metodo para inicializar la interfaz del menu del empleado
     */
    @FXML
    void onOpenEmpleado() {
        app.openMenuEmpleado(empleado);
    }

    /**
     * Metodo para manejar el evento de eliminar un alquiler
     */
    @FXML
    void onEliminarAlquiler() {
        eliminarAlquiler();
    }

    /**
     * Metodo para manejar el evento de entregar un alquiler
     */
    @FXML
    void onEntregarAlquiler(ActionEvent event) {
        entregarAlquiler();
    }

    /**
     * Metodo para mostrar la informacion del alquiler
     * @param alquiler Alquiler a mostrar
     */
    private void mostrarInformacionAlquiler(Alquiler alquiler){
        if (!mostrarInformacionAlquilerPersonalizado(alquiler) && alquiler != null) {
            dp_fechaentrega.setDisable(false);
            txt_codigo.setDisable(true);
            dp_fechaentrega.setDisable(false);
            txt_codigo.setText(String.valueOf(alquiler.getCodigo()));
            dp_fechaventa.setValue(alquiler.getFechaAlquiler());
            txt_precio.setText(String.valueOf(alquiler.getPrecioPorDia()));  
            if (alquiler.getCliente() != null) {
                cb_cliente.getSelectionModel().select(alquiler.getCliente());
            }
            if (alquiler.getVehiculo() != null) {
                cb_vehiculo.getSelectionModel().select(alquiler.getVehiculo());
            }
        }
    }

    /**
     * Metodo para mostrar la informacion del alquiler ya pagado
     * @param alquiler Alquier a mostrar
     * @return Booleano sobre si se pudo mostrar el alquiler ya pagado o no
     */
    private boolean mostrarInformacionAlquilerPersonalizado(Alquiler alquiler){
        boolean accion = false;
        if (alquiler != null) {
            if (alquiler.getEstadoAlquiler() != null) {
                if (alquiler.getEstadoAlquiler().equals(Estado_alquiler.PAGADO)) {
                    accion = true;
                    txt_codigo.setDisable(true);
                    txt_codigo.setText(String.valueOf(alquiler.getCodigo()));
                    cb_cliente.setDisable(true);
                    cb_vehiculo.setDisable(true);
                    txt_precio.setDisable(true);
                    txt_precio.setText(String.valueOf(alquiler.getPrecioPorDia()));  
                    dp_fechaentrega.setDisable(true);
                    dp_fechaentrega.setValue(alquiler.getFechaEntregaAlquiler());
                    dp_fechaventa.setDisable(true);
                    dp_fechaventa.setValue(alquiler.getFechaAlquiler());
                    bt_1.setDisable(true);
                    bt_2.setDisable(true);
                    bt_5.setDisable(true);
                    if (alquiler.getCliente() != null) {
                        cb_cliente.getSelectionModel().select(alquiler.getCliente());
                    }
                    if (alquiler.getVehiculo() != null) {
                        cb_vehiculo.getSelectionModel().select(alquiler.getVehiculo());
                    }
                }
            }
        }
        return accion;
    }

    /**
     * Metodo para crear un alquiler con los datos ingresados en los campos de texto
     * @return Alquiler creado
     */
    private Alquiler buildAlquiler(){
        Alquiler alquiler = new Alquiler(Integer.parseInt(txt_codigo.getText()), cb_cliente.getSelectionModel().getSelectedItem(), cb_vehiculo.getSelectionModel().getSelectedItem(), empleado, dp_fechaventa.getValue(), Double.parseDouble(txt_precio.getText()), empleado.getSede());
        return alquiler;
    }

    /**
     * Metodo para agregar un alquiler a la lista de alquileres de la tabla
     */
    private void agregarAlquiler(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            Alquiler alquiler = buildAlquiler();
            if (gestionAlquileresController.crearAlquiler(alquiler)) {
                listaAlquileres.add(alquiler);
                limpiarCamposAlquileres();
            }
        }
    }

    /**
     * Metodo para actualizar la informacion del alquiler seleccionado
     */
    private void actualizarAlquiler(){
        if (verificarCasillasCorrecta() && verificarCasillasLlenas()) {
            if (selectedAlquiler != null && gestionAlquileresController.actualizarAlquiler(selectedAlquiler.getCodigo(), buildAlquiler())) {
                tbl_1.refresh();
                limpiarSeleccion();
                limpiarCamposAlquileres();
            }
        }
    }

    /**
     * Metodo para entregar el alquiler seleccionado
     */
    private void entregarAlquiler(){
        if (dp_fechaentrega != null && esEntero(txt_codigo.getText())) {
            if (gestionAlquileresController.entregarAlquiler(Integer.parseInt(txt_codigo.getText()), dp_fechaentrega.getValue())) {
                tbl_1.refresh();
                limpiarSeleccion();
                limpiarCamposAlquileres();
            }
        }
    }

    /**
     * Metodo para eliminar una sede de la lista de alquileres segun el codigo proporcionado
     */
    private void eliminarAlquiler(){
        if (esEntero(txt_codigo.getText())) {
            if (gestionAlquileresController.eliminarAlquiler(Integer.parseInt(txt_codigo.getText()))) {
                listaAlquileres.remove(selectedAlquiler);
                limpiarCamposAlquileres();
                limpiarSeleccion();
            }
        }
    }

    /**
     * Metodo para obtener la lista de alquileres de la sede del empleado y asignarla a la lista de alquileres del controlador
     */
    private void obtenerAlquileres() {
        listaAlquileres.addAll(gestionAlquileresController.obtenerListaAlquileres());
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con la informacion de los alquileres estan llenas
     * @return Booleano sobre si todos los campos estan llenos o no
     */
    private boolean verificarCasillasLlenas(){
        boolean decision = false;
        if (!txt_codigo.getText().isEmpty() && !txt_precio.getText().isEmpty() && !cb_cliente.getSelectionModel().isEmpty() && !cb_vehiculo.getSelectionModel().isEmpty()){
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo para verificar si las casillas de texto relacionadas con las informacion de los alquileres tienen el tipo de dato adecuado
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
        obtenerAlquileres();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaAlquileres);
        listenerSelection();
    }
    
    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla alquileres del controlador
     */
    private void initDataBinding() {
        cl_codigo.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCodigo()).asObject());
        cl_cedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getIdentificacion()));
        cl_placa.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getPlaca()));
        cl_precio.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getTotalPrestamo()).asObject());
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de alquileres
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedAlquiler = newSelection;
            mostrarInformacionAlquiler(selectedAlquiler);
        });
    }

    /**
     * Metodo para limpiar la seleccion de un elementos en la tabla de alquileres
     */
    private void limpiarSeleccion() {
        tbl_1.getSelectionModel().clearSelection();
        dp_fechaentrega.setDisable(true);
        bt_1.setDisable(false);
        bt_2.setDisable(false);
        bt_3.setDisable(false);
        bt_5.setDisable(false);
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con la informacion de los alquileres
     */
    private void limpiarCamposAlquileres() {
        txt_codigo.setDisable(false);
        txt_codigo.clear();
        txt_codigo.setDisable(false);
        txt_precio.clear();
        txt_precio.setDisable(false);
        cb_cliente.getSelectionModel().clearSelection();
        cb_cliente.setDisable(false);
        cb_vehiculo.getSelectionModel().clearSelection();
        cb_vehiculo.setDisable(false);
        dp_fechaventa.setValue(null);
        dp_fechaventa.setDisable(false);
        dp_fechaentrega.setValue(null);
        dp_fechaentrega.setDisable(true);
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
        dp_fechaentrega.setDisable(true);
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert lb_fechaventa != null : "fx:id=\"lb_fechaventa\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert lb_vehiculo != null : "fx:id=\"lb_vehiculo\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert cl_placa != null : "fx:id=\"cl_placa\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert cl_precio != null : "fx:id=\"cl_precio\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert txt_codigo != null : "fx:id=\"txt_codigo\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert lb_fechaentrega != null : "fx:id=\"lb_fechaentrega\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert cb_vehiculo != null : "fx:id=\"cb_vehiculo\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert dp_fechaentrega != null : "fx:id=\"dp_fechaentrega\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert cl_cedula != null : "fx:id=\"cl_cedula\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert cb_cliente != null : "fx:id=\"cb_cliente\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert cl_codigo != null : "fx:id=\"cl_codigo\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert lb_cliente != null : "fx:id=\"lb_cliente\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert lb_precio != null : "fx:id=\"lb_precio\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert dp_fechaventa != null : "fx:id=\"dp_fechaventa\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert txt_precio != null : "fx:id=\"txt_precio\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
        assert lb_codigo != null : "fx:id=\"lb_codigo\" was not injected: check your FXML file 'gestionAlquileres.fxml'.";
    }
}