package basic.action.c3;

import basic.action.c1.Apple;
import basic.action.c1.Color;

import java.util.List;
import java.util.concurrent.*;

public class FinalDemo {
    ExecutorService executorService = Executors.newFixedThreadPool(4);

    public void LocalMethod() throws ExecutionException, InterruptedException {
        int portNumber = 1337;

        for (Integer i=0;i<10;i++){
            // callable
            Callable<String> c = ()-> (Thread.currentThread().getName()+" callable port is "+portNumber);
            //portNumber = 1338;
            Future<String> f1 = executorService.submit(c);
            System.out.println(f1.get());

            // runnable
            Runnable r = ()-> System.out.println(Thread.currentThread().getName()+" runnable port is "+portNumber);
            executorService.submit(r);
        }

        List<Apple> inventory = List.of(new Apple(Color.GREEN,80),new Apple(Color.GREEN,155),new Apple(Color.RED,120));

        for (Apple apple : inventory){
            Runnable r = ()-> System.out.println("apple is "+apple.toString());
            executorService.submit(r);
        }
    }

    public void lambdaDemo() throws InterruptedException {
        Apple a = new Apple(Color.GREEN,150);
        for (Integer i=0;i<10;i++){
            // 实例变量
            System.out.println("apple [" + i+ "] now is "+a.toString());
            Runnable appleRun = ()-> System.out.println(a.toString());
            executorService.submit(appleRun);
            a.setColor(Color.RED);
            a.setWeight(i);
        }
    }

}

class FinalMain{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FinalDemo demo = new FinalDemo();
//        demo.LocalMethod();
        demo.lambdaDemo();
    }
}
