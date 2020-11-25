package design.mode.decorator.simple;

public class DecoratorShape implements Shape {

    Shape decoratorShape;

    DecoratorShape(Shape shape){
        this.decoratorShape = shape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }

}
