package model;

/**
 * Created by david on 02/09/14.
 */
public abstract class Character {
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

    @Override
    public String toString(){
        return this.name;
    }
}
