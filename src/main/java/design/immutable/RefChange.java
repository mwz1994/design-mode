package design.immutable;

import java.lang.reflect.Field;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/11/17 20:06
 */
public class RefChange {
    // TODO 尝试通过反射改变不可变类型，尝试失败
    public static void main(String[] args) throws Exception {
        String s = "hello world";

        System.out.println("s = "+s);

        Field valueFieldOfString = String.class.getDeclaredField("value");

        valueFieldOfString.setAccessible(true);

        char[] value = (char[]) valueFieldOfString.get(s);

        value[5] = '_';

        System.out.println("s = "+ s);
        System.out.println("failed 反射失败");
    }
}
