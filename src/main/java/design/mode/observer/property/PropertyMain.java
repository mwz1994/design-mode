package design.mode.observer.property;

public class PropertyMain {

    public static void main(String[] args) {
        System.out.println("start property change event");
        PropertySubject propertySubject = new PropertySubject();
        propertySubject.addListener(new PropertyListenerA());
        propertySubject.addListener(new PropertyListenerB());
        propertySubject.propertyEventChange();
    }
}
