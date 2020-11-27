package design.mode.reactivex.function;

import java.util.function.Function;

public class FuncMain {

    private static FuncSS produce() {
        return s -> s.toLowerCase();
    }

    interface FuncSS extends Function<String,String> {}

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("FUNCTION"));
    }
}

