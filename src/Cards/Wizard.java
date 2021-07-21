package Cards;

/**
 * The type Wizard.
 */
public class Wizard extends Trooper {
    /**
     * Instantiates a new Wizard.
     *
     * @param image the image
     */
    public Wizard(String image) {
        super(340, 130, 1.7f, Speed.Medium, Target.GroundAndAir, 3, 1, 5, 5, true, image);
    }
}
