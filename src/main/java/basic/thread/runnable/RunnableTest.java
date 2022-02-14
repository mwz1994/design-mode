package basic.thread.runnable;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/14 10:34
 */
public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread = new Thread(myRunnable1);
        thread.start();
        MyRunnable myRunnable2 = new MyRunnable();
        Thread thread2 = new Thread(myRunnable2);
        thread2.start();
        MyRunnable myRunnable3 = new MyRunnable();
        Thread thread3 = new Thread(myRunnable3);
        thread3.start();
    }
}
