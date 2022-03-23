package basic.action.c4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishDemo {

    public void demo(){
        List<String> threeHighCalDishNames = Menu.MENU.parallelStream().filter(dish->dish.getCalories()>300).map(Dish::getName).limit(3).collect(Collectors.toList());
        System.out.println("limit 3 cal dish "+threeHighCalDishNames.toString());


        List<String> topThreeHighCalDishNames = Menu.MENU.parallelStream().filter(dish->dish.getCalories()>300).sorted(Comparator.comparing(Dish::getCalories).reversed()).map(Dish::getName).limit(3).collect(Collectors.toList());
        System.out.println("top 3 cal dish "+topThreeHighCalDishNames.toString());

        var iter = Menu.MENU.iterator();
        while (iter.hasNext()){
            System.out.println("dish is "+ iter.next());
        }
    }

    public void detailStream(){
        List<String> detailStream = Menu.MENU.stream().filter(
                dish->{
                    System.out.println("filtering: "+dish.getName());
                    return dish.getCalories()>400;
                }
        ).map(dish -> {
            System.out.println("mapping: "+dish.getName());
            return dish.getName();
        }).limit(3).collect(Collectors.toList());
        System.out.println("limit 3 cal dish "+detailStream.toString());
    }

    public void printAll(){
        Menu.MENU.stream().forEach(System.out::println);
    }
    public void printDistinct(){
        Menu.MENU.stream().distinct().forEach(System.out::println);
    }
}


class DishMain{
    public static void main(String[] args) {
        DishDemo dishDemo = new DishDemo();
//        dishDemo.demo();
//        dishDemo.printAll();
        dishDemo.printDistinct();
        System.out.println("===================");
        dishDemo.printAll();
//        dishDemo.detailStream();
    }
}