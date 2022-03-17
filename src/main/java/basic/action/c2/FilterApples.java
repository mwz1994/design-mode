package basic.action.c2;

import basic.action.c1.Apple;
import basic.action.c1.Color;

import java.util.ArrayList;
import java.util.List;

public class FilterApples {

    public static void main(String[] args) {
        List<Apple> inventory = List.of(new Apple(Color.GREEN,80),new Apple(Color.GREEN,155),new Apple(Color.RED,120));

        List<Apple> heavyApples = filterApples(inventory,new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory,new AppleGreenColorPredicate());
        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals(Color.RED);
            }
        });

        System.out.println("heavy apples : "+heavyApples.toString());
        System.out.println("green apples : "+greenApples.toString());
        System.out.println("red apples : "+redApples.toString());
    }

    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
