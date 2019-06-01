package org.bhoopendra.designpatterns.facade;

public class Buffer {
    private char [] characters;
    private int lineWidth;

    public Buffer(int lineHeight, int lineWidth) {
        this.characters = new char[lineHeight*lineWidth];
        this.lineWidth = lineWidth;
    }

    public char charAt(int x, int y) {
        return characters[y*lineWidth+1];
    }


}
