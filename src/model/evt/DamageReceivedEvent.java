package model.evt;

import model.LifeBar;

/**
 * Created by david on 03/09/14.
 */
public class DamageReceivedEvent extends GameEvent{
    private int damage;
    private int currentHealth;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DamageReceivedEvent(Object source, int damage) {
        super(source);
        this.damage =damage;
        this.currentHealth = currentHealth;
    }

    public int getDamage() {return damage;}
    public int getCurrentHealth(){return currentHealth;}
}
