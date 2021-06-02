package curso.exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise07 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        var scan = new Scanner(System.in);
        var quadrant = defineQuadrant(scan, log);
        log.info(quadrant);
        scan.close();
    }

    public static String defineQuadrant(Scanner scan, Logger log) {

        Locale.setDefault(Locale.US);

        log.info("Digite dois valores: ");

        var x = scan.nextDouble();
        var y = scan.nextDouble();

        if (x == 0.0 && y == 0.0) {
            return "Origem";
        } else if (x > 0.0 && y > 0.0) {
            return "1° quadrante";
        } else if (x < 0.0 && y > 0.0) {
            return "2° quadrante";
        } else if (x < 0.0 && y < 0.0) {
            return "3° quadrante";
        } else if (x > 0.0 && y < 0.0) {
            return "4° quadrante";
        } else {
            return null;
        }
    }
}
