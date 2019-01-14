package design.abstract_factory;

import design.factory.Shape;

public class Circle implements AbstractShape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw.method.");
    }
}
