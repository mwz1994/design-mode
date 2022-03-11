package basic.onjava8.c4;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/11 10:48
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9;
        t2.level = 47;

        System.out.println("1: t1 level: "+t1.level + " , t2.level: "+t2.level);

        t1 = t2;

        System.out.println("2: t1 level: "+t1.level + " , t2.level: "+t2.level);

        t1.level = 27 ;

        System.out.println("3: t1 level: "+t1.level + " , t2.level: "+t2.level);
    }


}
