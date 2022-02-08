package basic.common.stream;

import basic.common.Msg;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/28 15:39
 */
public class StreamDemo {
    public static void main(String[] args) {
//        printDemo();
//        printSquaresList();
//        filterElements();
//        sortElement();
//        parallel();
        IntSumStatistics();
    }

    private static void IntSumStatistics() {
        List<Integer> numbers = Arrays.asList(3,2,3,4,7,5,6,7,5);

        var stats = numbers.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("max "+ stats.getMax());
        System.out.println("min "+ stats.getMin());
        System.out.println("avg "+stats.getAverage());
        System.out.println("sum "+stats.getSum());
        System.out.println("count "+stats.getCount());
    }

    private static void parallel() {
        List<String> strings = Arrays.asList("abc","","bc","efg","","jkl");

        long cnt = strings.parallelStream().filter(s -> s.isEmpty()).count();

        System.out.println("blank cnt "+cnt);
    }

    private static void sortElement() {
        List<Msg> boxs = new ArrayList<>();
        Msg msg1 = new Msg(6,"a");
        Msg msg2 = new Msg(2,"b");
        Msg msg3 = new Msg(8,"c");
        Msg msg4 = new Msg(1,"d");
        Msg msg5 = new Msg(5,"e");

        boxs.add(msg1);
        boxs.add(msg2);
        boxs.add(msg3);
        boxs.add(msg4);
        boxs.add(msg5);
        var result = boxs.stream().sorted(Comparator.comparing(Msg::getId).reversed()).collect(Collectors.toList());

        result.stream().forEach(System.out::println);
    }


    private static void filterElements() {
        List<String>strings = Arrays.asList("abc", "", "  ","bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.stream().filter(string -> !string.isBlank()).count();

        System.out.println("not blank count "+count);
    }

    private static void printSquaresList() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

        System.out.println("squaresList "+ squaresList);
    }

    private static void printDemo() {
        Random random = new Random(10);
        random.ints().limit(10).forEach(System.out::println);
    }
}
