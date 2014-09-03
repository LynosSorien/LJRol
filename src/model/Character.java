package model;

import model.evt.DamageDropsToZeroEvent;
import model.evt.DamageReceivedEvent;
import model.lt.CharacterListener;
import model.lt.LifeBarListener;

/**
 * Created by david on 02/09/14.
 */
public abstract class Character {
    protected CharacterListener listener;

    protected String name;
    protected LifeBar life;

    public Character(String name,int maxLife){
        this.name = name;
        this.life = new LifeBar(maxLife);
    }

    public Character(String name, int maxLife, int actualLife){
        this.name = name;
        this.life = new LifeBar(maxLife,actualLife);
    }

    public void addListener(CharacterListener listener) {
        this.listener = listener;
        if (listener instanceof LifeBarListener) this.life.addListener((LifeBarListener)listener);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
