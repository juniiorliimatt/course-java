package curso.main;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
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
