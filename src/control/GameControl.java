package control;

import model.Player;

import java.awt.event.KeyEvent;

/**
 * Created by hell on 2/09/14.
 */
public class GameControl {
    public DataControl getData() {
        return data;
    }

    public void setData(DataControl data) {
        this.data = data;
    }

    DataControl data;

    public GameControl(DataControl data) {
        this.data = data;
    }

    public boolean checkTerrain(int x, int y){
        //comprovar si el terreno es walkable
        return true;
    }

    public void moveCharacter(int movement){
        Player p = data.getPlayer();

        switch(movement) {
            case 37:
                p.getMoveLeft();
                break;
            case 38:
                p,getMoveUp();
                break;
            case 39:
                p,getMoveRight();
                break;
            case 40:
                p.getMoveDown();
                break;
            default:
                break;
        }
        getCharacter();
        if (checkTerrain(x,y)){
            //actualizar mov del character
        }

    }

    public void action(){

    }

    public void useItem(int position){
        getElement(position-1);

        //accede a la posicion de la lista y gasta/usa el objeto
        //lo elimina si es unico

    }

    public void changeMap(DataControl data){

        if (getMap().getCell().getPropertyTerrain.getName == "Teleport"){
            //buscar a donde envia y ponerlo en readMap
            data.readMap("src/dommyMap2");
        }

        //comprueva si hay un teleport
        //y cambia de mapa

    }

    public void start(){
        data.readMap("src/dommyMap");
        data.getPlayer();
        do {
            data.refreshMap();

            //comprobar posibilidades personaje, si combate, etc
        }while(!endConditions());
    }

    public boolean endConditions(){
        return true;
    }


}
