package model;

/**
 * Created by juanma on 2/09/14.
 */
public class Weapon extends Item {
    private int atk;

    public Weapon(int atk){
        super();
        this.atk = atk;
    }

    public Weapon(int atk, int quantity){
        super(quantity);
        this.atk = atk;
    }
}
