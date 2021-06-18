package curso.application;

import curso.entities.Product;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(ProgramProduct.class.getName());
        var sc = new Scanner(System.in);

        log.info("Name:");
        var name = sc.nextLine();

        log.info("Price:");
        var price = sc.nextDouble();

        log.info("Quantity in stock:");
        var quantity = sc.nextInt();

        var product = new Product(name, price, quantity);
        var p = product.toString();
        log.info(p);

        log.info("Enter the number of products to be added in stock");
        product.addProducts(sc.nextInt());

        p = "Updated " +  product.toString();
        log.info(p);

        log.info("Enter the number of products to be removed in stock");
        product.removeProducts(sc.nextInt());

        p = "Updated " + product.toString();
        log.info(p);

        sc.close();
    }
}
