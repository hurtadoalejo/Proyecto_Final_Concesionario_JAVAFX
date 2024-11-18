package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.CatalogoController;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

public class CatalogoViewController {

    CatalogoController catalogoController;
    ObservableList<Vehiculo> listaVehiculos = FXCollections.observableArrayList();

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Vehiculo> tbl_vehiculos;

    @FXML
    private TableColumn<Vehiculo, String> cl_disponibilidad;

    @FXML
    private Pane pane_1;

    @FXML
    private TableColumn<Vehiculo, String> cl_placa;

    @FXML
    private TableColumn<Vehiculo, String> cl_uso;

    @FXML
    private TableColumn<Vehiculo, String> cl_estado;

    @FXML
    private Label lbl_1;

    @FXML
    private Button bt_1;

    @FXML
    private TableColumn<Vehiculo, String> cl_ciudad;

    @FXML
    private TableColumn<Vehiculo, String> cl_direccion;

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para inicializar la interfaz del menu
     */
    @FXML
    void onOpenMenu() {
        app.openMenu();
    }

    /**
     * Metodo que inicializa la vista del controlador
     */
    private void initView() {
        initDataBinding();
        obtenerVehiculos();
        tbl_vehiculos.getItems().clear();
        tbl_vehiculos.setItems(listaVehiculos);
    }

    /**
     * Metodo para obtener la lista de vehiculos del concesionario y asignarla a la lista de vehiculos del controlador
     */
    private void obtenerVehiculos(){
        listaVehiculos.addAll(catalogoController.obtenerListaVehiculos());
    }

    /**
     * Metodo para configurar los tipos de datos de cada columna de la tabla vehiculos del controlador
     */
    private void initDataBinding() {
        cl_placa.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        cl_estado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstadoVehiculo().name()));
        cl_uso.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoUso().name()));
        cl_disponibilidad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstadoDisponibilidad().name()));
        cl_ciudad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSede().getCiudad().name()));
        cl_direccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSede().getDireccion()));
    }

    @FXML
    void initialize() {
        catalogoController = new CatalogoController(App.concesionario);
        initView();
        assert tbl_vehiculos != null : "fx:id=\"tbl_vehiculos\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert cl_disponibilidad != null : "fx:id=\"cl_disponibilidad\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert cl_placa != null : "fx:id=\"cl_placa\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert cl_uso != null : "fx:id=\"cl_uso\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert cl_estado != null : "fx:id=\"cl_estado\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert lbl_1 != null : "fx:id=\"lbl_1\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert cl_ciudad != null : "fx:id=\"cl_ciudad\" was not injected: check your FXML file 'catalogo.fxml'.";
        assert cl_direccion != null : "fx:id=\"cl_direccion\" was not injected: check your FXML file 'catalogo.fxml'.";

    }
}