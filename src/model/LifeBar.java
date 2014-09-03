package model;

import model.evt.DamageDropsToZeroEvent;
import model.evt.DamageReceivedEvent;
import model.lt.LifeBarListener;

/**
 * Created by juanma on 2/09/14.
 */
public class LifeBar {

    private LifeBarListener listener;

    private int maxHealth;
    private int actualHealth;

    public LifeBar(int max){
        this.maxHealth = max;
        this.actualHealth = max;
    }

    public LifeBar(int max, int actual){
        this(max);
        this.actualHealth = actual;
    }

    public void addListener(LifeBarListener listener) {
        this.listener = listener;
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getActualHealth(){
        return this.actualHealth;
    }

    public void damageLife(final int value){
        new Thread(){
            @Override
            public void run() {
                listener.onDamageReceived(new DamageReceivedEvent(this, value));
            }
        }.start();
        this.actualHealth -= value;
        if (this.actualHealth<0)this.actualHealth=0;
        if(this.actualHealth==0) new Thread() {
            @Override
            public void run() {
                listener.onLifeBarDropsToZero(new DamageDropsToZeroEvent(this));
            }
        }.start();

    }

    public void restoreLife(int value){
        this.actualHealth += value;
        if (this.actualHealth>this.maxHealth)this.actualHealth=maxHealth;
    }
}
