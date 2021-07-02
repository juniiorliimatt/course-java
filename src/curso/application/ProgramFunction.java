package curso.application;

import curso.entities.Product;
import curso.util.ProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramFunction {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    List<String> names;
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    names = list.stream().map(new ProductFunction()).collect(Collectors.toList());
    names.forEach(System.out::println);

    names = list.stream().map(Product::staticToUpperCase).collect(Collectors.toList());
    names.forEach(System.out::println);

    names = list.stream().map(Product::nonStaticToUpperCase).collect(Collectors.toList());
    names.forEach(System.out::println);

    Function<Product, String> func = p -> p.getName().toUpperCase();
    list.stream().map(func).collect(Collectors.toList()).forEach(System.out::println);

    list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
  }
}
