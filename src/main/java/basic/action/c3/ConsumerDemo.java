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

    public String noStatic(){
        return Thread.currentThread().getName();
    }
}

class ConsumerMain{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConsumerDemo demo = new ConsumerDemo();
        System.out.println(Thread.currentThread().getName()+ " demo is "+demo.toString());
        System.out.println(mainName()+ " main name is "+demo.toString());
        System.out.println(getName()+ " get name is "+demo.toString());
        System.out.println(demo.noStatic()+ " no-static name is "+demo.toString());
        demo.start();

        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<String> callable1 = ()-> 42 + " " + getName();
        Callable<String> callable2 = ()-> 42 + " " + Thread.currentThread().getName();

        var f1 = executorService.submit(callable1);
        var f2 = executorService.submit(callable2);

        System.out.println("future1 is "+ f1.get());
        System.out.println("future2 is "+ f2.get());
    }


    public static String mainName(){
        return Thread.currentThread().getName();
    }

    public static String getName(){
        return Thread.currentThread().getName();
    }
}
