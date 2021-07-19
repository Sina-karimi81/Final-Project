package Players;

import Cards.Card;
import Towers.Tower;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private final String userName;
    private final String password;
    private int xp;
    private int level;
    private ArrayList<Card> deck;
    private ArrayList<Tower> towers;
    private ArrayList<GameHistory> gamesHistory;
    private int cop;

    public User(String userName, String password, int xp, int level,int cop) {
        this.userName = userName;
        this.password = password;
        this.xp = xp;
        this.level = level;
        this.deck = new ArrayList<>();
        this.gamesHistory = new ArrayList<>();
        this.cop = cop;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void setGamesHistory(ArrayList<GameHistory> gamesHistory) {
        this.gamesHistory = gamesHistory;
    }

    public void setCop(int cop) {
        this.cop = cop;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<GameHistory> getGamesHistory() {
        return gamesHistory;
    }

    public int getCop() {
        return cop;
    }
}
