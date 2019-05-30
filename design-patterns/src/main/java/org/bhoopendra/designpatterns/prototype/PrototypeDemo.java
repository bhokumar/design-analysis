package org.bhoopendra.designpatterns.prototype;


import org.springframework.util.SerializationUtils;

public class PrototypeDemo {
    public static void main(String[] args) throws Exception {
        Person john = new Person(new String[] {"John", "Smith"}, new Address("London Road", "123"));

        Person jane = (Person) john.clone();

        jane.names[0] = "Jane";
        jane.address.setHouseNumber("543");

        System.out.println(john);
        System.out.println(jane);

        Foo foo = new Foo("bhoopendra", 24);
        byte[] b = SerializationUtils.serialize(foo);
        Foo foo2 = (Foo) SerializationUtils.deserialize(b);

        System.out.println(foo);
        foo2.setName("Alka");

        System.out.println(foo2);
    }
}
