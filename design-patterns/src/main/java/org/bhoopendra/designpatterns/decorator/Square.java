package org.bhoopendra.designpatterns.decorator;

public class Square implements Shape {
    private long side;

    public Square(long side) {
        this.side = side;
    }

    @Override
    public String getInfo() {
        return "A square with side " + side;
    }
}
