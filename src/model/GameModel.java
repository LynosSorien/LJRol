package model;

import model.terrain.Terrain;

/**
 * Created by juanma on 4/09/14.
 */
public class GameModel {
    private Map<GameObject> objectMap;
    private Map<Terrain> map;
    private Player player;

    public GameModel(){}

    public void setMap(Terrain[][] terrain){
        this.map = new Map(terrain);
    }

    public Map getMap(){
        return this.map;
    }

    public void setObjectMap(GameObject[][] object){
        this.objectMap = new Map(object);
    }

    public Map getObjectMap(){
        return this.objectMap;
    }

    public void setPlayer(Player p){
        this.player = p;
    }

    public Player getPlayer(){
        return this.player;
    }

    public String getFinalMap() {
        String finalMap = "";
        for (int i = 0; i < this.map.size(); i++){
            for (int j = 0; j < this.map.size(); j++) {
                if (this.objectMap.getElement(i, j) != null)
                    finalMap += this.objectMap.getElement(i, j);
                else finalMap += this.map.getElement(i, j);
            }
            finalMap += "\n";
        }
        return finalMap;
    }
}
