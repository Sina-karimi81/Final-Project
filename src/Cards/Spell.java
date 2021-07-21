package Cards;

/**
 * The type Spell.
 */
public class Spell extends Card {
    private int lifeTime;
    private float radius;
    private int cost;

    /**
     * Instantiates a new Spell.
     *
     * @param lifeTime the life time
     * @param radius   the radius
     * @param cost     the cost
     * @param image    the image
     */
    public Spell(int lifeTime, float radius, int cost, String image) {
        super(image);
        this.lifeTime = lifeTime;
        this.radius = radius;
        this.cost = cost;
    }
}
