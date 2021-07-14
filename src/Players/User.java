package Players;

import Cards.Card;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String userName;
    private String password;
    private int xp;
    private int level;
    private ArrayList<Card> deck;
    private ArrayList<GameHistory> gamesHistory;

    public User(String userName, String password, int xp, int level) {
        this.userName = userName;
        this.password = password;
        this.xp = xp;
        this.level = level;
        this.deck = new ArrayList<Card>();
        this.gamesHistory = new ArrayList<GameHistory>();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
