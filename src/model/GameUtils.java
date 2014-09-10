package model;

import model.terrain.*;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by juanma on 4/09/14.
 */
public final class GameUtils {
    private GameUtils(){}


    public static void fillTerrainMap(BufferedReader br,GameModel model) throws IOException {
        model.setMap(new Terrain[10][10]);
        GameUtils.fillMap(br,model.getMap(),"TERRAIN",model);
    }
    public static void fillObjectMap(BufferedReader br,GameModel model) throws IOException {
        model.setObjectMap(new GameObject[10][10]);
        GameUtils.fillMap(br,model.getObjectMap(),"OBJECT",model);
    }

    public static void fillMap(BufferedReader br,Map modelMap, String type, GameModel model) throws IOException {
        String line;
        Map map = modelMap;
        int row = 0;
        while ((line = br.readLine()) != null) {
            line=line.toUpperCase();
            for (int col = 0; col < line.length(); col++) {
                if (type.equals("TERRAIN")) {
                    if (line.charAt(col) == 'G' || line.charAt(col) == 'T' || line.charAt(col) == 'S') {
                        map.setElement(row, col, new WalkableTerrain("" + line.charAt(col)));
                    } else if (line.charAt(col) == 'W' || line.charAt(col) == 'A' || line.charAt(col) == 'O') {
                        map.setElement(row, col, new UnwalkableTerrain("" + line.charAt(col)));
                    } else map.setElement(row, col, new WalkableTerrain("G"));
                }else if (type.equals("OBJECT")) {
                    if (line.charAt(col) == 'L')//life potion
                        map.setElement(row, col, new UsableItem(UsableItem.ItemProperty.HEALTHY, 20));
                    else if (line.charAt(col) == 'W')//weapon
                        map.setElement(row, col, new Weapon(60));
                    else if (line.charAt(col) == 'P')//player
                        map.setElement(row, col, model.getPlayer());
                    else if (line.charAt(col) == 'N')//npc
                        map.setElement(row, col, new Npc("NPC", 100));
                }
            }
            row++;
        }
    }
}
