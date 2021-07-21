package Cards;

/**
 * The type Valkyrie.
 */
public class Valkyrie extends Trooper {
    /**
     * Instantiates a new Valkyrie.
     *
     * @param image the image
     */
    public Valkyrie(String image) {
        super(880, 120, 1.5f, Speed.Medium, Target.Ground, 2, 1, 4, 1, true, image);
    }
}
