package basic.str.sync;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SyncExampleA{
    public void func1(){
        synchronized (this){
            for (int i = 0; i < 10 ; i++) {
                log.info(" "+i);
            }
        }
    }
}
