package Cards;

import javafx.scene.image.Image;

public class Trooper extends Card {
    private int hp;
    private int damage;
    private float hitSpeed;
    private Speed speed;
    private Target target;
    private float areaSplash;
    private int count;
    private int cost;
    private float range;
    private boolean isGround;

    public Trooper(int hp, int damage, float hitSpeed, Speed speed, Target target, float areaSplash, int count, int cost, float range, boolean isGround, String image) {
        super(image);
        this.hp = hp;
        this.damage = damage;
        this.hitSpeed = hitSpeed;
        this.speed = speed;
        this.target = target;
        this.areaSplash = areaSplash;
        this.count = count;
        this.cost = cost;
        this.range = range;
        this.isGround = isGround;
    }
}
