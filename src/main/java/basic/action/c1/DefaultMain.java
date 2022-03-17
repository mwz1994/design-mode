package basic.action.c1;

public class DefaultMain {

    public static void main(String[] args) {
        DefInterface defInterface = new DefInterface(){};
        System.out.println(defInterface.helloWorld());
    }
}
