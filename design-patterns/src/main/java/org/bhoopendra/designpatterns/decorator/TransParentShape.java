package org.bhoopendra.designpatterns.decorator;

import java.util.function.Supplier;

public class TransParentShape<T extends Shape> implements Shape {
    private Shape shape;
    private int transparency;

    public TransParentShape(Supplier<? extends T> constructor, int transparency) {
        this.shape = constructor.get();
        this.transparency = transparency;
    }

    @Override
    public String getInfo() {
        return shape.getInfo() + " with transparency " + transparency + "%";
    }
}
