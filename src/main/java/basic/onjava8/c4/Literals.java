package basic.onjava8.c4;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/11 11:49
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // 16 进制 (小写)
        int i2 = 057; // 8 进制
        int i3 = 124_456;
        double exp = 47e2; //科学计数
        float f = 1.39e-3f;
        System.out.printf("=================%n");
        System.out.println("i1: " + Integer.valueOf(i1));
        System.out.println("i2: " + Integer.valueOf(i2));
        System.out.println("i3: " + i3);
        System.out.println("exp: " + exp);
        System.out.println("f: " + f);
    }
}
