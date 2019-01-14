package design.abstract_factory;



public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractShape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();

        AbstractShape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1=colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();
    }
}
