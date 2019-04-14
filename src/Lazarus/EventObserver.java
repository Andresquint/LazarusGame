
package Lazarus;


import java.awt.event.KeyEvent;
import java.util.Observable;


public class EventObserver extends Observable {


//This class implements the Observable class.
//It will notify the observer whenever
//collisions and keyboard events occur.




    public Object event;

    public void setValue(KeyEvent e) {
              
        event = e;
        setChanged();        
        notifyObservers(this);
    }

  
}


