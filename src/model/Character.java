package model;

import model.evt.DamageDropsToZeroEvent;
import model.evt.DamageReceivedEvent;
import model.lt.CharacterListener;
import model.lt.LifeBarListener;

/**
 * Created by david on 02/09/14.
 */
public abstract class Character extends GameObject{
    protected CharacterListener listener;

    protected LifeBar life;

    public Character(String name,int maxLife){
       super(name);
        this.life = new LifeBar(maxLife);
    }

    public Character(String name, int maxLife, int actualLife){
        super(name);
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
