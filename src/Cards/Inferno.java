package Cards;

/**
 * The type Inferno.
 */
public class Inferno extends Building {
    /**
     * Instantiates a new Inferno.
     *
     * @param image the image
     */
    public Inferno(String image) {
        super(40, 800, 6, 5, Target.GroundAndAir, 20, 0.4f, image);
    }
}
