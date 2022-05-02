package basic.action.c5;

import basic.action.c4.Dish;
import basic.action.c4.Menu;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WhileDemo {
    public void takeAndDrop(){
        List<Dish> orderTakes = Menu.MENU.stream().sorted(Comparator.comparing(Dish::getCalories)).takeWhile(dish -> dish.getCalories() < 320).collect(Collectors.toList());
        System.out.println("asc take while is "+orderTakes.toString());

        List<Dish> takes = Menu.MENU.stream().takeWhile(dish -> dish.getCalories() < 320).collect(Collectors.toList());
        System.out.println("take while is "+takes.toString());

        List<Dish> orderDrops = Menu.MENU.stream().sorted(Comparator.comparing(Dish::getCalories)).dropWhile(dish -> dish.getCalories()< 320).collect(Collectors.toList());
        System.out.println("asc drop while is "+orderDrops.toString());

        List<Dish> drops = Menu.MENU.stream().dropWhile(dish -> dish.getCalories()< 320).collect(Collectors.toList());
        System.out.println("drop while is "+drops.toString());
    }


}

class WhileMain{
    public static void main(String[] args) {
        WhileDemo demo = new WhileDemo();
        demo.takeAndDrop();
    }
}
