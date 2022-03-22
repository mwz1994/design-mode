package basic.action.c3;

import java.util.List;
import java.util.function.BiPredicate;

public class MethodReference {
    public void refactor(){
        List<String> str = List.of("a","b","c","d");

        String s = "asdf";

        BiPredicate<List<String>,String> contains = (List::contains);

        System.out.println("contains is "+ contains.test(str,s));

        BiPredicate<List<String>,String> isContain = (List<String> list,String item) -> list.contains(item);

        System.out.println("is contain is "+ isContain.test(str,s));

    }
}

class MethodReferenceMain{
    public static void main(String[] args) {
        MethodReference reference = new MethodReference();

        reference.refactor();
    }
}
