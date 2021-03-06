package Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Main menu controller.
 */
public class MainMenuController {
    @FXML
    private Button p;

    /**
     * Show deck.
     *
     * @throws IOException the io exception
     */
    @FXML
    void ShowDeck() throws IOException {
        Stage primaryStage = (Stage) p.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleDeck.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Show history.
     *
     * @throws IOException the io exception
     */
    @FXML
    void showHistory() throws IOException {
        Stage primaryStage = (Stage) p.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/BattleHistory.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Show profile.
     *
     * @throws IOException the io exception
     */
    @FXML
    void showProfile() throws IOException {
        Stage primaryStage = (Stage) p.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/Profile.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Train bots.
     *
     * @throws IOException the io exception
     */
    @FXML
    void trainBots() throws IOException {
        Stage primaryStage = (Stage) p.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/Map.fxml"));
        primaryStage.setTitle("BattleDeck");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Exit.
     *
     * @param event the event
     */
    @FXML
    void exit(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit the game!");
        alert.setContentText("Are Sure You Want To Exit?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            Stage primaryStage = (Stage) p.getScene().getWindow();
            primaryStage.close();
        }
    }

    /**
     * Logout.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void logout(ActionEvent event) throws IOException
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Are Sure You Want To Logout?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            Stage primaryStage = (Stage) p.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
    }
}
