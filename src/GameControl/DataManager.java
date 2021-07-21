package GameControl;

import Cards.*;
import javafx.scene.image.Image;

import java.util.ArrayList;

/**
 * The type Data manager.
 */
public class DataManager {


    /**
     * Find card card.
     *
     * @param image the image
     * @return the card
     */
    public static Card findCard(Image image){
        ArrayList<Card> cards = ShareData.getCards();
        for (Card c: cards) {
            if (c.getImageView().getUrl().equals(image.getUrl()))
                return c;
        }
        return null;
    }

    /**
     * Set deck.
     *
     * @param deck the deck
     */
    public static void setDeck(ArrayList<Card> deck){
        ShareData.getPlayer().setDeck(deck);
    }

    /**
     * Starter share data.
     */
    public static void starterShareData(){
        ArrayList<Card> cards = new ArrayList<>();
        start(cards);
    }

    /**
     * Start.
     *
     * @param cards the cards
     */
    static void start(ArrayList<Card> cards) {
        cards.add(new Giant("../Photos/clash-royal-giant.png"));
        cards.add(new Archer("../Photos/clash-royal-archers.png"));
        cards.add(new Dragon("../Photos/clash-royal-baby-dragon.png"));
        cards.add(new Barbarian("../Photos/clash-royal-barbarians.png"));
        cards.add(new Cannon("../Photos/clash-royal-cannon.png"));
        cards.add(new Wizard("../Photos/clash-royal-wizard.png"));
        cards.add(new Valkyrie("../Photos/clash-royal-valkyrie.png"));
        cards.add(new Pekka("../Photos/clash-royal-mini-pekka.png"));
        cards.add(new Arrow("../Photos/clash-royal-arrows.png"));
        cards.add(new FireBall("../Photos/clash-royal-fireball.png"));
        cards.add(new Rage("../Photos/clash-royal-rage.png"));
        cards.add(new Inferno("../Photos/clash-royal-inferno-tower.png"));
        ShareData.setCards(cards);
    }

    /**
     * Deck default.
     */
    public static void deckDefault(){
        ArrayList<Card> deck = new ArrayList<>();
        ArrayList<Card> cards = ShareData.getCards();
        for (int i = 0; i<=7; ++i) {
            deck.add(cards.get(i));
        }
        ShareData.getPlayer().setDeck(deck);
    }

    /**
     * Set image deck.
     */
    public static void setImageDeck(){
        ArrayList<Card> cards = ShareData.getPlayer().getDeck();
        for (Card c: cards) {
            c.setImageCard();
        }
    }
}
