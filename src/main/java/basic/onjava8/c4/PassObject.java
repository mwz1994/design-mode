package basic.onjava8.c4;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/11 10:55
 */
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();

        x.c = 'a';

        System.out.println("1: x.c： "+x.c);
        f(x);
        System.out.println("2: x.c： "+x.c);
    }
}

class Letter{
    char c;
}
