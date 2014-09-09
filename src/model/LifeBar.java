package model;

import model.evt.DamageDropsToZeroEvent;
import model.evt.DamageReceivedEvent;
import model.lt.LifeBarListener;
import model.utils.InvokableThread;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by juanma on 2/09/14.
 */
public class LifeBar {

    private List<LifeBarListener> listeners;

    private int maxHealth;
    private int actualHealth;

    public LifeBar(int max){
        this.listeners = new LinkedList<LifeBarListener>();
        this.maxHealth = max;
        this.actualHealth = max;
    }

    public LifeBar(int max, int actual){
        this(max);
        this.actualHealth = actual;
    }

    public void addListener(LifeBarListener listener) {
        this.listeners.add(listener);
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getActualHealth(){
        return this.actualHealth;
    }

    protected void setActualHealth(int actualHealth) {
        this.actualHealth = actualHealth;
        if (this.actualHealth>this.maxHealth) this.actualHealth = this.maxHealth;
        if (this.actualHealth < 0) this.actualHealth = 0;
    }

    public void damageLife(int value) {
        try {
            fireOnDamageReceived(value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        setActualHealth(actualHealth-value);
        if (this.actualHealth == 0) {
            try {
                fireOnLifeBarDropsToZero();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void fireOnDamageReceived(int value) throws NoSuchMethodException {
        for (LifeBarListener listener : this.listeners)
            new InvokableThread<LifeBarListener>(
                    listener.getClass().getMethod("onDamageReceived",DamageReceivedEvent.class),
                    listener,
                    new DamageReceivedEvent(this, value)
            ).start();
    }

    public synchronized void fireOnLifeBarDropsToZero() throws NoSuchMethodException {
        for (LifeBarListener listener : this.listeners)
            new InvokableThread(
                    listener.getClass().getMethod("onLifeBarDropsToZero",DamageDropsToZeroEvent.class),
                    new DamageDropsToZeroEvent(this)
            ).start();
    }

    /*public void damageLife(final int value){
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

    }*/

    public void restoreLife(int value){
        this.actualHealth += value;
        if (this.actualHealth>this.maxHealth)this.actualHealth=maxHealth;
    }
}
