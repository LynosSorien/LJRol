package model;

/**
 * Created by juanma on 2/09/14.
 */
public class UsableItem extends Item {
    public static enum ItemProperty {HEALTHY,BUFFER} // type of buffer haste??
    private ItemProperty property;
    private int power;

    public UsableItem (ItemProperty prop, int value){
        super();
        this.property = prop;
        this.power = value;
    }

    public UsableItem(ItemProperty prop, int value, int quantity){
        super(quantity);
        this.property = prop;
        this.power = value;
    }
}
