package curso.estrutura.condicional;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise01 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        var scan = new Scanner(System.in);
        log.info("Digite um número NEGATIVO ou POSITIVO: ");
        var numero = scan.nextInt();
        if(numero > 0){
            log.info("POSITIVO");
        } else {
            log.info("NEGATIVO");
        }

        scan.close();
    }
}
