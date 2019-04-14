

package Lazarus;


import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;


public class DataField extends GameObject implements Observer {
    //This class has data fields for the position, speed, kind of box
    //which is: 0: wall, 1: cardboard, 2: wood, 3: stone, 4: metal.It extends GameObject and implements Observer
    char KindOfBox;
    int Xpos, Ypos;
    boolean droppingBox;

    public DataField(BufferedImage[] sprt) {
        super(sprt);
    }

    public DataField(BufferedImage[] sprite, int x, int y, int speed, char boxKind, boolean drop) {
        super(sprite);
        setXY(x,y);
        Xpos = x;
        Ypos = y;
        this.speed = speed;
        this.KindOfBox = boxKind;
        this.droppingBox = drop;
    }
        
  
    
    @Override
    //the box situation (dropping or not).
     public void collisionEvent() {
        if (collisionKind == '0') {
            droppingBox = false;
                setY(Ypos);
        }
        else if(collisionKind == '1') {
            isDisplayed = false;
        }     
    }

    public void drop() {
        Ypos = y;
        setY(y + speed);
    }

  //getters methods, method to detect the collision event, draw and update methods.
    
    public boolean getDropping(boolean bln) {
        return droppingBox = bln;
    }

    public boolean isDropping() {
        return droppingBox;
    }

    
    public char getKindOfBox() {
        return KindOfBox;
    }

    public void update() {
        collisionEvent();
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    public void draw(Graphics g, ImageObserver obs) {
        if (isDisplayed) {
            g.drawImage(sprite[frame], x, y, obs);
            if (droppingBox) {
                drop();
            }
        }
    }
}
