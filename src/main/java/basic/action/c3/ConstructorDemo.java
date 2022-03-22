package basic.action.c3;

import basic.action.c1.Apple;
import basic.action.c1.Lunch;
import basic.action.c1.Mongo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorDemo {

    public void Demo(){

        // 无参构造函数
        Supplier<Apple> c1 = Apple::new;
        Apple a1 = c1.get();

        // 有参构造函数
        Function<Integer, Mongo> f1 =Mongo::new;
        Mongo m1 = f1.apply(100);

        System.out.println("a1 is "+a1.toString());
        System.out.println("m1 is "+m1.toString());

    }

    public void BatchMongo(){
        List<Integer> weights = Arrays.asList(7,3,4,5,6,10);

        List<Mongo> mongos = mapMongos(weights,Mongo::new);

        System.out.println("mongos is "+ mongos.toString());
    }

    private List<Mongo> mapMongos(List<Integer> weights, Function<Integer,Mongo> f) {
        List<Mongo> mongos = new ArrayList<>();
        for (Integer w : weights){
            Mongo mongo = f.apply(w);
            mongos.add(mongo);
        }
        return mongos;
    }

    public void LunchDemo(){
        TriFunction<String,Double, LocalDateTime,Lunch> triFunction = Lunch::new;

        var lunch = triFunction.apply("meituan",29.8,LocalDateTime.of(2022,3,22,12,23));

        System.out.println("lunch is "+lunch.toString());
    }
}

class ConstructorMain{
    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo();
//        demo.Demo();
//        demo.BatchMongo();
        demo.LunchDemo();
    }
}
