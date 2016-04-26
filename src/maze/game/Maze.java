/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze.game;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import map.Map;
import map.MapVisualizerDefault;

/**
 *
 * @author Justinson
 */
class Maze extends Environment {
    
    int x;
    int y;
//    private Grid grid;
    private Map currentMap;
//    private MapVisualizerDefault mapVisualizer;
    private MazeMapVisualizer mapVisualizer;

    public Maze() {
//        grid = new Grid(71, 38, 20, 20, new Point(10, 10), Color.BLACK);
        setCurrentMap(MapFactory.getMapByName(MapFactory.MAP_NAME_LEVEL_01));
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
//                if (grid != null) {
//            grid.paintComponent(graphics);
//    }
    
        if(currentMap != null){
            currentMap.drawMap(graphics);
        }
        
    }

    /**
     * @return the currentMap
     */
    public Map getCurrentMap() {
        return currentMap;
    }

    /**
     * @param currentMap the currentMap to set
     */
    public void setCurrentMap(Map currentMap) {
        if (mapVisualizer == null) {
            mapVisualizer = new MazeMapVisualizer(true, true);
        }
        
        this.currentMap = currentMap;
        this.currentMap.setMapVisualizer(mapVisualizer);
        this.currentMap.setPosition(new Point(50, 50));
        //set portal, barrier, item listeners
        
        repaint();
    }

   
    }