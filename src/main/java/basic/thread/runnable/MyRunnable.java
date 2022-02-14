package basic.thread.runnable;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/14 10:43
 */
public class MyRunnable implements Runnable{



    public MyRunnable(){
    }

    @Override
    public void run() {
        System.out.println("线程id -->" + Thread.currentThread().getId());
    }
}
