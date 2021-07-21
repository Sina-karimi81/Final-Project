package Cards;

/**
 * The type Barbarian.
 */
public class Barbarian extends Trooper {
    /**
     * Instantiates a new Barbarian.
     *
     * @param image the image
     */
    public Barbarian(String image) {
        super(300, 75, 1.5f, Speed.Medium, Target.Ground, 0, 4, 5, 1, true, image);
    }
}
