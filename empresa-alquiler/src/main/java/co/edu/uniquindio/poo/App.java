package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.viewController.bienvenido;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;

public class App extends Application{

    private Stage primaryStage;

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage)  {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Bienvenidos");
        openViewPrincipal();
    }


    private void openViewPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("BotonBienvenido.fxml"));
            AnchorPane rootLayout = loader.load();
            bienvenido bienvenidoController = loader.getController();
            bienvenidoController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
