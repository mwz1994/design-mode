package design.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;


@Slf4j
public class SimpleDaemons implements Runnable{

    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                log.info(Thread.currentThread()+ " : "+ this.toString());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            log.info("sleep() interrupt");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());

            daemon.setDaemon(true);
            daemon.start();

        }
        log.info("all daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
