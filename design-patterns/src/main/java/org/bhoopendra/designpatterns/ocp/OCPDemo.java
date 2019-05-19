package org.bhoopendra.designpatterns.ocp;

import org.bhoopendra.designpatterns.ocp.non.ocp.ProductFilter;

import java.util.List;

public class OCPDemo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        pf.filterByColor(products, Color.GREEN).forEach(product -> System.out.println("Product : "+product.getName()+" is green"));


        System.out.println("*******************************New way of filtering***********************************");

        BetterFilter betterFilter = new BetterFilter();

        betterFilter.filter(products, new ColorSpecification(Color.RED)).forEach(product -> System.out.println(product.getName()));
        betterFilter.filter(products, new SizeSpecification(Size.LARGE)).forEach(product -> System.out.println(product.getName()));

        System.out.println("Combinator --> *************************");

        System.out.println("Large Blue items");

        betterFilter.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE))).forEach(item -> System.out.println(item.getName()));
    }
}
