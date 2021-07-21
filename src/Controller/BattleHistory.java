package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Battle history.
 */
public class BattleHistory {

    @FXML
    private Label BattleHistoryLabel1;
    @FXML
    private ListView<String> List;
    private final ObservableList<String> History = FXCollections.observableArrayList();

    /**
     * Initialize.
     */
    public void initialize()
    {
        History.add("Vs. Ali : 2-1");
        History.add("Vs. Reza : 3-2");
        History.add("Vs. Amir : 1-2");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        History.add("Vs. Sina : 0-3");
        List.setItems(History);
    }

    /**
     * Back.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void Back(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) BattleHistoryLabel1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
        primaryStage.setTitle("MainMenu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

