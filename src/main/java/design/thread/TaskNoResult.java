package design.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/11/17 14:46
 */
@Slf4j
public class TaskNoResult implements Runnable{
    int id;

    public TaskNoResult(int i) {
        this.id = id;
    }



    @Override
    public void run() {
        log.info("cur id is {}",id);
    }
}
