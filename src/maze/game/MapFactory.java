/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze.game;

import images.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;
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
    public static final String MAP_NAME_LEVEL_02 = "LEVEL_02";
    public static final String MAP_NAME_LEVEL_03 = "LEVEL_03";

    //Item Types
    public static final String ITEM_TYPE_KEY = "KEY";

    public static Map getMapByName(String mapName) {
        switch (mapName) {
            default:
            case MAP_NAME_LEVEL_01:
                return getMapLevel01();

            case MAP_NAME_LEVEL_02:
                return getMapLevel02();
                
            case MAP_NAME_LEVEL_03:
                return getMapLevel03();    
        }
    }

    public static final Dimension CELL_SIZE = new Dimension(20, 20);

    private static Map getMapLevel01() {
        int columns = 35;
        int rows = 67;
        
        Image background = ResourceTools.loadImageFromResource("maze/game/dirt.png").getScaledInstance(CELL_SIZE.width * rows, CELL_SIZE.height * columns, Image.SCALE_SMOOTH);
        
        Map map = new Map(background, CELL_SIZE, new Dimension(columns, rows));

        //add all my portals, barriers and items
//<editor-fold defaultstate="collapsed" desc="Barriers">
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

        map.addObstacleRange(new Point(3, 9), new Point(3, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(4, 9), new Point(4, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(5, 9), new Point(5, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(1, 18), new Point(2, 18), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(4, 24), new Point(4, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(5, 24), new Point(5, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(6, 24), new Point(6, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(7, 24), new Point(7, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(8, 24), new Point(8, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(9, 24), new Point(9, 33), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(3, 21), new Point(9, 21), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(8, 12), new Point(8, 20), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(9, 12), new Point(9, 20), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(10, 12), new Point(21, 12), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(10, 13), new Point(21, 13), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(18, 3), new Point(18, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(19, 3), new Point(19, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(20, 3), new Point(20, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(21, 3), new Point(21, 11), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(10, 33), new Point(20, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(10, 32), new Point(20, 32), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(10, 31), new Point(20, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 30), new Point(20, 30), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(12, 29), new Point(20, 29), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(20, 20), new Point(20, 28), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(16, 20), new Point(20, 22), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(21, 16), new Point(25, 20), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(12, 16), new Point(20, 17), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(12, 18), new Point(13, 26), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(12, 25), new Point(17, 26), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(23, 23), new Point(28, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(28, 14), new Point(31, 25), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(32, 18), new Point(35, 25), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(36, 18), new Point(63, 19), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(37, 11), new Point(44, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(41, 7), new Point(52, 9), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(41, 10), new Point(44, 10), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(31, 28), new Point(42, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(38, 22), new Point(42, 27), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(42, 22), new Point(52, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(45, 27), new Point(53, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(54, 27), new Point(58, 28), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(55, 20), new Point(58, 26), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(47, 12), new Point(56, 17), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(61, 20), new Point(63, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(56, 31), new Point(60, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(57, 17), new Point(63, 17), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(63, 4), new Point(63, 16), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(33, 1), new Point(65, 1), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(59, 2), new Point(60, 14), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(55, 4), new Point(56, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(41, 4), new Point(54, 4), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(33, 2), new Point(38, 2), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 3), new Point(38, 4), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 3), new Point(25, 8), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(25, 7), new Point(38, 8), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(33, 9), new Point(34, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(34, 12), new Point(34, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(35, 14), new Point(36, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 11), new Point(32, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 12), new Point(25, 15), ObstacleType.BARRIER);

        map.addObstacleRange(new Point(1, 21), new Point(1, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(2, 21), new Point(2, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(3, 24), new Point(3, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(1, 21), new Point(1, 33), ObstacleType.BARRIER);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Items">

        map.addItem(new Item(new Point(1, 19), ITEM_TYPE_KEY));
        map.addItem(new Item(new Point(1, 20), ITEM_TYPE_KEY));
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Portals">
        map.addPortal(new Point(32, 10), MAP_NAME_LEVEL_01, new Point(26, 6));
//</editor-fold>

        map.setPosition(new Point(10, 10));
        return map;
    }

    private static Map getMapLevel02() {
        Map map = new Map(null, CELL_SIZE, new Dimension(35, 67));

        map.addPortal(new Point(0, 1), MAP_NAME_LEVEL_01, new Point(16, 11));

        return map;
    }

    private static Map getMapLevel03() {
        Map map = new Map(null, CELL_SIZE, new Dimension(35, 67));
        
        return map;
    }

}
