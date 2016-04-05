/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze.game;

import java.awt.Dimension;
import java.awt.Point;
import map.Item;
import map.Map;
import map.MapVisualizerDefault;
import map.ObstacleType;


/**
 *
 * @author Justinson
 */
public class MapFactory {
   
    public static final String MAP_NAME_LEVEL_01 = "LEVEL_01";
    
    
    
    //Item Types
    public static final String ITEM_TYPE_KEY = "KEY";
    
    
    public static Map getMapByName(String mapName){
        switch (mapName){
            default:
            case MAP_NAME_LEVEL_01:
                return getMapLevel01();
        }      
    }
    
    public static final Dimension CELL_SIZE = new Dimension(20, 20); 
        
        

    private static Map getMapLevel01() {
        Map map = new Map(null, CELL_SIZE, new Dimension(71, 38));
        
        //add all my portals, barriers and items
        
        map.addObstacleRange(new Point(10, 20), new Point(10, 30), ObstacleType.BARRIER);
        map.setPosition(new Point(10, 10));
        
        //add items
        map.addItem(new Item(new Point(5, 5), ITEM_TYPE_KEY));
        
        return map;
    }
    
    
}
