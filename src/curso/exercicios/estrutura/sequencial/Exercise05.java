package curso.exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise05 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise05.class.getName());
        var scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

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
}
