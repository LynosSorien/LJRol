package model;

/**
 * Created by david on 09/09/14.
 */
public class PrintableGameObject extends GameObject{
    private String image;
    public PrintableGameObject(String name, String image) {
        super(name);
    }

    public String getImage() {return image;}

    @Override
    public String toString() {return image;}
}
