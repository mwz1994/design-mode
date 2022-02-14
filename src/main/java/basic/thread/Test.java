package basic.thread;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/14 10:34
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();
    }
}
