package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.viewController.ConcesionarioViewController;
import co.edu.uniquindio.poo.viewController.GestionAdministradoresViewController;
import co.edu.uniquindio.poo.viewController.GestionClienteViewController;
import co.edu.uniquindio.poo.viewController.GestionEmpleadosViewController;
import co.edu.uniquindio.poo.viewController.GestionReportesViewController;
import co.edu.uniquindio.poo.viewController.GestionSedesViewController;
import co.edu.uniquindio.poo.viewController.IngresarConcesionarioViewController;
import co.edu.uniquindio.poo.viewController.LoginAdminViewController;
import co.edu.uniquindio.poo.viewController.LoginEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.MenuAdminViewController;
import co.edu.uniquindio.poo.viewController.MenuEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.MenuViewController;
import co.edu.uniquindio.poo.viewController.PrimaryViewController;
import co.edu.uniquindio.poo.viewController.RecuperarCredencialesAdminViewController;
import co.edu.uniquindio.poo.viewController.RecuperarCredencialesEmpleadoViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    @SuppressWarnings("exports")
    public static Concesionario concesionario = new Concesionario("TU CARRO YA", 2911);

    /**
     * Metodo para inicializar la interfaz principal
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Alquiler de Vehiculos");
        openViewPrincipal();
    }

    /**
     * Metodo para inicializar la interfaz principal
     */
    private void openViewPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("primary.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            PrimaryViewController primaryViewController = loader.getController();
            primaryViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz del menu
     */
    public void openMenu() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("menu.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            MenuViewController menuViewController = loader.getController();
            menuViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de inicio de sesion del concesionario
     */
    public void openIngresarConcesionario() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ingresarConcesionario.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            IngresarConcesionarioViewController ingresarConcesionarioViewController = loader.getController();
            ingresarConcesionarioViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz del concesionario
     */
    public void openConcesionario() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("concesionario.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            ConcesionarioViewController concesionarioViewController = loader.getController();
            concesionarioViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de gestion de sedes
     */
    public void openGestionSedes() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("gestionSedes.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            GestionSedesViewController gestionSedesViewController = loader.getController();
            gestionSedesViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de gestion de administradores
     */
    public void openGestionAdministradores() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("gestionAdministradores.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            GestionAdministradoresViewController gestionAdministradoresViewController = loader.getController();
            gestionAdministradoresViewController.setApp(this);

            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de iniciar sesion del administrador
     */
    public void openLoginAdmin() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("loginAdmin.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            LoginAdminViewController loginAdminViewController = loader.getController();
            loginAdminViewController.setApp(this);

            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de recuperar credenciales del administrador
     */
    public void openRecuperarCredencialesAdmin() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("recuperarCredencialesAdmin.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            RecuperarCredencialesAdminViewController recuperarCredencialesAdminViewController = loader.getController();
            recuperarCredencialesAdminViewController.setApp(this);

            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar el menu del administrador
     */
    @SuppressWarnings("exports")
    public void openMenuAdmin(Administrador administrador) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("menuAdmin.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            MenuAdminViewController menuAdminViewController = loader.getController();
            menuAdminViewController.setApp(this);
            menuAdminViewController.setAdministrador(administrador);
            menuAdminViewController.inicializarAdministrador(administrador);
            
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de gestion de empleados
     */
    @SuppressWarnings("exports")
    public void openGestionEmpleados(Administrador administrador) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("gestionEmpleados.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            GestionEmpleadosViewController gestionEmpleadosViewController = loader.getController();
            gestionEmpleadosViewController.setApp(this);
            gestionEmpleadosViewController.setAdministrador(administrador);
            gestionEmpleadosViewController.inicializarAdministrador(administrador);
            
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de gestion de reportes
     */
    @SuppressWarnings("exports")
    public void openGestionReportes(Administrador administrador) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("gestionReportes.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            GestionReportesViewController gestionReportesViewController = loader.getController();
            gestionReportesViewController.setApp(this);
            gestionReportesViewController.setAdministrador(administrador);
            gestionReportesViewController.inicializarController(administrador);
            
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de iniciar sesion del empleado
     */
    public void openLoginEmpleado() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("loginEmpleado.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            LoginEmpleadoViewController loginEmpleadoViewController = loader.getController();
            loginEmpleadoViewController.setApp(this);

            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar la interfaz de recuperar credenciales del empleado
     */
    public void openRecuperarCredencialesEmpleado() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("recuperarCredencialesEmpleado.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            RecuperarCredencialesEmpleadoViewController recuperarCredencialesEmpleadoViewController = loader.getController();
            recuperarCredencialesEmpleadoViewController.setApp(this);

            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar el menu del empleado
     */
    @SuppressWarnings("exports")
    public void openMenuEmpleado(Empleado empleado) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("menuEmpleado.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            MenuEmpleadoViewController menuEmpleadoViewController = loader.getController();
            menuEmpleadoViewController.setApp(this);
            menuEmpleadoViewController.setEmpleado(empleado);
            menuEmpleadoViewController.inicializarEmpleado(empleado);
            
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar el menu de gestion de clientes
     */
    @SuppressWarnings("exports")
    public void openGestionClientes(Empleado empleado) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("gestionClientes.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            GestionClienteViewController gestionClienteViewController = loader.getController();
            gestionClienteViewController.setApp(this);
            gestionClienteViewController.setEmpleado(empleado);
            gestionClienteViewController.inicializarEmpleado(empleado);
            
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo para inicializar el menu de gestion de vehiculos
     */
    @SuppressWarnings("exports")
    public void openGestionVehiculos(Empleado empleado) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("gestionVehiculos.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            GestionVehiculoViewController gestionVehiculoViewController = loader.getController();
            gestionVehiculoViewController.setApp(this);
            gestionVehiculoViewController.setEmpleado(empleado);
            gestionVehiculoViewController.inicializarEmpleado(empleado);
            
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Metodo principal que inicia la aplicacion
     * @param args Argumentos de la linea de comandos que recibe el programa
     */
    public static void main(String[] args) {
        launch();
    }
}