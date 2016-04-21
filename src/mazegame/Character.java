/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

/**
 *
 * @author Justinson
 */
public class Character {
    int strength;
    int health;
    int defense;
    int speed;
    int mana;
    

    public Character(int strength, int health, int defense, int speed, int mana) {
        this.strength = strength;
        this.health = health;
        this.defense = defense;
        this.speed = speed;
        this.mana = mana;
    }
}
