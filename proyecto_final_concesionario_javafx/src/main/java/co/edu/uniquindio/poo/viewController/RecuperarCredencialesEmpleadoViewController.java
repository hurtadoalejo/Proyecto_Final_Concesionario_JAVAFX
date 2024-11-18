package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RecuperarCredencialesEmpleadoController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RecuperarCredencialesEmpleadoViewController {

    RecuperarCredencialesEmpleadoController recuperarCredencialesEmpleadoController;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_1;

    @FXML
    private Label lb_3;

    @FXML
    private Label lb_4;

    @FXML
    private TextField txt_2;

    @FXML
    private Label lb_1;

    @FXML
    private Button bt_1;

    @FXML
    private Label lb_2;

    @FXML
    private Button bt_2;

    @FXML
    private Label lb_5;

    @FXML
    private TextField txt_3;

    @FXML
    private Label lb_6;

    @FXML
    private TextField txt_4;

    /**
     * Metodo para establecer la aplicacion principal para este controlador
     * @param app Aplicacion principal a establecer
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Metodo para manejar el evento de recuperar credenciales
     */
    @FXML
    void onOpenRecuperarCredenciales() {
        recuperarCredenciales();
    }

    /**
     * Metodo para inicializar la interfaz del menu de login del empleado
     */
    @FXML
    void onOpenMenuLogin() {
        app.openLoginEmpleado();
    }

    /**
     * Metodo para recuperar las credenciales de un empleado
     */
    private void recuperarCredenciales(){
        if (esEntero(txt_1.getText()) && !txt_2.getText().isEmpty() && !txt_3.getText().isEmpty() && esEntero(txt_4.getText())) {
            if (recuperarCredencialesEmpleadoController.cambiarCredencialesEmpleado(txt_1.getText(), txt_2.getText(), txt_3.getText(), Integer.parseInt(txt_4.getText()))) {
                limpiarCampos();
            }
        }
    }

    /**
     * Metodo para limpiar todos los campos de texto
     */
    private void limpiarCampos() {
        txt_1.clear();
        txt_2.clear();
        txt_3.clear();
        txt_4.clear();
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
     * Metodo para inicializar el controlador despues de que su archivo FXML haya sido cargado, ademas de asignar su debido controlador
     */
    @FXML
    void initialize() {
        recuperarCredencialesEmpleadoController = new RecuperarCredencialesEmpleadoController(App.concesionario);
        assert txt_1 != null : "fx:id=\"txt_1\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert lb_4 != null : "fx:id=\"lb_4\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert txt_2 != null : "fx:id=\"txt_2\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert lb_5 != null : "fx:id=\"lb_5\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert txt_3 != null : "fx:id=\"txt_3\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert lb_6 != null : "fx:id=\"lb_6\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";
        assert txt_4 != null : "fx:id=\"txt_4\" was not injected: check your FXML file 'recuperarCredencialesEmpleado.fxml'.";

    }
}