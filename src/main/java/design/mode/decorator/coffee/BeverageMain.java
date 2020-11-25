package design.mode.decorator.coffee;

public class BeverageMain {
    public static void main(String[] args) {

        EspressoCoffee espressoCoffee = new EspressoCoffee();

        Mocha mocha = new Mocha(espressoCoffee);

        Whip whip = new Whip(mocha);

        String desp = whip.getDescription();

        System.out.println("description : "+desp);
    }
}
