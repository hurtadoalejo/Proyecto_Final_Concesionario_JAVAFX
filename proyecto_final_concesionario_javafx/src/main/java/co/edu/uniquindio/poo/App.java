package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewController.MenuViewController;
import co.edu.uniquindio.poo.viewController.PrimaryViewController;

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
     * Metodo principal que inicia la aplicacion
     * @param args Argumentos de la linea de comandos que recibe el programa
     */
    public static void main(String[] args) {
        launch();
    }
}