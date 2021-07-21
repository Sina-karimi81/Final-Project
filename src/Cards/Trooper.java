package Cards;

/**
 * The type Trooper.
 */
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

    /**
     * Instantiates a new Trooper.
     *
     * @param hp         the hp
     * @param damage     the damage
     * @param hitSpeed   the hit speed
     * @param speed      the speed
     * @param target     the target
     * @param areaSplash the area splash
     * @param count      the count
     * @param cost       the cost
     * @param range      the range
     * @param isGround   the is ground
     * @param image      the image
     */
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
