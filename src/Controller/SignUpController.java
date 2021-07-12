package Controller;

import Players.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {

    @FXML
    private TextField SignText;

    @FXML
    private TextField SignPass;

    @FXML
    void Login(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) SignPass.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void SignUp(ActionEvent event)
    {
        String username = SignText.getText();
        String password = SignPass.getText();
        User player  = new User(username , password);
    }

}

