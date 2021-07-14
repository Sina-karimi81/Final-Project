package GameControl;

import Cards.Card;
import Players.Bot;
import Players.User;
import Towers.Tower;

import java.util.ArrayList;

public class ShareData {
    private static ArrayList<Card> cards;
    private static ArrayList<Tower> towers;
    private static User player;
    private static Bot bot;

    public static void setPlayer(User player) {
        ShareData.player = player;
    }
}
