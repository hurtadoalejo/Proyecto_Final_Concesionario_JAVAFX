package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionReportesController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;
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

public class GestionReportesViewController {

    GestionReportesController gestionReportesController;
    private Administrador administrador;
    ObservableList<Reporte> listaReportes = FXCollections.observableArrayList();
    Reporte selectedReporte;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Reporte> tbl_1;

    @FXML
    private TableColumn<Reporte, Integer> cl_compras;

    @FXML
    private Button bt_5;

    @FXML
    private TableColumn<Reporte, Integer> cl_reporte;

    @FXML
    private Button bt_3;

    @FXML
    private Button bt_4;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private DatePicker dp_2;

    @FXML
    private TableColumn<Reporte, String> cl_empleado;

    @FXML
    private DatePicker dp_1;

    @FXML
    private Pane pane_1;

    @FXML
    private Label lb_3;

    @FXML
    private TextField txt_1;

    @FXML
    private Label lb_4;

    @FXML
    private TableColumn<Reporte, Integer> cl_ventas;

    @FXML
    private TableColumn<Reporte, Integer> cl_alquileres;

    @FXML
    private Label lb_1;

    @FXML
    private Label lb_2;

    @FXML
    private Label lb_5;

    @FXML
    private ComboBox<Empleado> cb_1;

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * 
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para establecer el administrador para este controlador
     * 
     * @param administrador Administrador a establecer
     */
    @SuppressWarnings("exports")
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Metodo para inicializar el gestionReportesController con el administrador
     * administrado, configura el ComboBox y luego inicializa el initView
     * 
     * @param administrador Administrador administrado
     */
    @SuppressWarnings("exports")
    public void inicializarController(Administrador administrador) {
        gestionReportesController = new GestionReportesController(administrador, App.concesionario);
        cb_1.getItems().addAll(administrador.getSede().getListaEmpleados());
        configurarComboBox();
        initView();
    }

    /**
     * Metodo para inicializar la interfaz del menu de administrador
     */
    @FXML
    void onOpenMenuAdmin() {
        app.openMenuAdmin(administrador);
    }

    /**
     * Metodo para inicializar la interfaz de la gestion de empleados
     */
    @FXML
    void onOpenGestionEmpleados() {
        app.openGestionEmpleados(administrador);
    }

    /**
     * Metodo para manejar el evento de limpiar seleccion
     */
    @FXML
    void onLimpiar() {
        limpiarCamposReportes();
    }

    /**
     * Metodo para manejar el evento de eliminar un reporte
     */
    @FXML
    void onEliminarReporte() {
        eliminarReporte();
    }

