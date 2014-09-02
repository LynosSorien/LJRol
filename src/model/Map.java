package model;

import utils.PrintableArrayList;

import java.util.List;

/**
 * Created by david on 02/09/14.
 */
public abstract class Map<V extends Terrain> {
    private static final int X = 20;
    private static final int Y = 20;
    List<List<V>> __values;

    public Map() {
        __values = new PrintableArrayList<V>();
        for (int y = 0; y<Y;y++)
            __values.add(new PrintableArrayList<V>());
    }

    public V getElement(int index) {
        return getElement(index/X,index%Y);
    }

    public V getElement(int x, int y) {
        return __values.get(x).get(y);
    }
    @Override
    public String toString() {
        String print=new String("");
        for (List pal : __values)
            print+=((PrintableArrayList)pal).toString()+"\n";
        return print;
    }
}
