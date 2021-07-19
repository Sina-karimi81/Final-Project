package Cards;

import javafx.scene.image.Image;

public class Spell extends Card {
    private int lifeTime;
    private float radius;
    private int cost;

    public Spell(int lifeTime, float radius, int cost, String image) {
        super(image);
        this.lifeTime = lifeTime;
        this.radius = radius;
        this.cost = cost;
    }
}
