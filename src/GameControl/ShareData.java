package GameControl;

import Cards.Card;
import Players.Bot;
import Players.User;

import java.util.ArrayList;

/**
 * The type Share data.
 */
public class ShareData {
    private static ArrayList<Card> cards;
    private static User player;
    private static Bot bot;

    /**
     * Gets cards.
     *
     * @return the cards
     */
    public static ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Sets player.
     *
     * @param player the player
     */
    public static void setPlayer(User player) {
        ShareData.player = player;
    }

    /**
     * Gets player.
     *
     * @return the player
     */
    public static User getPlayer() {
        return player;
    }

    /**
     * Sets cards.
     *
     * @param cards the cards
     */
    public static void setCards(ArrayList<Card> cards) {
        ShareData.cards = cards;
    }

    /**
     * Sets bot.
     *
     * @param bot the bot
     */
    public static void setBot(Bot bot) {
        ShareData.bot = bot;
    }

}
