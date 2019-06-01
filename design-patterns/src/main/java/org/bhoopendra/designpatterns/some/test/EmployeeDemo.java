package org.bhoopendra.designpatterns.some.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("bhoopendra", 25);
        Employee employee2 = new Employee("bhoopendra", 26);

        List<Employee> employees = Arrays.asList(employee1, employee2);
        //Collections.sort();
    }
}
