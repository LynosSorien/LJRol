package control;

import java.awt.event.KeyEvent;

/**
 * Created by hell on 2/09/14.
 */
public class GameControl {
    DataControl data;

    public GameControl(DataControl data) {
        this.data = data;
    }

    public boolean checkTerrain(int x, int y){
        //comprovar si el terreno es walkable
        return true;
    }

    public void moveCharacter(int movement){
        int x = getMap().getCell().getX();
        int y = getMap().getCell().getY();
        getCharacter();
        if (checkTerrain(x,y)){
            //actualizar mov del character
        }

    }

    public void action(){

    }

    public void useItem(int position){

    }

    public void changeMap(){

    }

    public void start(){
        data.readMap();
        do {
            data.refreshMap();
            //comprobar posibilidades personaje, si combate, etc
        }while(!endConditions());
    }

    public boolean endConditions(){
        return true;
    }


}
