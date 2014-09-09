package model.item;

/**
 * Created by david on 09/09/14.
 */
public class StackableItem<I extends Item> extends Item{
    private int quantity;
    /**
     *
     * @param name
     * @param weight
     */
    public StackableItem(String name, String image, double weight) {
        super(name, image, weight);
        this.quantity = 1;
    }

    /**
     *
     * @param name
     * @param weight
     * @param quantity
     */
    public StackableItem(String name, String image, double weight, int quantity) {
        this(name,image,weight);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {this.quantity = quantity;}
    public int getQuantity(){return quantity;}

    public void icrQuantity() {quantity++;}
    public void dcrQuantity() {quantity--;}

    @Override
    public String toString() { return super.toString()+quantity;}
}
