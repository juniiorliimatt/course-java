package curso.estrutura.sequencial;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bhaskara {

	public static void main(String[] args) {
		final var logger = Logger.getLogger(Bhaskara.class.getName());

		double delta;
		double a = 2;
		double b = -16;
		double c = -18;
		double x1;
		double x2;

		delta = Math.pow(b, 2.0) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		var result = "Valor de X1: " + x1 + ", Valor de X2: " + x2;
		logger.log(Level.INFO, result);
	}
}
