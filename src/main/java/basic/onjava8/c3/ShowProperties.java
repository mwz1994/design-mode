package basic.onjava8.c3;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/10 19:06
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);

        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
