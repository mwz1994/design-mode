package design.clz;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/11/18 15:17
 */
public enum WeekDayEnum {
    MONDAY(1,"周一"),
    TUESDAY(2,"周二"),
    WEDENSDAY(3,"周三"),
    THURSDAY(4,"周四"),
    FRIDAY(5,"周五"),
    SATURDAY(6,"周六"),
    SUNDAY(7,"周日"),

    ;

    private int code;
    private String desc;
    WeekDayEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    private static final Map<Integer,WeekDayEnum> WEEK_DAY_ENUM_MAP = new HashMap<>();

    static {
        for (WeekDayEnum weekDay: WeekDayEnum.values()){
            WEEK_DAY_ENUM_MAP.put(weekDay.code,weekDay);
        }

        System.out.println("init map is "+ WEEK_DAY_ENUM_MAP);
    }

    public static WeekDayEnum findByCode(int code){
        return WEEK_DAY_ENUM_MAP.get(code);
    }


}
