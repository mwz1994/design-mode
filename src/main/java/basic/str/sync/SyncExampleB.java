package basic.str.sync;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SyncExampleB {
    public void func1(){
        synchronized (SyncExampleB.class){
            for (int i = 0; i < 10 ; i++) {
                log.info(" "+i);
            }
        }
    }
}
