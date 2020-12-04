package design.mode.observer.property;

import java.beans.PropertyChangeListener;

public interface INoticeSubject {

    public void addListener(PropertyChangeListener listener);

    public void propertyEventChange();
}
