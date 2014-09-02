package model;

/**
 * Created by juanma on 2/09/14.
 */
public class LifeBar {
    private int maxHealth;
    private int actualHealth;

    public LifeBar(int max){
        this.maxHealth = max;
        this.actualHealth = max;
    }

    public LifeBar(int max, int actual){
        this.maxHealth = max;
        this.actualHealth = actual;
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getActualHealth(){
        return this.actualHealth;
    }

    public void damageLife(int value){
        this.actualHealth -= value;
    }

    public void restoreLife(int value){
        this.actualHealth += value;
    }
}
