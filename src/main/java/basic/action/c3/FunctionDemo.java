package basic.action.c3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> rs = new ArrayList<>();

        for (T t:list){
            R r = f.apply(t);
            rs.add(r);
        }

        return rs;
    }

    public void start(){
        var result = map(List.of("asdf","qqwerr","zx"),(String str) -> str.length());

        for (Integer i : result){
            System.out.println("result i is "+ i);
        }
    }

}

class FunctionMain{
    public static void main(String[] args) {
        FunctionDemo demo = new FunctionDemo();
        demo.start();
    }
}
