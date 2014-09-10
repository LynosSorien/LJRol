package control;

//import model.Map;

import model.GameModel;
import model.GameUtils;
import model.Map;
import model.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

/**
 * Created by hell on 2/09/14.
 */
public class DataControl {
    private File mapReader;
    private FileReader fr;
    private BufferedReader br;
    private GameModel model;

    //private Map map objects;
    // private Maps de terrains
    //private Player p

    public DataControl() {
        mapReader = null;
        fr = null;
        br = null;
        model = new GameModel();

        //inicializar a null los maps
        // inicializar el player
    }

    public void readMap(String s) {
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            mapReader = new File(s);
            fr = new FileReader(mapReader);
            br = new BufferedReader(fr);
            GameUtils.fillTerrainMap(br, model);
            s+="_ITEMS";
            mapReader = new File(s);
            fr = new FileReader(mapReader);
            br = new BufferedReader(fr);
            GameUtils.fillObjectMap(br,model);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si va bien o lanza excepcion
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }



    public Map getMap(){
        return model.getMap();
    }

    public Map getObjectMap(){
        return model.getObjectMap();
    }

    public Player getPlayer(){
        if (model.getPlayer()==null) setPlayer();
        return model.getPlayer();
    }

    public void setPlayer(){
        model.setPlayer(new Player ("Sonic",100));
    }

    public void refreshMap() {
        System.out.println(model.getFinalMap());
    }

}