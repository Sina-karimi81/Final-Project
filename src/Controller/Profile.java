package Controller;

import GameControl.ShareData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Profile implements Initializable {

    @FXML
    private Label cupsLabel;

    @FXML
    private Label leagueLabel;

    @FXML
    private Label levelLabel;



    @FXML
    void back() throws IOException{
        Stage primaryStage = (Stage) levelLabel.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
        primaryStage.setTitle("MainMenu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cupsLabel.setText(String.valueOf(ShareData.getPlayer().getCop()));
        leagueLabel.setText(String.valueOf(ShareData.getPlayer().getXp()));
        levelLabel.setText(String.valueOf(ShareData.getPlayer().getLevel()));
    }
}
