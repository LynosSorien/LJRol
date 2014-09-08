package model;

/**
 * Created by juanma on 4/09/14.
 */
public abstract class GameObject extends Object {
    protected String name;

    public GameObject(String name){
        this.name = name;
    }
}
