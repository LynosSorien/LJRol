package model;

import utils.Vector;

/**
 * Created by david on 02/09/14.
 */
public class Map<V> {
    private V[][] __map;
    private Vector<Integer,Integer> size;

    public Map(V[][] map) {
        this.size = new Vector<Integer,Integer>(map.length,map[0].length);
        this.__map=map;
    }

    // public void addMap(V[][] map) {this.__map = map;}

    public V getElement(int index) {
        return (V)(getElement(index/size.getX(),index%size.getY()));
    }

    public V getElement(int x, int y) {
        return (V)(__map[x][y]);
    }

    public void setElement(int x, int y, V item) {
        this.__map[x][y] = item;
    }

    public void setElement(int index, V item) {
        this.setElement(index/size.getX(), index%size.getY(), item);
    }

    public int size(){
        return this.__map.length;
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
