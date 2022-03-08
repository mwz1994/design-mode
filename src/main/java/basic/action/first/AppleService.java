package basic.action.first;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Slf4j
public class AppleService {

//    public static boolean isGreenApple(Apple apple){
//        return apple.getColor().equals(Color.GREEN);
//    }
//
//    public static boolean isHeavyApple(Apple apple){
//        return apple.getWeight() > 150 ;
//    }

    static List<Apple> filterApples(List<Apple> apples,Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples){
            if (p.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }

//    public static List<Apple> filterColor(List<Apple> apples){
//        return filterApples(apples,AppleService::isGreenApple);
//    }
//
//    public static List<Apple> filterWeight(List<Apple> apples){
//        return filterApples(apples,AppleService::isHeavyApple);
//    }

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        for (int i=145;i<160;i++){
            Apple apple = new Apple();
            if (i % 2 == 0){
                apple.setColor(Color.GREEN);
            }else {
                apple.setColor(Color.RED);
            }
            apple.setWeight(i);
            apples.add(apple);
        }

//        for (Apple apple : filterColor(apples)){
//            System.out.println("filter color --->  apple color " + apple.getColor() + " weight " + apple.getWeight());
//        }
//
//
//        for (Apple apple : filterWeight(apples)){
//            System.out.println("filter weight --->  apple color " + apple.getColor() + " weight " + apple.getWeight());
//        }

        for (Apple apple : filterApples(apples,(Apple a) -> a.getColor().equals(Color.GREEN))){
            System.out.println("filter color --->  apple color " + apple.getColor() + " weight " + apple.getWeight());
        }

        for (Apple apple : filterApples(apples,(Apple a) -> a.getWeight() > 150)){
            System.out.println("filter weight --->  apple color " + apple.getColor() + " weight " + apple.getWeight());
        }

    }
}
