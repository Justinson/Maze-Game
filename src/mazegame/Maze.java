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

/**
 *
 * @author Justinson
 */
class Maze extends Environment {

    Image titleImage;
    private GameState state;
    private final Image sectionOne;
    private final Image castleOne;

    public Maze() {

        titleImage = ResourceTools.loadImageFromResource("mazegame/Title.png");
        sectionOne = ResourceTools.loadImageFromResource("mazegame/One.png");
        castleOne = ResourceTools.loadImageFromResource("mazegame/CastleOne.png");
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
}
