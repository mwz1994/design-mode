package design.mode.observer.property;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertySubject implements INoticeSubject {

    PropertyChangeSupport support;

    PropertySubject(){
        this.support = new PropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public void propertyEventChange(){
        support.firePropertyChange("aspirin",18,25);
    }
}
