package curso.exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise06 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        Locale.setDefault(Locale.US);
        var scan = new Scanner(System.in);

        log.info("Digite um valor: ");
        var value = scan.nextDouble();

        if(value > 0 && value <= 25){
            log.info("Intervalo (0,25)");
        } else if( value > 25 && value <= 50){
            log.info("Intervalo (25,50)");
        } else if( value > 50 && value <= 75){
            log.info("Intervalo (50, 75)");
        } else if(value > 75 && value <= 100){
            log.info("Intervalo (75, 100)");
        } else {
            log.info("Fora do intervalo");
        }

        scan.close();
    }
}
