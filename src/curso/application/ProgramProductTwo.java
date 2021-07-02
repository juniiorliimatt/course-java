package curso.application;

import curso.entities.Product;
import curso.util.MyComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramProductTwo {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.00));
    list.add(new Product("Notebook", 1200.00));
    list.add(new Product("Tablet", 450.00));

    System.out.println("\nFirst model of comparator(class extern)");
    list.sort(new MyComparator());
    for (Product p : list) {
      System.out.println(p.toString());
    }

    System.out.println("\nSecond model of comparator(class anonymous)");
    Comparator<Product> comp = new Comparator<>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
      }
    };
    list.sort(comp);
    for (Product p : list) {
      System.out.println(p.toString());
    }

    System.out.println("\nThird model of comparator(function anonymous");
    Comparator<Product> compLambda = (p1, p2) -> {
      return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    };
    list.sort(compLambda);
    for (Product p : list) {
      System.out.println(p.toString());
    }

    System.out.println("\nFourth model of comparator(lambda)");
    list.sort((p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
    list.forEach(p -> System.out.println(p.toString()));
  }
}
