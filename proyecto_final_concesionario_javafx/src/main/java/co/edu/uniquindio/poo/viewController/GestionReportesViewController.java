package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

public class GestionReportesViewController {

    GestionReportesController gestionReportesController;
    private Empleado empleado;

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
    private ComboBox<Empleado> cb_1;

    @FXML
    void onOpenMenuAdmin() {

    }

    @FXML
    void onOpenGestionEmpleados() {

    }

    @FXML
    void onLimpiar() {

    }

    @FXML
    void onEliminarReporte() {

    }

    @FXML
    void onAgregarReporte() {

    }

    @FXML
    void initialize() {
        assert tbl_1 != null : "fx:id=\"tbl_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_sedeCodigo != null : "fx:id=\"cl_sedeCodigo\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_identificacion != null : "fx:id=\"cl_identificacion\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert dp_2 != null : "fx:id=\"dp_2\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert dp_1 != null : "fx:id=\"dp_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_usuario != null : "fx:id=\"cl_usuario\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert pane_1 != null : "fx:id=\"pane_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cl_nombre != null : "fx:id=\"cl_nombre\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_3 != null : "fx:id=\"lb_3\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_4 != null : "fx:id=\"lb_4\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_1 != null : "fx:id=\"lb_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert lb_2 != null : "fx:id=\"lb_2\" was not injected: check your FXML file 'gestionReportes.fxml'.";
        assert cb_1 != null : "fx:id=\"cb_1\" was not injected: check your FXML file 'gestionReportes.fxml'.";

    }
}