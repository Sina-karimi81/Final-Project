import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * The type Main.
 */
public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root , 600 , 475));
        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            event.consume();
            exit(primaryStage);
        });
    }

    /**
     * Exit.
     *
     * @param stage the stage
     */
    public void exit(Stage stage)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit the game!");
        alert.setContentText("Are Sure You Want To Exit?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            stage.close();
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
