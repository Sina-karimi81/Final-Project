package Cards;

/**
 * The type Dragon.
 */
public class Dragon extends Trooper {
    /**
     * Instantiates a new Dragon.
     *
     * @param image the image
     */
    public Dragon(String image) {
        super(800, 100, 1.8f, Speed.Fast, Target.GroundAndAir, 3, 1, 4, 3, false, image);
    }
}
