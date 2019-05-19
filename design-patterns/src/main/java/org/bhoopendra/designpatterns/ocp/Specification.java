package org.bhoopendra.designpatterns.ocp;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
