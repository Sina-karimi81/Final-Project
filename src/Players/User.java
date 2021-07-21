package Players;

import Cards.Card;
import Towers.Tower;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The type User.
 */
public class User implements Serializable {
    private final String userName;
    private final String password;
    private int xp;
    private int level;
    private ArrayList<Card> deck;
    private ArrayList<Tower> towers;
    private ArrayList<GameHistory> gamesHistory;
    private int cop;

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param password the password
     * @param xp       the xp
     * @param level    the level
     * @param cop      the cop
     */
    public User(String userName, String password, int xp, int level,int cop) {
        this.userName = userName;
        this.password = password;
        this.xp = xp;
        this.level = level;
        this.deck = new ArrayList<>();
        this.gamesHistory = new ArrayList<>();
        this.cop = cop;
    }

    /**
     * Sets xp.
     *
     * @param xp the xp
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Sets deck.
     *
     * @param deck the deck
     */
    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    /**
     * Sets games history.
     *
     * @param gamesHistory the games history
     */
    public void setGamesHistory(ArrayList<GameHistory> gamesHistory) {
        this.gamesHistory = gamesHistory;
    }

    /**
     * Sets cop.
     *
     * @param cop the cop
     */
    public void setCop(int cop) {
        this.cop = cop;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets xp.
     *
     * @return the xp
     */
    public int getXp() {
        return xp;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets deck.
     *
     * @return the deck
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * Gets games history.
     *
     * @return the games history
     */
    public ArrayList<GameHistory> getGamesHistory() {
        return gamesHistory;
    }

    /**
     * Gets cop.
     *
     * @return the cop
     */
    public int getCop() {
        return cop;
    }
}
