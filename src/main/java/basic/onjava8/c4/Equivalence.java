package basic.onjava8.c4;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/11 11:31
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;

        System.out.println(n1 == n2);
        System.out.println(n1 != n2);

        Integer n3 = 147;
        Integer n4 = 147;

        System.out.println(n3 == n4);
        System.out.println(n3 != n4);
    }
}
