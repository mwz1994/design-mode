package design.mode.decorator.simple;

public class DecoratorMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        DecoratorShape decoratorCircle = new DecoratorShape(c);
        DecoratorShape decoratorRectangle = new DecoratorShape(r);
        RedDecoratorShape redDecoratorShape = new RedDecoratorShape(c);
        decoratorCircle.draw();
        decoratorRectangle.draw();
        redDecoratorShape.draw();
    }
}
