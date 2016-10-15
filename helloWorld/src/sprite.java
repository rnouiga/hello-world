package com.zetcode;

import java.awt.event.KeyEvent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {
    //----------------Data Members------------------
    private String name;
    private int lives; //counter
    private int xPosition, yPosition, dx, dy; //position variables
    private Image image;

    public actualSprite {
        initSoda();
    }
    private void initSoda{){
        ImageIcon thegod = new ImageIcon("PLACEHOLDER");
        image = thegod.getImage();
        xPosition = 250;
        yPosition = 100;
    }

    public void move {

        xPosition += dx;
        yPosition += dy;
    }

    public void keyPressed(KeyEvent keyVar) {

        int key = keyVar.getKeyCode();

        if (key == KeyEvent.VK_W) {
            dy = 0;
        }
        if (key == KeyEvent.VK_A) {
            dx = 0;
        }
        if (key == KeyEvent.VK_D) {
            dx = 0;
        }
    }
    public void keyReleased(KeyEvent keyVar) {

        int key = keyVar.getKeyCode();

        if (key == KeyEvent.VK_W) {
            dy = 5;
        }
        if (key == KeyEvent.VK_A) {
            dx = -5;
        }
        if (key == KeyEvent.VK_D) {
            dx = 5;
        }
    }



}
