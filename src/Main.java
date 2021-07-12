import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;


public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root , 600 , 475));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
