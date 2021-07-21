package Cards;

/**
 * The type Pekka.
 */
public class Pekka extends Trooper {

    /**
     * Instantiates a new Pekka.
     *
     * @param image the image
     */
    public Pekka(String image) {
        super(600, 325, 1.8f, Speed.Fast, Target.Ground, 0, 1, 4, 1, true, image);
    }
}
