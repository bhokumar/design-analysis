package org.bhoopendra.designpatterns.singleton;

import org.springframework.util.SerializationUtils;

public class SingletonDemo {
    public static void main(String [] args) {
        BasicSingleton obj = BasicSingleton.getInstance();

        byte[] bytes = SerializationUtils.serialize(obj);

        BasicSingleton obj2 = (BasicSingleton) SerializationUtils.deserialize(bytes);

        System.out.println(obj == obj2);
    }
}
