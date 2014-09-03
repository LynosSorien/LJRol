package control;

/**
 * Created by hell on 2/09/14.
 */
public class GameControl {
    DataControl data;

    public GameControl(DataControl data) {
        this.data = data;
    }

    public void checkTerrain(){

    }

    public void moveCharacter(){

    }

    public void changeMap(){

    }

    public void start(){
        data.readMap();
        do {
            data.refreshMap();

        }while(!endConditions());
    }

    public boolean endConditions(){
        return true;
    }


}
