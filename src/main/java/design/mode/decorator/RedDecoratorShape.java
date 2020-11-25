package design.mode.decorator;

public class RedDecoratorShape extends DecoratorShape {

    RedDecoratorShape(Shape shape) {
        super(shape);
    }

    public void draw(){
        super.draw();
        System.out.println("draw red decorator shape");
    }
}
