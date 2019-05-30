package org.bhoopendra.designpatterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    private final static List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(1,1,10,10),
            new VectorRectangle(3, 3, 6, 6)
    ));

    public static void drawPoint(Point point) {

    }
    public static void main(String[] args) {

    }
}
