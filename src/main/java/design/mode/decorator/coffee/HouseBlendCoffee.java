package design.mode.decorator.coffee;

public class HouseBlendCoffee extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    public String getDescription(){
        return "house blend coffee";
    }
}
