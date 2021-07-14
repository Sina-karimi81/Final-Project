package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private Button p;

    @FXML
    void ShowDeck() throws IOException {
        Stage primaryStage = (Stage) p.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleDeck.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void showHistory() throws IOException {
        Stage primaryStage = (Stage) p.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleHistory.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void showProfile() throws IOException {
        Stage primaryStage = (Stage) p.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/Profile.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void trainBots() {

    }

}
