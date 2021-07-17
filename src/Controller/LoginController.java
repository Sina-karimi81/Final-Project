package Controller;

import GameControl.ShareData;
import Players.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoginController {
    @FXML
    private TextField userText;
    @FXML
    private PasswordField passText;
    @FXML
    private Label error;

    @FXML
    void Login() {
        try (FileInputStream f = new FileInputStream("Save.txt")){
            while (f.available() != 0){
                ObjectInputStream objectInputStream = new ObjectInputStream(f);
                User user = (User) objectInputStream.readObject();
                if (user.getUserName().equals(userText.getText()) && user.getPassword().equals(passText.getText())){
                    ShareData.setPlayer(user);
                    Stage primaryStage = (Stage) userText.getScene().getWindow();
                    Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
                    primaryStage.setTitle("MainMenu");
                    primaryStage.setScene(new Scene(root));
                    primaryStage.show();
                    return;
                }
            }
            error.setText("invalid username or password");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void SignUp() throws IOException {
        Stage primaryStage = (Stage) userText.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/SignUp.fxml"));
        primaryStage.setTitle("SignUp");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void exit(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit the game!");
        alert.setContentText("Are Sure You Want To Exit?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            Stage primaryStage = (Stage) userText.getScene().getWindow();
            primaryStage.close();
        }
    }
}

