package design.abstract_factory;

import design.factory.Shape;

public class Rectangle implements AbstractShape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle :: draw().method.");
    }
}
