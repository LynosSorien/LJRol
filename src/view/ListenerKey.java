package view;

import control.GameControl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by hell on 3/09/14.
 */
public class ListenerKey implements KeyListener {
    private GameControl gcntrl;

    public ListenerKey (GameControl gcntrl){
        this.gcntrl = gcntrl;
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == 37){//left
            gcntrl.moveCharacter(keyEvent.getKeyCode());
        }
        if(keyEvent.getKeyCode() == 38){//up
            gcntrl.moveCharacter(keyEvent.getKeyCode());
        }
        if(keyEvent.getKeyCode() == 39){//right
            gcntrl.moveCharacter(keyEvent.getKeyCode());
        }
        if(keyEvent.getKeyCode() == 40){//down
            gcntrl.moveCharacter(keyEvent.getKeyCode());
        }
        if(keyEvent.getKeyChar() == '0'){//0
            gcntrl.action();//action
        }
        if(keyEvent.getKeyChar() == '1'){//1
            gcntrl.useItem((int)keyEvent.getKeyChar());//useitem position 1
        }
        if(keyEvent.getKeyChar() == '2'){//2
            gcntrl.useItem((int)keyEvent.getKeyChar());//useitem position 2
        }
        if(keyEvent.getKeyChar() == '3'){//3
            gcntrl.useItem((int)keyEvent.getKeyChar());//useitem position 3
        }
        gcntrl.getData().refreshMap();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
