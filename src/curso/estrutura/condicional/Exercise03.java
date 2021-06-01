package curso.estrutura.condicional;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise03 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        var scan = new Scanner(System.in);
        log.info("Digite dois números separados por um espaço:");
        var numeroUm = scan.nextInt();
        var numeroDois = scan.nextInt();

        if(numeroUm % numeroDois == 0 || numeroDois % numeroUm == 0) {
            log.info("São Múltiplos");
        } else {
            log.info("Não são Múltiplos");
        }

        scan.close();
    }
}
