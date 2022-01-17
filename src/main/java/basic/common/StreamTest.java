package basic.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/10 10:37
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Msg> boxs = new ArrayList<>();
        Msg msg1 = new Msg(1,"a");
        Msg msg2 = new Msg(2,"b");
        Msg msg3 = new Msg(3,"c");
        Msg msg4 = new Msg(4,"d");
        Msg msg5 = new Msg(5,"e");

        boxs.add(msg1);
        boxs.add(msg2);
        boxs.add(msg3);
        boxs.add(msg4);
        boxs.add(msg5);


        Map<String,Msg> maps = boxs.stream().collect(Collectors.toMap(Msg::getSubject, Function.identity()));

        System.out.println("maps "+maps);
    }
}
