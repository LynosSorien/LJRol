package model;

/**
 * Created by juanma on 2/09/14.
 */
public class Item extends GameObject implements Comparable<Item>{
    private int quantity;

    /**
     * Constructor of item that set the minimum quantity of a new item.
     */
    public Item(String name){
        super(name);
        this.quantity = 1;
    }

    /**
     *
     * @param quantity sets the quantity of item
     */
    public Item(String name,int quantity){
        super(name);
        this.quantity = quantity;
    }

    public void incrQuantity(){
        this.quantity++;
    }

    public void dcrQuantity(){
        this.quantity--;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

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
