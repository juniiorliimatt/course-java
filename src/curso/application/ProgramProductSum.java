package curso.application;

import curso.entities.Product;
import curso.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramProductSum {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    ProductService ps = new ProductService();
    var sum = ps.filteredSum(list, p -> p.getPrice() < 100);

    System.out.println("Sum = " + String.format("%.2f", sum));

  }
}
