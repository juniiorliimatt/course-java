package curso.exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.logging.Logger;

/**
 * Exercícios sobre Estrutura Sequencial (entrada, processamento, saída)
 * 
 * @author Junior
 * @since 19/05/2021
 */
public class ExercicioFixacao001 {

	public static void main(String[] args) {
		final var log = Logger.getLogger(ExercicioFixacao001.class.getName());
		Locale.setDefault(Locale.US);
		var produto1 = "Computer";
		var produto2 = "Office desk";

		var age = 30;
		var code = 5290;
		var gender = 'F';

		var price1 = 2100.0;
		var price2 = 650.50;
		var measure = 53.234567;

		log.info("Produtos: ");

		var p = "\n" + produto1 + "which price is $ " + price1 + "\n";
		log.info(p);

		var p2 = "\n" + produto2 + "which price is $ " + price2 + "\n";
		log.info(p2);

		var dados = "Record: " + age + ", years old, code: " + code + ", and gender: " + gender + "\n";
		log.info(dados);

		var me = "Measuue with eight decimal places: " + measure + "\n";
		log.info(me);

		var rounded = "Rouded (three decimal places): " + measure + "\n";
		log.info(rounded);

		var usDecimal = "US decimal point: " + measure + "\n";
		log.info(usDecimal);
	}
}
