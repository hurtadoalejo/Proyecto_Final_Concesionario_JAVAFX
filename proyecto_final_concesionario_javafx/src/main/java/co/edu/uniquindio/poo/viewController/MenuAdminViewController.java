package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.MenuAdminController;
import co.edu.uniquindio.poo.model.Administrador;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MenuAdminViewController {

    MenuAdminController menuAdminController;

    @FXML
    private App app;

    @FXML
    private Administrador administrador;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane pane_1;

    @FXML
    private Button bt_3;

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
     * Metodo para establecer el administrador para este controlador
     * @param administrador Administrador a establecer
     */
    @SuppressWarnings("exports")
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Metodo para inicializar el menuAdminController con el administrador administrado
     * @param administrador Administrador administrado
     */
    @SuppressWarnings("exports")
    public void inicializarAdministrador(Administrador administrador) {
        menuAdminController = new MenuAdminController(administrador, App.concesionario);
    }

    /**
     * Metodo para inicializar la interfaz de gestion de reportes
     */
    @FXML
    void onOpenGestionReportes() {
        app.openGestionReportes(administrador);
    }

    /**
     * Metodo para inicializar la interfaz del menu principal
     */
    @FXML
    void onOpenMenu() {
        menuAdminController.cerrarSesion();
        app.openMenu();
    }

    /**
     * Metodo para inicializar la interfaz de gestion empleados
     */
    @FXML
    void onOpenGestionEmpleados() {
        app.openGestionEmpleados(administrador);
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado
     */
    @FXML
    void initialize() {
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'menuAdmin.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'menuAdmin.fxml'.";

    }
}