    /**
     * Metodo para manejar el evento de agregar un reporte
     */
    @FXML
    void onAgregarReporte() {
        agregarReporte();
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerReportes();
        tbl_1.getItems().clear();
        tbl_1.setItems(listaReportes);
        listenerSelection();
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla
     * reportes del controlador
     */
    private void initDataBinding() {
        cl_reporte.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCodigo()).asObject());
        cl_empleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmpleado().getIdentificacion()));
        cl_compras.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getComprasConcretadas()).asObject());
        cl_ventas.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getVentasConcretadas()).asObject());
        cl_alquileres.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getAlquileresConcretados()).asObject());
    }

    /**
     * Metodo para obtener la lista de reportes de la sede del administrador y
     * asignarla a la lista de reportes del controlador
     */
    private void obtenerReportes() {
        listaReportes.addAll(gestionReportesController.obtenerListaReportes());
    }

    /**
     * Metodo para mostrar la informacion del reporte
     * 
     * @param reporte Reporte a mostrar
     */
    private void mostrarInformacionReporte(Reporte reporte) {
        if (reporte != null) {
            dp_1.setValue(reporte.getFechaInicio());
            dp_1.setDisable(true);
            dp_2.setValue(reporte.getFechaFin());
            dp_2.setDisable(true);
            if (reporte.getEmpleado() != null) {
                cb_1.setValue(reporte.getEmpleado());
            }
            cb_1.setDisable(true);
            txt_1.setText(String.valueOf(reporte.getCodigo()));
            txt_1.setDisable(true);
        }
    }

    /**
     * Metodo para configurar la seleccion de un elemento en la tabla de reportes
     */
    private void listenerSelection() {
        tbl_1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedReporte = newSelection;
            mostrarInformacionReporte(selectedReporte);
        });
    }

    /**
     * Metodo para agregar un reporte a la lista de reportes de la tabla
     */
    private void agregarReporte() {
        if (verificarCasillasCorrecta()) {
            Reporte reporte = buildReporte();
            if (gestionReportesController.crearReporte(reporte)) {
                listaReportes.add(reporte);
                limpiarCamposReportes();
            }
        }
    }

    /**
     * Metodo para crear un reporte con los datos ingresados en los campos de texto
     * 
     * @return Reporte creada
     */
    private Reporte buildReporte() {
        Reporte reporte = new Reporte(Integer.parseInt(txt_1.getText()), dp_1.getValue(), dp_2.getValue(),
                cb_1.getSelectionModel().getSelectedItem());
        return reporte;
    }

    /**
     * Metodo para eliminar un reporte de la lista de reporte segun el codigo
     * proporcionado
     */
    private void eliminarReporte() {
        if (esEntero(txt_1.getText())) {
            if (gestionReportesController.eliminarReporte(Integer.parseInt(txt_1.getText()))) {
                listaReportes.remove(selectedReporte);
                limpiarCamposReportes();
            }
        }
    }

    /**
     * 
     * Metodo para verificar si el comboBox y los datePicker relacionadas con las
     * informacion de los reportes estan seleccionados
     * 
     * @return Booleano sobre si todos los campos esten seleccionados o no
     */
    private boolean verificarCasillasCorrecta() {
        boolean decision = false;
        if (dp_1.getValue() != null && dp_2.getValue() != null && cb_1.getSelectionModel().getSelectedItem() != null
                && esEntero(txt_1.getText())) {
            decision = true;
        }
        return decision;
    }

    /**
     * Metodo para limpiar los campos de texto relacionados con los reportes de la
     * sede del administrador
     */
    private void limpiarCamposReportes() {
        dp_1.setValue(null);
        dp_2.setValue(null);
        cb_1.getSelectionModel().clearSelection();
        txt_1.setDisable(false);
        txt_1.clear();
        dp_1.setDisable(false);
        dp_2.setDisable(false);
        cb_1.setDisable(false);
    }

    /**
     * Metodo para saber si un String es un dato de tipo int
     * 
     * @param texto String a verificar
     * @return Booleano sobre si el String es int o no
     */
    private boolean esEntero(String texto) {
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
     * Metodo para configurar la visualizacion del combobox, mostrando la
     * identificacion de los empleados
     */
    public void configurarComboBox() {
        cb_1.setCellFactory(param -> new ListCell<Empleado>() {
            @Override
            protected void updateItem(Empleado empleado, boolean empty) {
                super.updateItem(empleado, empty);
                if (empty || empleado == null) {
                    setText(null);
                } else {
                    setText(empleado.getIdentificacion());
                }
            }
        });

        cb_1.setButtonCell(new ListCell<Empleado>() {
            @Override
            protected void updateItem(Empleado empleado, boolean empty) {
                super.updateItem(empleado, empty);
                if (empty || empleado == null) {
                    setText(null);
                } else {
                    setText(empleado.getIdentificacion());
                }
            }
        });
    }

    @FXML
    void initialize() {
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_compras != null
                : "fx:id=\"cl_compras\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_reporte != null
                : "fx:id=\"cl_reporte\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert dp_2 != null : "fx:id=\"dp_2\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_empleado != null
                : "fx:id=\"cl_empleado\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert dp_1 != null : "fx:id=\"dp_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_4 != null : "fx:id=\"lb_4\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_ventas != null : "fx:id=\"cl_ventas\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_alquileres != null
                : "fx:id=\"cl_alquileres\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_5 != null : "fx:id=\"lb_5\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cb_1 != null : "fx:id=\"cb_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
    }
}