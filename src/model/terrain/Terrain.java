package model.terrain;

/**
 * Created by david on 02/09/14.
 */
public abstract class Terrain {
    private String image;
    public Terrain(String image) {
        this.image = image;
    }


    @Override
    public String toString() {
        return image;
    }
}
