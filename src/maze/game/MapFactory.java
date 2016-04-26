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
    public static final String MAP_NAME_LEVEL_04 = "LEVEL_04";

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

            case MAP_NAME_LEVEL_04:
                return getMapLevel04();
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
        int columns = 35;
        int rows = 67;

        Image background = ResourceTools.loadImageFromResource("maze/game/dirtgrassland.png").getScaledInstance(CELL_SIZE.width * rows, CELL_SIZE.height * columns, Image.SCALE_SMOOTH);

        Map map = new Map(background, CELL_SIZE, new Dimension(columns, rows));

//        Barriers, Portals, and Items
        //<editor-fold defaultstate="collapsed" desc="Barriers">
        map.addObstacleRange(new Point(0, 2), new Point(6, 5), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 6), new Point(2, 20), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 21), new Point(8, 25), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 26), new Point(1, 34), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(2, 33), new Point(17, 34), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(9, 2), new Point(17, 9), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(5, 8), new Point(8, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(11, 12), new Point(17, 23), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(11, 24), new Point(13, 30), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(4, 28), new Point(13, 30), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(15, 10), new Point(17, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(18, 8), new Point(19, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(20, 0), new Point(21, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(22, 0), new Point(28, 6), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(16, 24), new Point(17, 32), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(18, 21), new Point(24, 27), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(29, 0), new Point(45, 2), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(31, 5), new Point(32, 9), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 9), new Point(30, 9), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 10), new Point(25, 12), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(26, 12), new Point(28, 12), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(29, 12), new Point(34, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(35, 5), new Point(41, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(22, 15), new Point(26, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(27, 18), new Point(34, 23), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(18, 34), new Point(63, 34), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(35, 18), new Point(36, 19), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(37, 18), new Point(38, 27), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(27, 26), new Point(36, 27), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(27, 28), new Point(29, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(20, 30), new Point(26, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(46, 0), new Point(66, 0), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(48, 3), new Point(60, 5), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(44, 3), new Point(45, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(46, 8), new Point(50, 11), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(53, 6), new Point(60, 6), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(53, 7), new Point(55, 16), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(42, 14), new Point(55, 16), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(41, 16), new Point(42, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(63, 1), new Point(66, 10), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(66, 0), new Point(66, 32), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(32, 30), new Point(34, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(35, 30), new Point(42, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(41, 27), new Point(42, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(45, 23), new Point(45, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(43, 23), new Point(44, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(46, 23), new Point(51, 23), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(46, 26), new Point(51, 27), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(45, 19), new Point(59, 20), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(58, 9), new Point(62, 10), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(58, 11), new Point(59, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(54, 21), new Point(54, 29), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(48, 30), new Point(54, 31), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(57, 23), new Point(57, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(57, 31), new Point(63, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(62, 13), new Point(63, 28), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(60, 23), new Point(61, 28), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(63, 29), new Point(63, 30), ObstacleType.BARRIER);
//</editor-fold>

        return map;
    }

    private static Map getMapLevel03() {
        int columns = 35;
        int rows = 67;

        Image background = ResourceTools.loadImageFromResource("maze/game/glowstonetilesnew.png").getScaledInstance(CELL_SIZE.width * rows, CELL_SIZE.height * columns, Image.SCALE_SMOOTH);

        Map map = new Map(background, CELL_SIZE, new Dimension(columns, rows));

        //<editor-fold defaultstate="collapsed" desc="Barriers">
        map.addObstacleRange(new Point(0, 0), new Point(0, 32), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 0), new Point(66, 0), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(0, 30), new Point(7, 32), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(3, 3), new Point(7, 27), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(8, 27), new Point(9, 27), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(10, 27), new Point(13, 34), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(10, 1), new Point(13, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(14, 34), new Point(53, 34), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(16, 1), new Point(17, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(16, 27), new Point(17, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(32, 1), new Point(33, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(32, 27), new Point(33, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(20, 1), new Point(21, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(20, 18), new Point(21, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(28, 1), new Point(29, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(28, 18), new Point(29, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(36, 1), new Point(37, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(44, 1), new Point(45, 15), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(36, 18), new Point(37, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(44, 18), new Point(45, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 1), new Point(25, 7), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(24, 10), new Point(25, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(40, 1), new Point(41, 7), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(40, 10), new Point(41, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(48, 1), new Point(49, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(50, 3), new Point(53, 19), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(54, 3), new Point(55, 13), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(56, 11), new Point(62, 13), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(61, 7), new Point(62, 13), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(58, 1), new Point(58, 8), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(59, 1), new Point(66, 4), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(65, 1), new Point(66, 32), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(56, 16), new Point(64, 18), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(52, 19), new Point(53, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(48, 27), new Point(53, 33), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(54, 21), new Point(62, 24), ObstacleType.BARRIER);
        map.addObstacleRange(new Point(56, 27), new Point(66, 32), ObstacleType.BARRIER);
//</editor-fold>

        return map;
    }
        private static Map getMapLevel04() {
        int columns = 35;
        int rows = 67;

//        Image background = ResourceTools.loadImageFromResource("maze/game/dirt.png").getScaledInstance(CELL_SIZE.width * rows, CELL_SIZE.height * columns, Image.SCALE_SMOOTH);

        Map map = new Map(null, CELL_SIZE, new Dimension(columns, rows));
        
        return map;
}
}