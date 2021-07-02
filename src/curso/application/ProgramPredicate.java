package curso.application;

import curso.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProgramPredicate {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    System.out.println("Reference method static");
    list.removeIf(Product::staticProductPredicate);
    list.forEach(p -> System.out.println(p.toString()));

    System.out.println("Reference method non static");
    list.removeIf(Product::nonStaticProductPredicate);
    list.forEach(p -> System.out.println(p.toString()));

    System.out.println("Expression lambda declared");
    Predicate<Product> pred = p -> p.getPrice() >= 100.0;
    list.removeIf(pred);

    System.out.println("Expression lambda inline");
    list.removeIf(p -> p.getPrice() >= 100.0);

  }
}
