package design.abstract_factory;

import design.factory.Shape;

public class Square implements AbstractShape{

    @Override
    public void draw() {
        System.out.println("Inside Square ::draw().method.");
    }
}
