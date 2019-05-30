package org.bhoopendra.designpatterns.decorator;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> constructor, String color) {
        this.shape = constructor.get();
        this.color = color;
    }

    @Override
    public String getInfo() {
        return shape.getInfo() + " has the color " + color;
    }
}
