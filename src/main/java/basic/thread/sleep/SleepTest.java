package basic.thread.sleep;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/14 14:06
 */
public class SleepTest {
    private int i = 10;
    private final Object object = new Object();
    private String lock = "";

    public static void main(String[] args) {
        SleepTest test = new SleepTest();
        SleepThread thread1 = test.new SleepThread();
        SleepThread thread2 = test.new SleepThread();
        thread1.start();
        thread2.start();
        System.out.println("main 函数执行完毕，线程 "+Thread.currentThread().getId());
    }


    class SleepThread extends Thread{

        @Override
        public void run(){
            System.out.println("执行 run 方法 "+Thread.currentThread().getId());
            synchronized (lock){
                System.out.println("线程获得锁 "+Thread.currentThread().getId());
                i++;
                System.out.println("i: "+i);
                try {
                    System.out.println("线程 "+Thread.currentThread().getId()+ "进入睡眠状态");
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("线程 "+Thread.currentThread().getId()+"睡眠结束");
                i++;
                System.out.println("i: "+i);
            }
        }
    }
}
