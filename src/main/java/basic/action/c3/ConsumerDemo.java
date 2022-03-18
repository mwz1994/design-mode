package basic.action.c3;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class ConsumerDemo {


    static List<Integer> list = List.of(1,2,3,4,5);

    public void start() {
        forEach(list,(Integer i)-> System.out.println(Thread.currentThread().getName() +" current i "+i));
    }


    public <T> void forEach(List<T> list,Consumer<T> c){
        for (T i:list){
            c.accept(i);
        }
    }
}

class ConsumerMain{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConsumerDemo demo = new ConsumerDemo();
        System.out.println(Thread.currentThread().getName()+ " demo is "+demo.toString());
        demo.start();

        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<String> callable = ()-> 42 + " " + Thread.currentThread().getName();

        var f = executorService.submit(callable);

        System.out.println("future is "+ f.get());
    }
}
