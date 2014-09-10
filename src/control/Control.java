package control;

/**
 * Created by hell on 2/09/14.
 */
public class Control {
    private DataControl data;
    private GameControl game;
    private CombatControl combat;

    public Control() {
        data=new DataControl();
        game=new GameControl(data);
        combat=new CombatControl();
    }

    public void startGame(){
        game.start();
    }
}
