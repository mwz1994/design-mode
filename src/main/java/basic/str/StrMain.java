package basic.str;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrMain {
    public static void main(String[] args) {
        String a = "hello world";
        String b = "hello world";
        log.info("a hashcode {}",a.hashCode());
        log.info("b hashcode {}",b.hashCode());
        School c = new School(100,"yaeher");
        School d = new School(100,"yaeher");
        log.info("c hashcode {}",c.hashCode());
        log.info("d hashcode {}",d.hashCode());
        Integer e = 2;
        Integer f = 2;
        log.info("e hashcode {}",e.hashCode());
        log.info("f hashcode {}",f.hashCode());

    }

    @AllArgsConstructor
    private static class School {
        int stuCnt;
        String schoolName;
    }
}
