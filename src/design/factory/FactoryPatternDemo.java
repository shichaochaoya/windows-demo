package design.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactoery shapeFactoery = new ShapeFactoery();

        Shape shape1 = shapeFactoery.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactoery.getShape("SQUARE");
        shape2.draw();
    }
}
