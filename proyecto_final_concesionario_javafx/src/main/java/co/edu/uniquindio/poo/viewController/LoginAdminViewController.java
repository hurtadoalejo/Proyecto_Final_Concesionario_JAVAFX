package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginAdminController;
import co.edu.uniquindio.poo.model.Administrador;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class LoginAdminViewController {

    LoginAdminController loginAdminController;

    @FXML
    private App app;

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
    private Button bt_3;

    @FXML
    private TextField txt_2;

    @FXML
    private Label lb_4;

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
     * Metodo para inicializar la interfaz del menu principal
     */
    @FXML
    void onOpenMenu() {
        app.openMenu();
    }

    /**
     * Metodo para inicializar la interfaz del login del administrador
     */
    @FXML
    void onOpenAdministrador() {
        autenticarUsuarioAdmin();
    }

    /**
     * Metodo para inicializar la interfaz de recuperar credenciales
     */
    @FXML
    void onOpenRecuperarCredenciales() {
        app.openRecuperarCredencialesAdmin();
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
     * Metodo para autenticar un administrador
     */
    private void autenticarUsuarioAdmin(){
        if (!txt_1.getText().isEmpty() && esEntero(txt_2.getText())) {
            int codigoIntroducido = Integer.parseInt(txt_2.getText());
            Administrador administrador = loginAdminController.obtenerUsuarioAdmin(txt_1.getText(), codigoIntroducido);
            if (administrador != null) {
                System.out.println("Aqui se inicializa el apartado de administrador");
            }
        }
    }

    /**
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado, ademas de asignar su debido controlador
     */
    @FXML
    void initialize() {
        loginAdminController = new LoginAdminController(App.concesionario);
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert txt_2 != null : "fx:id=\"txt_2\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert lb_4 != null : "fx:id=\"lb_4\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'loginAdmin.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'loginAdmin.fxml'.";

    }
}