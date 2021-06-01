package curso.exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise04 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise04.class.getName());
        var scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        log.info("Digite seu número: ");
        var numerofuncionario = scan.nextInt();

        log.info("Digite a quantidade de horas trabalhadas: ");
        var horasTrabalhadas = scan.nextInt();

        log.info("Digite o valor da sua hora: ");
        var valorHoraTrabalhada = scan.nextDouble();

        var salario = valorHoraTrabalhada * horasTrabalhadas;
        var imprimeFuncionario = "NUMBER = " + numerofuncionario + ", U$ " + salario;

        log.info(imprimeFuncionario);
    }
}
