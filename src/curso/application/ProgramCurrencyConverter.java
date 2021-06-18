package curso.application;

import curso.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramCurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(ProgramCurrencyConverter.class.getName());
        var sc = new Scanner(System.in);

        log.info("What is the dollar price?");
        var price = sc.nextDouble();

        log.info("How manu dollars wil be bought?");
        var dollars = sc.nextDouble();

        var value = "Amount to be paid in reais = " + CurrencyConverter.calculate(price, dollars);
        log.info(value);

        sc.close();
    }
}
