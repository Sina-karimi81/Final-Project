package Cards;

/**
 * The type Cannon.
 */
public class Cannon extends Building {
    /**
     * Instantiates a new Cannon.
     *
     * @param image the image
     */
    public Cannon(String image) {
        super(30, 380, 5.5f, 6, Target.Ground, 60, 0.8f, image);
    }
}
