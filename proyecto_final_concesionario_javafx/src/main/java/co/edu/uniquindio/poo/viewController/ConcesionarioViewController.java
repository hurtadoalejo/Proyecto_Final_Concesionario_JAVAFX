package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ConcesionarioController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ConcesionarioViewController {

    ConcesionarioController concesionarioController;

    @FXML
    private App app;

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
     * Metodo para inicializar la interfaz del menu
     */
    @FXML
    void onOpenMenu() {
        concesionarioController.cerrarSesion();
        app.openMenu();
    }

    /**
     * Metodo para inicializar la interfaz de gestion de sedes
     */
    @FXML
    void onOpenGestionSedes() {
        app.openGestionSedes();
    }

    /**
     * Metodo para inicializar la interfaz de gestion de administradores
     */
    @FXML
    void onOpenGestionAdministradores() {
        app.openGestionAdministradores();
    }

    @FXML
    void initialize() {
        concesionarioController = new ConcesionarioController(App.concesionario);
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'concesionario.fxml'.";

    }
}

