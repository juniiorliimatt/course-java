package curso.exercicios.estrutura.sequencial;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class EntradaDados {

	public static void main(String[] args) {
		final var log = Logger.getLogger(EntradaDados.class.getName());
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		try {
			var message = "você digitou: " + sc.nextDouble();
			log.info(message);
		} catch (InputMismatchException e) {
			log.info("Digitou errado");
		}

		sc.close();
	}
}
