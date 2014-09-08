package model;

/**
 * Created by david on 02/09/14.
 */
public class Npc extends Character{

    public Npc(String name,int maxLife){
        super(name,maxLife);
    }

    public Npc(String name, int maxLife, int actualLife){
        super(name, maxLife,actualLife);
    }
}
