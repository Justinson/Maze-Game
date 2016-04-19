/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import audio.AudioPlayer;
import environment.Direction;
import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
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

    Image titleImage;
    private GameState state;
    private final Image sectionOne;
    private final Image castleOne;
    int x;
    int y;
    Image ChestImage;
    private Map currentMap;
    private MazeMapVisualizer mapVisualizer;

    public Maze() {

        titleImage = ResourceTools.loadImageFromResource("mazegame/Title.png");
        sectionOne = ResourceTools.loadImageFromResource("mazegame/One.png");
        castleOne = ResourceTools.loadImageFromResource("mazegame/CastleOne.png");
        state = GameState.MENU;

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
//        if (e.getKeyCode() == KeyEvent.VK_P) {
//            setState(GameState.PAUSE);
//        } else if (getState() == GameState.PAUSE) {
//            setState(GameState.GAME);
//        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        //System.out.println(" Mouse click " + e.getPoint().toString());

        if (getState() == GameState.MENU) {
            if (new Rectangle(584, 307, 233, 52).contains(e.getPoint())) {
                System.out.println("continue Clicked");
            } else if (new Rectangle(558, 419, 277, 55).contains(e.getPoint())) {
                setState(GameState.GAME);

            } else if (new Rectangle(596, 540, 202, 49).contains(e.getPoint())) {
                setState(GameState.OPTION);

            }

        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (state == GameState.MENU) {
            graphics.drawImage(titleImage, 0, 0, 1367, 710, null);
        } else if (state == GameState.GAME) {
            graphics.drawImage(sectionOne, -35, -15, 1405, 745, null);
            graphics.drawImage(castleOne, 5, 10, 400, 300, null);
        } else if (state == GameState.OPTION) {
            this.setBackground(Color.BLACK);
            Font fnt0 = new Font("button", Font.BOLD, 70);
            graphics.setFont(fnt0);
            graphics.setColor(Color.WHITE);
            graphics.drawString("OPTIONS", 540, 100);
        } else if (state == GameState.PAUSE) {

        } else if (state == GameState.END) {

        }
    }

    /**
     * @return the state
     */
    public GameState getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(GameState state) {
        this.state = state;
    }

    public final static int PLAY_BUTTON_X = 49;
    public final static int PLAY_BUTTON_Y = 370;
    public final static int PLAY_BUTTON_WIDTH = 20;
    public final static int PLAY_BUTTON_HEIGHT = 20;
    
 
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