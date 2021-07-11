package design.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Daemon implements Runnable{
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            log.info("Daemon spawn {} started",i);
        }

        for (int i = 0; i < t.length; i++) {
            log.info("t[{}] isDaemon() {}",i,t[i].isDaemon() );
        }

        while (true){
            Thread.yield();
        }
    }
}
