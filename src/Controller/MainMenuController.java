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
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleDeck.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void showHistory(ActionEvent event) {

    }

    @FXML
    void showProfile(ActionEvent event) {

    }

    @FXML
    void trainBots(ActionEvent event) {

    }

}
