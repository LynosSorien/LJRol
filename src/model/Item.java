package model;

/**
 * Created by juanma on 2/09/14.
 */
public class Item {
    private int quantity;

    /**
     * Constructor of item that set the minimum quantity of a new item.
     */
    public Item(){
        this.quantity = 1;
    }

    /**
     *
     * @param quantity sets the quantity of item
     */
    public Item(int quantity){
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
}
