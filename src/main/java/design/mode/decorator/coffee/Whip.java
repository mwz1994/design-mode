package design.mode.decorator.coffee;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    Whip(Beverage source){
        this.beverage = source;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" mix whip ,";
    }

    @Override
    public double cost() {
        return beverage.cost()+4.99;
    }
}
