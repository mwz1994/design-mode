package design.mode.decorator.coffee;

public class EspressoCoffee extends Beverage {
    @Override
    public double cost() {
        return 0.99;
    }

    public String getDescription(){
        return "espresso coffee ";
    }
}
