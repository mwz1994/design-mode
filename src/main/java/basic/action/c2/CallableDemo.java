package basic.action.c2;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<String> threadName = executorService.submit(new Callable() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });

        System.out.println(Thread.currentThread().getName() +" callable thread name is : "+threadName.get());

        Future<String> tn = executorService.submit(()->Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getName() +" callable thread name is : "+tn.get());
    }
}
