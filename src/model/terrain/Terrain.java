package model.terrain;

import model.PrintableGameObject;

/**
 * Created by david on 02/09/14.
 */
public abstract class Terrain extends PrintableGameObject {
    public Terrain(String image) {
        super("TERRAIN", image);
    }
}
