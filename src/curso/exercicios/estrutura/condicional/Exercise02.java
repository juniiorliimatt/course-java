package curso.exercicios.estrutura.condicional;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise02 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        var scan = new Scanner(System.in);
        log.info("Digite um número: ");
        var numero = scan.nextInt();

        if ((numero % 2 == 0)) {
            log.info("PAR");
        } else {
            log.info("IMPAR");
        }

        scan.close();
    }
}
