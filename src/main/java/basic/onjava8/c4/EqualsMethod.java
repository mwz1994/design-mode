package basic.onjava8.c4;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/11 11:35
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();

        tank1.level = tank2.level = 100;

        System.out.println(tank1.equals(tank2));
    }
}
