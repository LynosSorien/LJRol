package model;

import model.terrain.Terrain;
import utils.Vector;

/**
 * Created by david on 02/09/14.
 */
public abstract class Map {
    private Terrain[][] __map;
    private Vector<Integer,Integer> size;

    public Map(int x, int y) {
        this.size = new Vector<Integer,Integer>(x,y);
        this.__map = new Terrain[x][y];
    }

    public <V extends Terrain> V getElement(int index) {
        return (V)(getElement(index/size.getX(),index%size.getY()));
    }

    public <V extends Terrain> V getElement(int x, int y) {
        return (V)(__map[x][y]);
    }

    public <V extends Terrain> void setElement(int x, int y, V terrain) {
        this.__map[x][y] = terrain;
    }

    public <V extends Terrain> void setElement(int index, V terrain) {
        this.setElement(index/size.getX(), index%size.getY(), terrain);
    }

    @Override
    public String toString() {
        String print=new String("");
        for (int i = 0; i<size.getX();i++) {
            for (int j = 0; j < size.getY(); j++)
                print += __map[i][j] + " ";
            print+="\n";
        }
        return print;
    }
}
