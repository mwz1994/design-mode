package basic.action.c3;

import java.util.function.Function;

public class ComparatorDemo {

    public void function(){

        Function<Integer,Integer> fx = x->x+1;
        Function<Integer,Integer> gx = x->x*x;

        Function<Integer,Integer> h = fx.andThen(gx);


        Function<Integer,Integer> c = fx.compose(gx);



        System.out.println("h result is "+h.apply(1));


        System.out.println("c result is "+c.apply(1));

    }


    public void exec(){

        DoubleFunction<Double> function = d->functionx(d);

        double result = cal(function,7D,10D);

        System.out.println("result is "+result);
    }

    private Double functionx(Double d) {
        return d+10;
    }

    public double cal(DoubleFunction<Double> f, double left , double right){

        return (f.apply(left)+f.apply(right))*(right-left) / 2;

    }

}

class ComparatorMain{
    public static void main(String[] args) {
        ComparatorDemo demo = new ComparatorDemo();
        demo.exec();
    }
}
