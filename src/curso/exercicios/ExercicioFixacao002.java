package curso.exercicios;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Exercícios sobre Estrutura Sequencial (entrada, processamento, saída)
 * 
 * @author Junior
 * @since 19/05/2021
 */
public class ExercicioFixacao002 {

	public static void main(String[] args) {
		final var log = Logger.getLogger(ExercicioFixacao002.class.getName());
		var scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		exercicioSeis(scan, log);

		scan.close();
	}

	public static void exercicioUm(Scanner scan, Logger log) {
		log.info("Digite dois valores: ");

		var numeroUm = scan.nextInt();
		var numeroDois = scan.nextInt();
		var result = "SOMA = " + (numeroUm + numeroDois);

		log.info(result);
	}

	public static void exercicioDois(Scanner scan, Logger log) {
		log.info("Digite o valor do raio: ");

		var raio = scan.nextDouble();
		var area = "A = %.4f" + Math.PI * (Math.pow(raio, 2));

		log.info(area);
	}

	public static void exercicioTres(Scanner scan, Logger log) {
		log.info("Digite quatro valores inteiros:");

		var a = scan.nextInt();
		var b = scan.nextInt();
		var c = scan.nextInt();
		var d = scan.nextInt();

		var diferenca = "DIFERENÇA = " + calcula(a, b, c, d);

		log.info(diferenca);
	}

	private static int calcula(int a, int b, int c, int d) {
		return a * b - c * d;
	}

	public static void exercicioQuatro(Scanner scan, Logger log) {
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

	public static void exercicioCinco(Scanner scan, Logger log) {
		log.info("Digite o código da peça, a quantidade e o preço.");
		var codigoPecaUm = scan.nextInt();
		var quantidadePecasUm = scan.nextInt();
		var precoPecaUm = scan.nextDouble();
		var valorASerPago = 0.0;

		valorASerPago += (quantidadePecasUm * precoPecaUm);
		var item1 = "\nPeça 1: " + codigoPecaUm + ", Quantidade: " + quantidadePecasUm + ", Preço: " + precoPecaUm
				+ ", Total R$ " + valorASerPago;

		log.info("Digite o código da peça, a quantidade e o preço.");
		var codigoPecaDois = scan.nextInt();
		var quantidadePecasDois = scan.nextInt();
		var precoPecaDois = scan.nextDouble();

		valorASerPago += quantidadePecasDois * precoPecaDois;
		var item2 = "\nPeça 2: " + codigoPecaDois + ", Quantidade: " + quantidadePecasDois + ", Preço: " + precoPecaDois
				+ ", Total R$ " + valorASerPago;

		var valor = "\nVALOR A PAGAR: R$" + valorASerPago + ", Peças: " + codigoPecaUm + ", " + codigoPecaDois;

		log.info(item1);
		log.info(item2);
		log.info(valor);

	}

	public static void exercicioSeis(Scanner scan, Logger log) {
		log.info("Digite 3 valores separados por um espaço.");
		var a = scan.nextDouble();
		var b = scan.nextDouble();
		var c = scan.nextDouble();

		var calculo = "TRIANGULO: " + (a * c) / 2 + "\n\n";
		log.info(calculo);

		calculo = "CIRCULO: " + Math.PI * (Math.pow(c, 2)) + "\n\n";
		log.info(calculo);

		calculo = "TRAPEZIO: " + ((a + b) / 2) * c + "\n\n";
		log.info(calculo);

		calculo = "QUADRADO: " + Math.pow(b, 2) + "\n\n";
		log.info(calculo);

		calculo = "RETANGULO: " + a * b + "\n\n";
		log.info(calculo);
	}
}