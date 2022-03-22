package basic.action.c3;

import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {


    static List<Integer> list = List.of(1,2,3,4,5);
    List<String> strList = List.of("a","b");

    public void start() {
        forEach(list,(Integer i)-> System.out.println(Thread.currentThread().getName() +" current i "+i));
//        forEach(list,(Integer i)-> list.add(1) );
        Predicate<String> p = (String s)-> strList.add("d");

        System.out.println("list is "+ strList);

        Consumer<String> c = (String s)->strList.add("e");

        System.out.println("list is "+ strList);
    }


    public <T> void forEach(List<T> list,Consumer<T> c){
        for (T i:list){
            c.accept(i);
        }
        System.out.println("current list is "+list.toString());
    }

    public String noStatic(){
        return Thread.currentThread().getName();
    }


    public String getName(){
        return Thread.currentThread().getName();
    }

    public void test() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<String> callable1 = ()-> 47 + " " + getName();
        Callable<String> callable2 = ()-> 47 + " " + Thread.currentThread().getName();

        Future<String> f1 = executorService.submit(callable1);
        Future<String> f2 = executorService.submit(callable2);



        System.out.println("future1 is "+ f1.get());
        System.out.println("future2 is "+ f2.get());
    }
}

class ConsumerMain{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConsumerDemo demo = new ConsumerDemo();
        System.out.println(Thread.currentThread().getName()+ " demo is "+demo.toString());

        System.out.println(demo.noStatic()+ " no-static name is "+demo.toString());
        demo.start();
        demo.test();
    }
}
