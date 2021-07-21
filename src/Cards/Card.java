package Cards;

import javafx.scene.image.Image;

import java.io.Serializable;

/**
 * The type Card.
 */
public class Card implements Serializable {
    private final String image;
    private transient Image imageView;

    /**
     * Instantiates a new Card.
     *
     * @param image the image
     */
    public Card(String image) {
        this.image = image;
        imageView = new Image(String.valueOf(getClass().getResource(image)));
    }

    /**
     * Gets image view.
     *
     * @return the image view
     */
    public Image getImageView() {
        return imageView;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Set image card.
     */
    public void setImageCard(){
        imageView = new Image(String.valueOf(getClass().getResource(image)));
    }

    @Override
    public boolean equals(Object o) {
        return this.image.equals(((Card) o).getImage());
    }
}
