package Cards;

import javafx.scene.image.Image;

import java.io.Serializable;

public class Building extends Card {
    private int lifeTime;
    private int hp;
    private float range;
    private int cost;
    private Target target;
    private int damage;
    private float hitSpeed;

    public Building(int lifeTime, int hp, float range, int cost, Target target, int damage, float hitSpeed, String image) {
        super(image);
        this.lifeTime = lifeTime;
        this.hp = hp;
        this.range = range;
        this.cost = cost;
        this.target = target;
        this.damage = damage;
        this.hitSpeed = hitSpeed;
    }
}
