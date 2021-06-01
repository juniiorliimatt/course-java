package curso.exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise03 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise03.class.getName());
        var scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        log.info("Digite quatro valores inteiros:");

        var a = scan.nextInt();
        var b = scan.nextInt();
        var c = scan.nextInt();
        var d = scan.nextInt();

        var diferenca = "DIFERENÇA = " + calcula(a, b, c, d);

        log.info(diferenca);
    }

    private static int calcula(int a, int b, int c, int d) {
        return a * b - c * d;
    }
}
