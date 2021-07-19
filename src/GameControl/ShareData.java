package GameControl;

import Cards.Card;
import Players.Bot;
import Players.User;

import java.util.ArrayList;

public class ShareData {
    private static ArrayList<Card> cards;
    private static User player;
    private static Bot bot;

    public static ArrayList<Card> getCards() {
        return cards;
    }

    public static void setPlayer(User player) {
        ShareData.player = player;
    }

    public static User getPlayer() {
        return player;
    }

    public static void setCards(ArrayList<Card> cards) {
        ShareData.cards = cards;
    }

    public static void setBot(Bot bot) {
        ShareData.bot = bot;
    }

}
