package org.bhoopendra.designpatterns.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a pixels for a circle "+ radius);
    }
}
