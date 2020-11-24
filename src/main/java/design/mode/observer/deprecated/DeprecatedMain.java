package design.mode.observer.deprecated;

public class DeprecatedMain {
    public static void main(String[] args) {
        SubjectDemo subjectDemo = new SubjectDemo();
        ObserverA observerA = new ObserverA(subjectDemo);
        ObserverB observerB = new ObserverB(subjectDemo);
        subjectDemo.setMsg("USA president is Joe Bidden");
    }
}
