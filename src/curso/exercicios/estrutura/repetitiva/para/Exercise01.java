package curso.exercicios.estrutura.repetitiva.para;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise01 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        log.info("Digite um valor, verificarei todos os números impares de 0 " +
                "até o valor digitado.");
        var scan = new Scanner(System.in).nextInt();

        for(var i = 0; i <= scan; i++){
            var impar = "" + i;
            if(i%2!=0) log.info(impar);
        }
    }
}
