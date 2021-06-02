package curso.main;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Main.class.getName());
        var scan = getScanner().next();




        log.info(scan);

        getScanner().close();
    }

    public static Scanner getScanner(){

        return new Scanner(System.in);
    }

    public static String sumNumbersWhileDiferenteZero(Scanner scan, Logger log) {
        int number = getNumber(scan, log);
        var sum = 0;

        while (number != 0) {
            number = getNumber(scan, log);
            sum += number;
        }

        return "Soma:" + sum;
    }

    public static int getNumber(Scanner scan, Logger log) {
        log.info("Digite um número:");
        return scan.nextInt();
    }

    public static void functionOnt() {
        final var log = Logger.getLogger(Main.class.getName());
        Locale.setDefault(Locale.US);
        var df = new DecimalFormat("##.00");

        var y = "" + 32;
        log.info(y);

        var x = 10.35784;
        var message = df.format(x);
        log.info(message);

        message = "RESULTADO " + x + " METROS.\n\n";
        log.info(message);

        message = "RESULTADO " + df.format(x) + " METROS.\n\n";
        log.info(message);

        var nome = "Maria";
        var idade = 31;
        var salario = 4000.0;

        df = new DecimalFormat("#.###");
        message = "" + nome + " tem " + idade + " anos e ganha " + df.format(salario) + " reais.\n\n";
        log.info(message);
    }

}
