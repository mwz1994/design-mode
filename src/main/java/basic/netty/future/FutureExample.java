package basic.netty.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/5 16:14
 */
public class FutureExample {
    static ExecutorService excutor = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("i am task1 ....");
            }
        };

        Callable<Integer> task2 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Integer(100);
            }
        };

        Future<?> f1 = excutor.submit(task1);
        Future<Integer> f2 = excutor.submit(task2);

        System.out.println("task1 is completed? "+f1.isDone());
        System.out.println("task2 is completed? "+f2.isDone());


        while (f1.isDone()){
            System.out.println("task1 completed");

        }
    }
}
