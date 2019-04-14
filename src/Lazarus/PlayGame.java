
package Lazarus;


/**
 * Lazarus Game
 * @author Lidiya Jebessa ID: 917267252
 *
 */

/* The goal of Lazarus (the game) is to get the character, Lazarus, out of the pit. Boxes are dropped on 
Lazarus, but once Lazarus hits the stop button the machine that drops boxes is stopped.
If a box falls on Lazarus, the game is lost. Lazarus must
climb on the boxes to get to the stop button. The kinds of boxes are, from lightest to heaviest:
cardboard, wood, stone and  metal. If a 
heavier box falls on a lighter one, the lighter one is crushed.
The movement of Lazarus is controlled by the left and right 
arrow keys. 
There are three levels for the game.  
*/

/*
This class instantiates objects of the playSound.java
and LazarusControl.java classes,
as well as sets up the frame for the game. 
It has the “main” method that initializes the game.
*/

import java.awt.*;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;


public class PlayGame {
    public static void main(String argv[]) {
        playSound play_sound = new playSound();
        play_sound.play_continously("src/resource/FIKIR NEH.wav");
        final LazarusControl lw = new LazarusControl();
        lw.init();
        JFrame jf = new JFrame(" Lazarus Game");
        jf.addWindowListener(new WindowAdapter() {});
        jf.getContentPane().add("Center", lw);
        jf.setSize(lw.getWindowWidth(), lw.getWindowHeight());
        jf.setResizable(true);
        jf.setVisible(true);
        lw.start();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
