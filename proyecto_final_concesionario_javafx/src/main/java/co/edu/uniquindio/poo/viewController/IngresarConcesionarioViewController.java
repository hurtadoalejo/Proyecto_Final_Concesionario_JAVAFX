package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.IngresarConcesionarioController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import co.edu.uniquindio.poo.model.Concesionario;

public class IngresarConcesionarioViewController {

    IngresarConcesionarioController ingresarConcesionarioController;

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
    private Label lb_3;

    @FXML
    private TextField txt_1;

    @FXML
    private Label lb_1;

    @FXML
    private Button bt_1;

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
     * Metodo para permitir la entrada al apartado del concesionario si se ingresa el codigo correcto
     */
    @FXML
    private void manejarCodigo(){
        if (esEntero(txt_1.getText())) {
            int codigoIntroducido = Integer.parseInt(txt_1.getText());
            if (ingresarConcesionarioController.autenticarCodigo(codigoIntroducido)) {
                app.openConcesionario();
            }
        }
    }

    /**
     * Metodo para inicializar la interfaz del menu
     */
    @FXML
    void onOpenMenu() {
        app.openMenu();
    }

    @FXML
    void initialize() {
        ingresarConcesionarioController = new IngresarConcesionarioController(App.concesionario);
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'ingresarConcesionario.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'ingresarConcesionario.fxml'.";
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'ingresarConcesionario.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'ingresarConcesionario.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'ingresarConcesionario.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'ingresarConcesionario.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'ingresarConcesionario.fxml'.";

    }
}
