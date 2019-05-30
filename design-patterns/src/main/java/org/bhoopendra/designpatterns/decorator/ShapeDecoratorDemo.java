package org.bhoopendra.designpatterns.decorator;

public class ShapeDecoratorDemo {
    public static void main(String[] args) {
        ColoredShape<Square> blueSquare = new ColoredShape<>(() -> new Square(20),"Blue");
        System.out.println(blueSquare.getInfo());

        TransParentShape<ColoredShape<Square>> customizedSquare = new TransParentShape<>(() -> new ColoredShape<>(() -> new Square(40), "Yello"), 60);
        System.out.println(customizedSquare.getInfo());
    }
}
