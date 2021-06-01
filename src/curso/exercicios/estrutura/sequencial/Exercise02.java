package curso.exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise02 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise02.class.getName());
        var scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        log.info("Digite o valor do raio: ");

        var raio = scan.nextDouble();
        var area = "A = %.4f" + Math.PI * (Math.pow(raio, 2));

        log.info(area);
    }
}
