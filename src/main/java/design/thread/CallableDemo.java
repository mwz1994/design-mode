package design.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


@Slf4j
public class CallableDemo {

    public static void main(String[] args) {
        ExecutorService exec  = Executors.newCachedThreadPool();

        ArrayList<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            Future<String> f = exec.submit(new TaskWithResult(i));
            results.add(f);
        }


        for (Future<String> fs : results){
            try {
                log.info("future str {}",fs.get());
            }catch (InterruptedException i){
                i.printStackTrace();
                log.error("error i {}",i.getMessage());
            } catch (ExecutionException e) {
                e.printStackTrace();
                log.error("error e {}",e.getMessage());
            }finally {
                exec.shutdown();
            }
        }
    }
}
