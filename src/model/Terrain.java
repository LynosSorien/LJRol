package model;

/**
 * Created by david on 02/09/14.
 */
public abstract class Terrain {
    public static enum TypeOfTerrain {GRASS,WALL,TELEPORT,AQUA,FIRE,TREE}
    private TypeOfTerrain type;

    public Terrain(TypeOfTerrain tot){
        this.type = tot;
    }
}
