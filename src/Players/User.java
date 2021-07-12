package Players;

import Cards.Card;

import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private int xp;
    private int level;
    private ArrayList<Card> deck;
    private ArrayList<GameHistory> gamesHistory;

    public User(String name , String pass)
    {
        userName = name;
        password = pass;
    }

    public String getUser()
    {
        return userName;
    }

    public String getPass()
    {
        return password;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
