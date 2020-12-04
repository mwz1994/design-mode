package design.mode.observer.property;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyListenerA implements PropertyChangeListener {
    PropertySubject propertySubject;

    PropertyListenerA(INoticeSubject iNoticeSubject){
        iNoticeSubject.addListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("property listener A received :"+evt.getPropertyName()+";"+evt.getNewValue()+";"+evt.getOldValue());
    }
}
