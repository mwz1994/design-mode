package effectivej.thread;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(()->{
           int i = 0;
           while (!stopRequested){
               i++;
               System.out.println(i);
//               System.out.println(String.format("current thread is %s i is %s",Thread.currentThread().getName(),i));
           }
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);

//        System.out.println(String.format("main thread is %s",Thread.currentThread().getName()));

        stopRequested = true;
    }

}
