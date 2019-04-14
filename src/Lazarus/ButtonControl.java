package Lazarus;

import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

public class ButtonControl extends GameObject implements Observer {

    public ButtonControl(BufferedImage[] sprt) {
        super(sprt);
    }

    public ButtonControl(BufferedImage[] sprt, int x, int y) {
        super(sprt);
        //setters
        setX(x);
        setY(y);
    }
    @Override
    //update methods
    public void update(Observable o, Object arg) {}

}
