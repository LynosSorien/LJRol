package model;

/**
 * Created by juanma on 2/09/14.
 */
public class Weapon extends Item {
    private int atk;

    public Weapon(int atk){
        super("sword");
        this.atk = atk;
    }

    public Weapon(int atk, int quantity){
        super("sword",quantity);
        this.atk = atk;
    }
}
