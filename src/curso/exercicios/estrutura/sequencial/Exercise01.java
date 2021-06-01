package curso.exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Exercícios sobre Estrutura Sequencial (entrada, processamento, saída)
 *
 * @author Junior
 * @since 19/05/2021
 */
public class Exercise01 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        var scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        log.info("Digite dois valores: ");

        var numeroUm = scan.nextInt();
        var numeroDois = scan.nextInt();
        var result = "SOMA = " + (numeroUm + numeroDois);

        log.info(result);
    }
}
