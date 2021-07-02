package curso.services;

import curso.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
  public double filteredSum(List<Product> list, Predicate<Product> criteria) {
    var sum = 0.0;
    for (Product p : list) {
      if (criteria.test(p)) sum += p.getPrice();
    }
    return sum;
  }
}
