import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController
{
    @FXML
    private TextField userText;
    @FXML
    private TextField passText;

    @FXML
    void Login(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        if(userText.getText().equals("admin") && passText.getText().equals("admin"))
        {
            Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            primaryStage.setTitle("MainMenu");
            primaryStage.setScene(new Scene(root , 600 , 400));
            primaryStage.show();
        }
    }

    @FXML
    void SignUp(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        primaryStage.setTitle("SignUp");
        primaryStage.setScene(new Scene(root , 600 , 500));
        primaryStage.show();
    }

}
