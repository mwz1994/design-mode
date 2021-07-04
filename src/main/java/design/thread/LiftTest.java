package design.thread;

public class LiftTest {


    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        Thread thread = new Thread(liftOff);
        thread.start();
    }
}
