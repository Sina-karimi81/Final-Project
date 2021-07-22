package Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

/**
 * The type Map controller.
 */
public class MapController implements Initializable
{
    private boolean exit = false;
    private int second = 60;
    private int minute = 2;
    private int elixir = 4;
    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private ProgressBar elixirCount;

    @FXML
    private Label countLabel;

    @FXML
    private Label timeLabel;

    /**
     * The Progress.
     */
    BigDecimal progress = new BigDecimal(String.format("%.2f" , 0.4));


    /**
     * Exit.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void exit(ActionEvent event) throws IOException {
        exit = true;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit the game!");
        alert.setContentText("Are Sure You Want To Exit?Any unsaved progress will be lost");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            Stage primaryStage = (Stage) countLabel.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        int i;
        elixirCount.setStyle("-fx-accent: purple");
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Start");
        alert.setHeaderText("You're about to Start the game!");
        alert.setContentText("Are Sure You Want To Start?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
           increaseProgress();
           timer();
        }
    }

    private void increaseProgress()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        if(exit == true)
                        {
                            this.cancel();
                            System.out.println("finish1");
                        }
                        if(progress.doubleValue() < 1)
                        {
                            progress = new BigDecimal(String.format("%.2f" , progress.doubleValue() + 0.1));
                            elixirCount.setProgress(progress.doubleValue());
                            Platform.runLater(()->countLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 10))));
                            elixir++;
                        }
                        if(elixir != 10)
                        {
                            if(progress.doubleValue() < 1)
                            {
                                progress = new BigDecimal(String.format("%.2f" , progress.doubleValue() + 0.1));
                                elixirCount.setProgress(progress.doubleValue());
                                Platform.runLater(()->countLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 10))));
                                elixir++;
                            }
                        }
                        if(minute == 0)
                        {
                           if(progress.doubleValue() < 1)
                           {
                               progress = new BigDecimal(String.format("%.2f" , progress.doubleValue() + 0.2));
                               elixirCount.setProgress(progress.doubleValue());
                               Platform.runLater(()->countLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 10))));
                               elixir += 2;
                           }
                        }
                    }
                };
                Timer t = new Timer();
                t.schedule(tt , 2000 , 2000);
                if(exit == true)
                {
                    t.cancel();
                    t.purge();
                    System.out.println("finish2");
                }
            }
        });
    }

    private void timer()
    {
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                if(exit == true)
                {
                    this.cancel();
                    System.out.println("finish3");
                }
               second--;
              if(second < 0)
              {
                  minute--;
                  second += 60;
              }
              if(second < 10)
              {
                  Platform.runLater(()-> timeLabel.setText(minute + ":0" + second));
              }
              else
              {
                  Platform.runLater(()->timeLabel.setText(minute + ":" + second));
              }
                if(minute == 0 && second == 0)
                {
                    this.cancel();
                }
            }
        };
        Timer t = new Timer();
        t.schedule(tt , 1000 , 1000);
        if((minute == 0 && second == 0) || exit ==true)
        {
            t.cancel();
            t.purge();
            System.out.println("finish4");
        }
    }

    /**
     * Handle drag detected 1.
     *
     * @param event the event
     */
    @FXML
    void handleDragDetected1(MouseEvent event)
    {
        Dragboard db = image1.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(image1.getImage());
        db.setContent(cb);
        event.consume();
    }

    /**
     * Handle drag detected 2.
     *
     * @param event the event
     */
    @FXML
    void handleDragDetected2(MouseEvent event)
    {
        Dragboard db = image2.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(image2.getImage());
        db.setContent(cb);
        event.consume();
    }

    /**
     * Handle drag detected 3.
     *
     * @param event the event
     */
    @FXML
    void handleDragDetected3(MouseEvent event)
    {
        Dragboard db = image3.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(image3.getImage());
        db.setContent(cb);
        event.consume();
    }

    /**
     * Handle drag detected 4.
     *
     * @param event the event
     */
    @FXML
    void handleDragDetected4(MouseEvent event)
    {
        Dragboard db = image4.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(image4.getImage());
        db.setContent(cb);
        event.consume();
    }
}
