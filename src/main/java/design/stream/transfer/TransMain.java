package design.stream.transfer;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Stream;

public class TransMain {

    public static void main(String[] args) {
        Set<String> set = Set.of("lilei","hanmeimei","michael","kangkang","jane","liulei");

        Stream<String> stream = set.stream();

        stream.filter(s -> s.length()>4).peek(s-> handle(s)).map(s -> s+":"+s).sorted(Comparator.comparing(String::length).reversed()).forEach(s-> System.out.println("trans result : "+s));
    }

    private static void handle(String s) {
        System.out.println("here is peek func:"+s);
    }
}
