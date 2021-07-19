package Cards;

import javafx.scene.image.Image;

import java.io.Serializable;

public class Card implements Serializable {
    private final String image;
    private transient Image imageView;

    public Card(String image) {
        this.image = image;
        imageView = new Image(String.valueOf(getClass().getResource(image)));
    }

    public Image getImageView() {
        return imageView;
    }

    public String getImage() {
        return image;
    }

    public void setImageCard(){
        imageView = new Image(String.valueOf(getClass().getResource(image)));
    }

    @Override
    public boolean equals(Object o) {
        return this.image.equals(((Card) o).getImage());
    }
}
