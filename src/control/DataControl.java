package control;

//import model.Map;

import java.io.*;

/**
 * Created by hell on 2/09/14.
 */
public class DataControl {
    private File mapReader;
    private FileReader fr;
    private BufferedReader br;
    //private Map map;

    public void dataControl() {
        mapReader=null;
        fr=null;
        br=null;
    }

    public void readMap(){
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            mapReader = new File ("src/dommyMap");
            fr = new FileReader (mapReader);
            br = new BufferedReader(fr);//pasar a juanma
            // Lectura del fichero (comentar)
            String line;
            while((line=br.readLine())!=null)
                System.out.println(line);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si va bien o lanza excepcion
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    public void refreshMap(){
        //System.out.println("Mapa Imprimido");
        //map.getMap();
        //buscar en el mapa la celda para crear el player
        //sino buscar la celda START

    }

}
