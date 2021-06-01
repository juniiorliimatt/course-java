package curso.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise07 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        Locale.setDefault(Locale.US);
        var scan = new Scanner(System.in);
        log.info("Digite dois valores: ");

        var x = scan.nextDouble();
        var y = scan.nextDouble();

        if (x == 0.0 && y == 0.0) {
            log.info("Origem");
        } else if (x > 0.0 && y > 0.0) {
            log.info("1° quadrante");
        } else if (x < 0.0 && y > 0.0) {
            log.info("2° quadrante");
        } else if (x < 0.0 && y < 0.0) {
            log.info("3° quadrante");
        } else if (x > 0.0 && y < 0.0) {
            log.info("4° quadrante");
        } else {
            log.info("Fora do intervalo");
        }
        scan.close();
    }
}
