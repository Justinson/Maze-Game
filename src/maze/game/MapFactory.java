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
import map.ObstacleType;

/**
 *
 * @author Justinson
 */
public class MapFactory {

    public static final String MAP_NAME_LEVEL_01 = "LEVEL_01";

    //Item Types
    public static final String ITEM_TYPE_KEY = "KEY";

    public static Map getMapByName(String mapName) {
        switch (mapName) {
            default:
            case MAP_NAME_LEVEL_01:
                return getMapLevel01();
        }
    }

    public static final Dimension CELL_SIZE = new Dimension(20, 20);

    private static Map getMapLevel01() {
        Map map = new Map(null, CELL_SIZE, new Dimension(35, 67));

        //add all my portals, barriers and items
        map.addObstacleRange(new Point(0, 0), new Point(66, 0), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 0), new Point(0, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 18), new Point(0, 34), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 34), new Point(66, 34), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(66, 0), new Point(66, 31), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(1, 1), new Point(15, 1), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 2), new Point(15, 2), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 3), new Point(15, 3), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 4), new Point(15, 4), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 5), new Point(15, 5), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 6), new Point(15, 6), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 7), new Point(15, 7), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 8), new Point(15, 8), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 9), new Point(15, 9), ObstacleType.BARRIER);
        
        map.addObstacleRange(new Point(3, 4), new Point(9, 4), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(3, 5), new Point(9, 5), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(3, 6), new Point(9, 6), ObstacleType.BARRIER);
        
        map.addObstacleRange(new Point(7, 7), new Point(9, 7), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(7, 8), new Point(9, 8), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(3, 9), new Point(9, 9), ObstacleType.BARRIER);












        map.addObstacleRange(new Point(1, 21), new Point(1, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(2, 21), new Point(2, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(3, 24), new Point(3, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(1, 21), new Point(1, 33), ObstacleType.BARRIER);

        map.setPosition(new Point(10, 10));

        //add items
//        map.addItem(new Item(new Point(5, 5), ITEM_TYPE_KEY));
        return map;
    }

}
