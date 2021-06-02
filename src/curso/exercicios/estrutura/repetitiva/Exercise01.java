package curso.exercicios.estrutura.repetitiva;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise01 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());

        var pwd = password(log);
        while (pwd != 2002) {
            pwd = password(log);
        }
        log.info("Acesso permitido");
    }

    private static int password(Logger log) {
        log.info("Digite a senha:");
        return new Scanner(System.in).nextInt();
    }
}
