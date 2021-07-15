package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.stage.Stage;

import java.io.IOException;

public class BattleDeck {

    private ImageView imageView;
    @FXML
    private ImageView Image1;

    @FXML
    private ImageView Image2;

    @FXML
    private ImageView Image3;

    @FXML
    private ImageView Image4;

    @FXML
    private ImageView Image5;

    @FXML
    private ImageView Image6;

    @FXML
    private ImageView Image7;

    @FXML
    private ImageView Image8;

    @FXML
    private ImageView Card9;

    @FXML
    private ImageView Card10;

    @FXML
    private ImageView Card11;

    @FXML
    private ImageView Card12;


    @FXML
    void handleDragDetected9(MouseEvent event) {
        imageView = Card9;
        Dragboard db = Card9.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(Card9.getImage());
        db.setContent(cb);
        event.consume();
    }

    @FXML
    void handleDragDetected10(MouseEvent event) {
        imageView = Card10;
        Dragboard db = Card10.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(Card10.getImage());
        db.setContent(cb);
        event.consume();
    }

    @FXML
    void handleDragDetected11(MouseEvent event) {
        imageView = Card11;
        Dragboard db = Card11.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(Card11.getImage());
        db.setContent(cb);
        event.consume();
    }

    @FXML
    void handleDragDetected12(MouseEvent event) {
        imageView = Card12;
        Dragboard db = Card12.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(Card12.getImage());
        db.setContent(cb);
        event.consume();
    }

    @FXML
    void handleDragOver1(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop1(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image1.getImage());
        Image1.setImage(img);
    }

    @FXML
    void handleDragOver2(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop2(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image2.getImage());
        Image2.setImage(img);
    }

    @FXML
    void handleDragOver3(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop3(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image3.getImage());
        Image3.setImage(img);
    }

    @FXML
    void handleDragOver4(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop4(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image4.getImage());
        Image4.setImage(img);
    }

    @FXML
    void handleDragOver5(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop5(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image5.getImage());
        Image5.setImage(img);
    }

    @FXML
    void handleDragOver6(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop6(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image6.getImage());
        Image6.setImage(img);
    }

    @FXML
    void handleDragOver7(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop7(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image7.getImage());
        Image7.setImage(img);
    }

    @FXML
    void handleDragOver8(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void handleDragDrop8(DragEvent event) {
        Image img = event.getDragboard().getImage();
        imageView.setImage(Image8.getImage());
        Image8.setImage(img);
    }

    @FXML
    void Back(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) Image1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
        primaryStage.setTitle("MainMenu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
