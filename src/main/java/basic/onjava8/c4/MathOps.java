package basic.onjava8.c4;

import java.util.Random;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/11 11:03
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);

        System.out.println("get class : "+rand.getClass());

        for (int i=0;i<10;i++){
            System.out.println("1.rand next int is "+rand.nextInt(100));
        }

        int i = 1;

        System.out.println("i = "+ i);
        System.out.println("++i = "+ ++i);
        System.out.println("i++ = "+ i++);
        System.out.println("i = "+ i);
        System.out.println("--i = "+ --i);
        System.out.println("i-- = "+ i--);
        System.out.println("i = "+ i);

    }
}
