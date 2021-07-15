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
    private ImageView Card1;

    @FXML
    private ImageView Card2;

    @FXML
    private ImageView Card3;

    @FXML
    private ImageView Card4;

    @FXML
    private ImageView Card5;

    @FXML
    private ImageView Card6;

    @FXML
    private ImageView Card7;

    @FXML
    private ImageView Card8;

    @FXML
    private ImageView Card9;

    @FXML
    private ImageView Card10;

    @FXML
    private ImageView Card11;

    @FXML
    private ImageView Card12;

   @FXML
    void handleDragDetected1(MouseEvent event)
    {
        Dragboard db = Card1.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card1.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected2(MouseEvent event)
    {
        Dragboard db = Card2.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card2.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected3(MouseEvent event)
    {
        Dragboard db = Card3.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card3.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected4(MouseEvent event)
    {
        Dragboard db = Card4.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card4.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected5(MouseEvent event)
    {
        Dragboard db = Card5.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card5.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected6(MouseEvent event)
    {
        Dragboard db = Card6.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card6.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected7(MouseEvent event)
    {
        Dragboard db = Card7.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card7.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected8(MouseEvent event)
    {
        Dragboard db = Card8.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card8.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected9(MouseEvent event)
    {
        Dragboard db = Card9.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card9.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected10(MouseEvent event)
    {
        Dragboard db = Card10.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card10.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected11(MouseEvent event)
    {
        Dragboard db = Card11.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card11.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragDetected12(MouseEvent event)
    {
        Dragboard db = Card12.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb =  new ClipboardContent();
        cb.putImage(Card12.getImage());
        db.setContent(cb);
        event.consume();
    }
    @FXML
    void handleDragOver1(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop1(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
        Image1.setImage(img);
    }
    @FXML
    void handleDragOver2(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop2(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
        Image2.setImage(img);
    }
    @FXML
    void handleDragOver3(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop3(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
        Image3.setImage(img);
    }
    @FXML
    void handleDragOver4(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop4(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
        Image4.setImage(img);
    }
    @FXML
    void handleDragOver5(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop5(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
        Image5.setImage(img);
    }
    @FXML
    void handleDragOver6(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop6(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
        Image6.setImage(img);
    }
    @FXML
    void handleDragOver7(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop7(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
        Image7.setImage(img);
    }
    @FXML
    void handleDragOver8(DragEvent event)
    {
        if(event.getDragboard().hasImage())
        {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    void handleDragDrop8(DragEvent event)
    {
        Image img = event.getDragboard().getImage();
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
