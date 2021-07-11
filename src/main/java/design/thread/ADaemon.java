package design.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class ADaemon implements Runnable{


    @Override
    public void run() {
        try{
            log.info("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);

        } catch (InterruptedException e) {
            e.printStackTrace();
            log.error("exiting via InterruptedException");
        }finally {
            log.info("this should always run?");
        }
    }


}
