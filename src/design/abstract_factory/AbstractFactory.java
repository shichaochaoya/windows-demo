package design.abstract_factory;


public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract AbstractShape getShape(String shape);
}
