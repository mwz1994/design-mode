package design.mode.decorator.coffee;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    Mocha(Beverage source){
        this.beverage=source;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" mix mocha ,";
    }

    @Override
    public double cost() {
        return beverage.cost()+2.99;
    }
}
