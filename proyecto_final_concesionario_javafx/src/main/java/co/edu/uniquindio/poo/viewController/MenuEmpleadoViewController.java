package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.MenuAdminController;
import co.edu.uniquindio.poo.controller.MenuEmpleadoController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MenuEmpleadoViewController {

    MenuEmpleadoController menuEmpleadoController;

    @FXML
    private App app;

    @FXML
    private Empleado empleado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bt_31;

    @FXML
    private Pane pane_1;

    @FXML
    private Button bt_11;

    @FXML
    private Button bt_3;

    @FXML
    private Label lb_3;

    @FXML
    private Button bt_1;

    @FXML
    private Label lb_1;

    @FXML
    private Label lb_2;

    @FXML
    private Button bt_2;

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para establecer el empleado para este controlador
     * @param empleado Empleado a establecer
     */
    @SuppressWarnings("exports")
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Metodo para inicializar el menuEmpleadoController con el administrador administrado
     * @param empleado Empleado administrado
     */
    @SuppressWarnings("exports")
    public void inicializarEmpleado(Empleado empleado) {
        menuEmpleadoController = new MenuEmpleadoController(App.concesionario, empleado);
    }

    /**
     * Metodo para inicializar la interfaz de gestion de clientes
     */
    @FXML
    void onOpenGestionClientes() {
        app.openGestionClientes(empleado);
    }

    /**
     * Metodo para inicializar la interfaz del menu principal
     */
    @FXML
    void onOpenMenu() {
        menuEmpleadoController.cerrarSesion();
        app.openMenu();
    }

    /**
     * Metodo para inicializar la interfaz de gestion de vehiculos
     */
    @FXML
    void onOpenGestionVehiculos() {
        app.openGestionVehiculos(empleado);
    }

    /**
     * Metodo para inicializar la interfaz de gestion de compras
     */
    @FXML
    void onOpenGestionCompras() {
        app.openGestionCompras(empleado);
    }

    /**
     * Metodo para inicializar la interfaz de gestion de ventas
     */
    @FXML
    void onOpenGestionVentas() {
        app.openGestionVentas(empleado);
    }

    /**
     * Metodo para inicializar la interfaz de gestion de alquileres
     */
    @FXML
    void onOpenGestionAlquileres() {
        app.openGestionAlquileres(empleado);
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado
     */
    @FXML
    void initialize() {
        assert bt_31 != null : "fx:id=\"bt_31\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert bt_11 != null : "fx:id=\"bt_11\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'menuEmpleado.fxml'.";

    }
}