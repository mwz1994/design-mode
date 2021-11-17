package design.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

@Slf4j
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id){
        this.id = id ;
    }

    @Override
    public String call() throws Exception {
        log.info("Thread {} handler-{}",Thread.currentThread(),id);
        return "result of task "+id;
    }
}
