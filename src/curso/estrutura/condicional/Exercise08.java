package curso.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise08 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        Locale.setDefault(Locale.US);
        var scan = new Scanner(System.in);
        log.info("Digite seu salário:");
        var salary = scan.nextDouble();

        var tax = "";
        if (salary >= 0 && salary <= 2000.00) {
            log.info("Isento");
        } else if (salary > 2000.00 && salary <= 3000.00) {
            tax = "R$ " + (salary * 0.08);
            log.info(tax);
        } else if (salary > 3000.00 && salary <= 4500.00) {
            tax = "R$" + (salary * 0.18);
            log.info(tax);
        } else if (salary > 4500.00) {
            tax = "R$ " + (salary * 0.28);
            log.info(tax);
        }

        scan.close();
    }
}
