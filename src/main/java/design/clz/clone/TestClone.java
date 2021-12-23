package design.clz.clone;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/11/19 9:46
 */
public class TestClone {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setNumber(12345);

        Student stu2 = stu1;

        stu2.setNumber(54321);

        System.out.println("学生1： "+stu1.getNumber());
        System.out.println("学生2： "+stu2.getNumber());
    }
}
