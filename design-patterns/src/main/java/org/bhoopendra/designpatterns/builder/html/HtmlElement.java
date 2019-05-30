package org.bhoopendra.designpatterns.builder.html;

import java.util.ArrayList;

public class HtmlElement {
    public String name, text;

    public ArrayList<HtmlElement> elements = new ArrayList<>();

    private final int indentSize = 2;

    private final String newLine = System.lineSeparator();

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }
}
