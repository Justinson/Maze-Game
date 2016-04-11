/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
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
    Image ChestImage;
    private Map currentMap;
    private MapVisualizerDefault mapVisualizer;

    public Maze() {
//        grid = new Grid(71, 38, 20, 20, new Point(10, 10), Color.BLACK);
        setCurrentMap(MapFactory.getMapByName(MapFactory.MAP_NAME_LEVEL_01));
        ChestImage = ResourceTools.loadImageFromResource("mazegame/Chest.png");

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

    public final static int PLAY_BUTTON_X = 49;
    public final static int PLAY_BUTTON_Y = 370;
    public final static int PLAY_BUTTON_WIDTH = 20;
    public final static int PLAY_BUTTON_HEIGHT = 20;
    
    @Override
    public void environmentMouseClicked(MouseEvent e) {
    if (state == GameState.GAME) {
            if (new Rectangle(PLAY_BUTTON_X, PLAY_BUTTON_Y, PLAY_BUTTON_WIDTH, PLAY_BUTTON_HEIGHT).contains(e.getPoint())) {

            } else {
            }
            state = GameState.INVENTORY;
        }
    }

    
   
    @Override
    public void paintEnvironment(Graphics graphics) {
//                if (grid != null) {
//            grid.paintComponent(graphics);
//    }
    
        if(currentMap != null){
            currentMap.drawMap(graphics);
        }
        graphics.drawImage(ChestImage, 49, 370, 20, 20, this);
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
            mapVisualizer = new MapVisualizerDefault(true, true);
        }
        
        this.currentMap = currentMap;
        this.currentMap.setMapVisualizer(mapVisualizer);
        this.currentMap.setPosition(new Point(50, 50));
        //set portal, barrier, item listeners
        
        repaint();
    }

   
    }
