package design.abstract_factory;

import design.factory.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public  AbstractShape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }


}
