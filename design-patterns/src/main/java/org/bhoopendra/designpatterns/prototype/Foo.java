package org.bhoopendra.designpatterns.prototype;

import java.io.Serializable;

public class Foo implements Serializable {
    private String name;
    private int age;

    public Foo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}