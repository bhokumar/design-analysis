package org.bhoopendra.designpatterns.decorator;

public class MagicStringDemo {
    public static void main(String[] args) {
        MagicString hello = new MagicString("Hello");
        System.out.println(hello.getNumberOfVowels());
    }
}
