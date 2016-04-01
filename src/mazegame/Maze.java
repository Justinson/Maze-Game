/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import audio.AudioPlayer;
import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Justinson
 */
class Maze extends Environment {

    Image titleImage;
    private GameState state;

    public Maze() {

        titleImage = ResourceTools.loadImageFromResource("mazegame/Title.png");
        state = GameState.MENU;

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
        if (getState() == GameState.MENU) {
            if (new Rectangle(505, 310, 300, 90).contains(e.getPoint())) {

            } else {
            }
            setState(GameState.GAME);

        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (state == GameState.MENU) {
            graphics.drawImage(titleImage, 0, 0, 1367, 710, null);
        } else if (state == GameState.GAME) {
            this.setBackground(Color.BLACK);
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
}
