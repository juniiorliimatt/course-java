package curso.exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public class Exercise06 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise06.class.getName());
        var scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        log.info("Digite 3 valores separados por um espaço.");
        var a = scan.nextDouble();
        var b = scan.nextDouble();
        var c = scan.nextDouble();
        AtomicReference<String> calculo = new AtomicReference<>("");


        calculo.set("TRIANGULO: " + (a * c) / 2 + "\n\n");
        log.info(calculo.get());

        calculo.set("CIRCULO: " + Math.PI * (Math.pow(c, 2)) + "\n\n");
        log.info(calculo.get());

        calculo.set("TRAPÉZIO: " + ((a + b) / 2) * c + "\n\n");
        log.info(calculo.get());

        calculo.set("QUADRADO: " + Math.pow(b, 2) + "\n\n");
        log.info(calculo.get());

        calculo.set("RETÂNGULO: " + a * b + "\n\n");
        log.info(calculo.get());
    }
}
