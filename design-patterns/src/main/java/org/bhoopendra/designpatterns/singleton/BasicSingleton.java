package org.bhoopendra.designpatterns.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private static final BasicSingleton BASIC_SINGLETON = new BasicSingleton();

    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        return BASIC_SINGLETON;
    }

    public Object readResolve() {
        return BASIC_SINGLETON;
    }
}
