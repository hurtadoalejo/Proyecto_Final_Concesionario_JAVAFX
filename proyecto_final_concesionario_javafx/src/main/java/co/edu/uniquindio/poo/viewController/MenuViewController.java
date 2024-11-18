package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Administrador;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MenuViewController {

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
    private Label lbl_1;

    @FXML
    private Label lbl_2;

    @FXML
    private Button bt_4;

    @FXML
    private Button bt_1;

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
     * Metodo para cerrar el programa
     */
    @FXML
        void cerrarPrograma() {
        Platform.exit();
    }

    /**
     * Metodo para inicializar la interfaz de inicio de sesion del concesionario
     */
    @FXML
    void onOpenIngresarConcesionario() {
        app.openIngresarConcesionario();
    }

    /**
     * Metodo para inicializar la interfaz de inicio de sesion del administrador
     */
    @FXML
    void onOpenIngresarAdministrador() {
        app.openLoginAdmin();
    }

    /**
     * Metodo para inicializar la interfaz de inicio de sesion del empleado
     */
    @FXML
    void onOpenIngresarEmpleado() {
        app.openLoginEmpleado();
    }

    /**
     * Metodo para inicializar la interfaz de catalogo
     */
    @FXML
    void onOpenCatalogo() {
        app.openCatalogo();
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado
     */
    @FXML
    void initialize() {
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'menu.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'menu.fxml'.";
        assert lbl_1 != null : "fx:id=\"lbl_1\" was not injected: check your FXML file 'menu.fxml'.";
        assert lbl_2 != null : "fx:id=\"lbl_2\" was not injected: check your FXML file 'menu.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'menu.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'menu.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'menu.fxml'.";
    }
}