package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    void ShowDeck(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) Image1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleDeck.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void showHistory(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) BattleHistoryLabel1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleDeck.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void showProfile(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) ProfileLabel1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleDeck.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void trainBots(ActionEvent event) {

    }

}
