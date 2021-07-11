package design.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class DaemonFromFactory implements  Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                log.info("is daemon {}",Thread.currentThread().isDaemon());
                log.info(Thread.currentThread()+ " : "+this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonFactory());

        for (int i = 0; i < 10 ; i++) {
            exec.execute(new DaemonFromFactory());
        }

        log.info("all daemon stared");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
