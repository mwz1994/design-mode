package design.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftTest {
    static ExecutorService exec = Executors.newFixedThreadPool(5);


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LiftOff liftOff = new LiftOff();
            exec.submit(liftOff);
        }
    }
}
