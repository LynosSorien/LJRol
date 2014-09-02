package model;

import java.util.ArrayList;

/**
 * Created by juanma on 2/09/14.
 */
public class BackPack {
    private ArrayList<Item> bag;
    private int capacity;

    public BackPack(int capacity){
        this.bag = new ArrayList<Item>();
        this.capacity = capacity;
    }

    public void addItem(Item item){
        if (this.bag.size()<this.capacity)
            this.bag.add(item);
        else
            for (Item i:bag){
                if (i.equals(item)) i.incrQuantity();
            }
    }

    public void removeItem(Item item){
        if (this.bag.size()>0)
            for (Item i:bag)
                if (i.getQuantity()>1)
                    i.dcrQuantity();
                else    this.bag.remove(item);
    }
}
