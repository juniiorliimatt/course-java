package curso.exercicios;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Exercícios sobre Estrutura Sequencial (entrada, processamento, saída)
 * 
 * @author Junior
 * @since 26/05/2021
 */
public class ExercicioFixacao003 {
  public static void main(String[] args) {
    final var log = Logger.getLogger(ExercicioFixacao003.class.getName());
    var scan = new Scanner(System.in);

    isNegative(scan, log);

    scan.close();
  }

  public static void isNegative(Scanner scan, Logger log) {

    log.info("Digite um número: ");
    var numero = scan.nextInt();

    if (numero > 0)
      log.info("NÃO NEGATIVO");
    if (numero < 0)
      log.info("NEGATIVO");
  }

  public static void isPar(Scanner scan, Logger log) {
    log.info("Digite um número, vamos verificar se é PAR ou IMPAR.");
    var numero = scan.nextInt();

    if (numero % 2 == 0)
      log.info("PAR");
    if (numero % 2 != 0)
      log.info("IMPAR");
  }

  public static void isMultiple(Scanner scan, Logger log) {
    log.info("Digite dois numeros separados por um espaço.");
    var numero = scan.nextInt();
    var numero2 = scan.nextInt();

    if (numero > numero2) {
      if (numero % numero2 == 0) {
        log.info("São Múltiplos");
      }
      if (numero % numero2 != 0) {
        log.info("Não São Multiplos");
      }
    }

    if (numero2 > numero) {
      if (numero2 % numero == 0) {
        log.info("São Múltiplos");
      }
      if (numero2 % numero != 0) {
        log.info("Não São Multiplos");
      }
    }
  }
}
