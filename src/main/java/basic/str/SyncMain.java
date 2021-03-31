package basic.str;

import basic.str.sync.SyncExampleA;
import basic.str.sync.SyncExampleB;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class SyncMain {
    public static void main(String[] args) {
//        testObject();
        testSyncClass();
    }

    private static void testSyncClass() {
        SyncExampleB c = new SyncExampleB();
        SyncExampleB d = new SyncExampleB();
        ExecutorService serviceA = Executors.newCachedThreadPool();
        ExecutorService serviceB = Executors.newFixedThreadPool(10);
        ExecutorService serviceC = Executors.newSingleThreadExecutor();
        serviceC.execute(()->c.func1());
        serviceC.execute(()->d.func1());
    }

    private static void testObject() {
        SyncExampleA a = new SyncExampleA();
        SyncExampleA b = new SyncExampleA();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->a.func1());
        service.execute(()->b.func1());
    }


}
