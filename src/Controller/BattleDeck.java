package Controller;

import Cards.Card;
import GameControl.DataManager;
import GameControl.ShareData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BattleDeck implements Initializable{

    private ArrayList<ImageView> imageViews;

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
    void handleDragDrop1() {
        Image img = imageView.getImage();
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
    void handleDragDrop2() {
        Image img = imageView.getImage();
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
    void handleDragDrop3() {
        Image img = imageView.getImage();
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
    void handleDragDrop4() {
        Image img = imageView.getImage();
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
    void handleDragDrop5() {
        Image img = imageView.getImage();
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
    void handleDragDrop6() {
        Image img = imageView.getImage();
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
    void handleDragDrop7() {
        Image img = imageView.getImage();
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
    void handleDragDrop8() {
        Image img = imageView.getImage();
        imageView.setImage(Image8.getImage());
        Image8.setImage(img);
    }

    @FXML
    void Back() throws IOException {
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(DataManager.findCard(Image1.getImage()));
        deck.add(DataManager.findCard(Image2.getImage()));
        deck.add(DataManager.findCard(Image3.getImage()));
        deck.add(DataManager.findCard(Image4.getImage()));
        deck.add(DataManager.findCard(Image5.getImage()));
        deck.add(DataManager.findCard(Image6.getImage()));
        deck.add(DataManager.findCard(Image7.getImage()));
        deck.add(DataManager.findCard(Image8.getImage()));
        DataManager.setDeck(deck);

        Stage primaryStage = (Stage) Image1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
        primaryStage.setTitle("MainMenu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<Card> cards = ShareData.getPlayer().getDeck();
        ArrayList<Card> cards1 = (ArrayList<Card>) ShareData.getCards().clone();
        Image1.setImage(cards.get(0).getImageView());
        Image2.setImage(cards.get(1).getImageView());
        Image3.setImage(cards.get(2).getImageView());
        Image4.setImage(cards.get(3).getImageView());
        Image5.setImage(cards.get(4).getImageView());
        Image6.setImage(cards.get(5).getImageView());
        Image7.setImage(cards.get(6).getImageView());
        Image8.setImage(cards.get(7).getImageView());
        for (int i=0;i<=7;++i)
             cards1.remove(cards.get(i));
        Card9.setImage(cards1.get(0).getImageView());
        Card10.setImage(cards1.get(1).getImageView());
        Card11.setImage(cards1.get(2).getImageView());
        Card12.setImage(cards1.get(3).getImageView());
    }
}
