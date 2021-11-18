package design.clz;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/11/18 15:22
 */
public class WeekDayMain {
    public static void main(String[] args) {
        WeekDayEnum friday = WeekDayEnum.FRIDAY;
        System.out.println("day is "+friday);
        System.out.println("find by code res "+WeekDayEnum.findByCode(1));
    }
}
