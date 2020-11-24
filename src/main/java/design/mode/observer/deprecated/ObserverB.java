package design.mode.observer.deprecated;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {

    ObserverB(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectDemo){
            System.out.println("observer B received msg : "+(String)arg);
        }
    }
}
