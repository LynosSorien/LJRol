package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanma on 2/09/14.
 */
public class BackPack {
    private List<Item> bag;
    private int capacity;

    public BackPack(int capacity){
        this.bag = new ArrayList<Item>();
        this.capacity = capacity;
    }

    public void addItem(Item item){
        if (this.bag.size() == this.capacity)
            for (Item i:bag){
                if (i.equals(item)) i.incrQuantity();
            }
        else
            this.bag.add(item);
    }

    public void removeItem(Item item){
        if (this.bag.size()>0)
            for (Item i:bag)
                if (i.equals(item))
                    if (i.getQuantity()>1)
                        i.dcrQuantity();
                    else    this.bag.remove(item);
    }
}
