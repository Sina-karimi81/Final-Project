package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import Players.User;

public class LoginController
{
    @FXML
    private TextField userText;
    @FXML
    private PasswordField passText;
    @FXML
    private Hyperlink hyperlink;
    @FXML
    User p;
    void Login(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) userText.getScene().getWindow();
        if(userText.getText().equals(p.getUser()) && passText.getText().equals(p.getPass()))
        {
            Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
            primaryStage.setTitle("MainMenu");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
    }

    @FXML
    void SignUp(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) userText.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/SignUp.fxml"));
        primaryStage.setTitle("SignUp");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
