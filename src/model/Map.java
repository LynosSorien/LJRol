package model;

import java.util.List;

/**
 * Created by david on 02/09/14.
 */
public abstract class Map<X extends Integer,
        Y extends Integer,
        V extends Terrain> {
    X __x;
    Y __y;
    V __value;

    public Map(X x, Y y, V value) {

    }
}
