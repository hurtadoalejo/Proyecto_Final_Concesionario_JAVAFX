package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import co.edu.uniquindio.poo.model.Concesionario;

public class ConcesionarioViewController {

    @FXML
    private App app;

    @FXML
    private Concesionario concesionario;

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
        concesionario.cerrarSesion();
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

    /**
     * Metodo para establecer el concesionario para este controlador
     * @param concesionario Concesionario a establecer
     */
    @SuppressWarnings("exports")
    public void setConcesionario(Concesionario concesionario){
        this.concesionario = concesionario;
    }

    @FXML
    void initialize() {
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'concesionario.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'concesionario.fxml'.";

    }
}

