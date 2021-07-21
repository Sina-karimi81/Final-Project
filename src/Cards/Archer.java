package Cards;

/**
 * The type Archer.
 */
public class Archer extends Trooper {
    /**
     * Instantiates a new Archer.
     *
     * @param image the image
     */
    public Archer(String image) {
        super(125, 33, 1.2f, Speed.Medium, Target.GroundAndAir, 0, 2, 3, 5, true, image);
    }
}
