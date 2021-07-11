package design.thread;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class Daemons{
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        log.info("d.isDaemon() {} ", d.isDaemon());
        TimeUnit.MILLISECONDS.sleep(1000);
    }
}
