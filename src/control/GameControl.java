package control;

import model.Player;
import model.terrain.WalkableDamageTerrain;
import model.terrain.WalkableTerrain;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by hell on 2/09/14.
 */
public class GameControl extends JFrame implements KeyListener{
    private final int LEFT = 37;
    private final int UP = 38;
    private final int RIGHT = 39;
    private final int DOWN = 40;

    private DataControl data;

    public GameControl(DataControl data) {
        super("LJROL");
        this.data = data;
        addKeyListener(this);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /*
        GETTERS
     */
    public DataControl getData() {
        return data;
    }

    public boolean checkTerrain(int x, int y){
        //comprovar si el terreno es walkable
        if (this.data.getMap().getElement(x,y) instanceof WalkableDamageTerrain ||
                this.data.getMap().getElement(x,y) instanceof WalkableTerrain)
            return true;
        else    return false;
    }

    public void moveCharacter(int movement){
        Player p = data.getPlayer();

        switch(movement) {
            case 37:
                System.out.println("left");
                //p.getMoveLeft();
                break;
            case 38:
                System.out.println("up");
                //p,getMoveUp();
                break;
            case 39:
                System.out.println("right");
                //p,getMoveRight();
                break;
            case 40:
                System.out.println("down");
                //p.getMoveDown();
                break;
            default:
                break;
        }
        //getCharacter();
        /*this.data.getObjectMap();
        if (checkTerrain(x,y)){
            //actualizar mov del character
        }*/

    }

    public void action(){

    }

    public void useItem(int position){
        //this.data.getPlayer().useItem(position - 1);

        //accede a la posicion de la lista y gasta/usa el objeto
        //lo elimina si es unico
    }

    public void changeMap(DataControl data){
        //Dimension d = this.data.getPlayer().getCell();
        /*if (this.data.getMap().getCell(d).getPropertyTerrain.getName == "Teleport"){
            //buscar a donde envia y ponerlo en readMap
            data.readMap("src/dommyMap2");
        }*/

        //comprueva si hay un teleport
        //y cambia de mapa
    }

    public void start(){
        data.setPlayer();
        data.readMap("src/dommyMap");
        do {
            //data.refreshMap();
            //comprobar posibilidades personaje, si combate, etc
        }while(!endConditions());
    }

    public boolean endConditions(){
        return false;
    }

    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == this.LEFT){
            this.moveCharacter(e.getKeyCode());
        }
        if(e.getKeyCode() == this.UP){
            this.moveCharacter(e.getKeyCode());
        }
        if(e.getKeyCode() == this.RIGHT){
            this.moveCharacter(e.getKeyCode());
        }
        if(e.getKeyCode() == this.DOWN){
            this.moveCharacter(e.getKeyCode());
        }
        if(e.getKeyChar() == '0'){//0
            this.action();//action
        }
        if(e.getKeyChar() == '1'){//1
            this.useItem((int)e.getKeyChar());//useitem position 1
        }
        if(e.getKeyChar() == '2'){//2
            this.useItem((int)e.getKeyChar());//useitem position 2
        }
        if(e.getKeyChar() == '3'){//3
            this.useItem((int)e.getKeyChar());//useitem position 3
        }
        //this.getData().refreshMap();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
