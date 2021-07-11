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
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root , 600 , 500));
        primaryStage.show();
    }

    @FXML
    void SignUp(ActionEvent event)
    {
        String username = SignText.getText();
        String password = SignPass.getText();

    }

}

