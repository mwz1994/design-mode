package basic.thread;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/14 10:32
 */
public class MyThread extends Thread{
    String name;

    public MyThread(String n){
        name = n;
    }


    public void run(){
        System.out.println("线程名 ["+ name + "]"+" id -->" + Thread.currentThread().getId());
    }
}
