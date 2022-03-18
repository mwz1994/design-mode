package basic.action.c2;

public class RunnableDemo {

    public static void main(String[] args) {

        String s = "";

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello runnable");
            }
        });

        Thread t2 = new Thread(()-> System.out.println("hello lambda "+s));

        System.out.println("thread end "+t2.getName());
    }
}
