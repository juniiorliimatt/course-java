package curso.exercicios.estrutura.repetitiva.enquanto;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise03 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise03.class.getName());
        var scan = new Scanner(System.in);

        var number = 0;
        var alcohol = 0;
        var gasolina = 0;
        var diesel = 0;
        while (number != 4) {
            log.info("\nDigite o tipo de combustível abastecido\n\n1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim\n");
            number = scan.nextInt();
            switch (number) {
                case 1:
                    alcohol++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:

            }
        }
        var result = "\nMUITO OBRIGADO!\nÁlcool: " + alcohol + "\nGasolina: " + gasolina + "\nDiesel: " + diesel;
        log.info(result);
        scan.close();
    }
}
