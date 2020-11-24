package design.mode.observer.deprecated;

import java.util.Observable;

public class SubjectDemo extends Observable {
    String msg ;

    public void setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers(msg);
    }
}
