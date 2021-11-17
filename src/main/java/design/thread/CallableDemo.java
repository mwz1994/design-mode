package design.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.concurrent.*;


@Slf4j
public class CallableDemo {

    static ExecutorService exec  = Executors.newFixedThreadPool(10);

//    static ThreadPoolExecutor exec = new ThreadPoolExecutor(2,10,1,TimeUnit.SECONDS,new ArrayBlockingQueue<>(10) );

    public static void main(String[] args) {


        ArrayList<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            Future<String> f = exec.submit(new TaskWithResult(i));
            results.add(f);
        }


        for (Future<String> fs : results){
            try {
                log.info("future str {}",fs.get());
                TimeUnit.MILLISECONDS.sleep(10);
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

        log.info("main method completed");
    }
}
