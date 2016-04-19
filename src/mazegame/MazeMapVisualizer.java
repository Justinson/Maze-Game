/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.awt.Graphics;
import java.awt.Point;
import map.Map;
import map.MapVisualizerDefault;
import map.Obstacle;

/**
 *
 * @author Justinson
 */
public class MazeMapVisualizer extends MapVisualizerDefault {

    public MazeMapVisualizer(boolean showMap, boolean showAllObjects) {
        super(showMap, showAllObjects);
    }

    @Override
    public void drawObstacles(Map map, Graphics graphics) {

        for (Obstacle obstacle : map.getObstacles()) {
            Point systemCoordinate = map.getCellSystemCoordinate(obstacle.getLocation());
            graphics.fill3DRect(systemCoordinate.x, systemCoordinate.y, map.getCellWidth(), map.getCellHeight(), true);
            
//            systemCoordinate.x += (map.getCellWidth() / 4);
//            systemCoordinate.y += (map.getCellHeight() * 3 / 4);
//
//            graphics.drawString(obstacle.getType().getDisplayCode(), systemCoordinate.x, systemCoordinate.y);
        }
    }

}
