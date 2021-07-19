package Controller;

import GameControl.DataManager;
import GameControl.ShareData;
import Players.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;

public class SignUpController {

    @FXML
    private TextField SignText;

    @FXML
    private PasswordField SignPass;

    @FXML
    private Label error;

    @FXML
    void Login() throws IOException {
        Stage primaryStage = (Stage) SignPass.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void SignUp() throws IOException {
        String username = SignText.getText();
        String password = SignPass.getText();
        if (password.length() >= 8) {
            try (FileInputStream fileInputStream = new FileInputStream("Save.txt")) {
                while (fileInputStream.available() != 0) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    User user = (User) objectInputStream.readObject();
                    if (user.getUserName().equals(username)) {
                        error.setText("This name already exists");
                        return;
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            User user = new User(username, password, 0, 1, 0);
            DataManager.starterShareData();
            ShareData.setPlayer(user);
            DataManager.deckDefault();
            saveToFile(user);
            Stage primaryStage = (Stage) SignPass.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
            primaryStage.setTitle("MainMenu");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } else
            error.setText("password must be more than 8 characters");
    }

    void saveToFile(User user) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Save.txt", true))) {
            outputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void exit() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit the game!");
        alert.setContentText("Are Sure You Want To Exit?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage primaryStage = (Stage) SignPass.getScene().getWindow();
            primaryStage.close();
        }
    }
}

