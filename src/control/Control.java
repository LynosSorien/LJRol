package control;

import view.ListenerKey;

/**
 * Created by hell on 2/09/14.
 */
public class Control {
    private DataControl data;
    private GameControl game;
    private CombatControl combat;
    private ListenerKey key;

    public Control() {
        data=new DataControl();
        game=new GameControl(data);
        combat=new CombatControl();
        key=new ListenerKey(game);
    }

    public void startGame(){
        game.start();
    }
}
