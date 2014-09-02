package model;

/**
 * Created by david on 02/09/14.
 */
public class Player extends Character{
    private final int CAPACITY = 3;
    private BackPack backPack;

    public Player(String name, int maxLife){
        super(name,maxLife);
        this.backPack = new BackPack(this.CAPACITY);
    }

    public Player(String name, int maxLife, int actualLife){
        super(name, maxLife,actualLife);
        this.backPack = new BackPack(this.CAPACITY);
    }

    public void addItem(Item item){
        this.backPack.addItem(item);
    }

    public void removeItem(Item item){
        this.backPack.removeItem(item);
    }
}
