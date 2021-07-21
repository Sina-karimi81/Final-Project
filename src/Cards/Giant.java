package Cards;

/**
 * The type Giant.
 */
public class Giant extends Trooper {
    /**
     * Instantiates a new Giant.
     *
     * @param image the image
     */
    public Giant(String image) {
        super(2000, 126, 1.5f, Speed.Slow, Target.Buildings, 0, 1, 5, 1, true, image);
    }
}
