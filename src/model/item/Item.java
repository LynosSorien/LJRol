package model.item;

import model.GameObject;
import model.PrintableGameObject;

/**
 * Created by david on 09/09/14.
 */
public class Item extends PrintableGameObject implements Comparable<Item>{
    private double weight;
    /**
     * Constructor of item that set the minimum quantity of a new item.
     *
     * @param name
     */
    public Item(String name, String image){
        super(name, image);
        this.weight = 0;
    }

    public Item(String name, String image, double weight) {
        this(name, image);
        this.weight = weight;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public java.lang.Double getWeight() {return weight;}
    public void setWeight(long weight){this.weight = weight;}

    @Override
    public int compareTo(Item o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(! (o instanceof Item)) return false;
        return name.equals(((Item)o).getName());
    }
}
