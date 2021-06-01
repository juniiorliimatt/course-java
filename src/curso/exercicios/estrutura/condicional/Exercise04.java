package curso.exercicios.estrutura.condicional;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise04 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        var scan = new Scanner(System.in);

        log.info("Digite dois números entre 0 e 23 separados por um espaço, que representam a hora inicial e a hora " +
                "final de uma " +
                "partida.");
        var hourInitial = scan.nextInt();
        var hourFinal = scan.nextInt();
        var duration = 0;

        if (hourInitial > hourFinal) {
            duration = 24 - hourInitial + hourFinal;
        } else {
            duration = hourFinal - hourInitial;
        }
        var hours = "O Jogo durou " + duration + " hora(s)";
        log.info(hours);
        scan.close();
    }
}
