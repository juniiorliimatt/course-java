package curso.estrutura.condicional;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise05 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise01.class.getName());
        var scan = new Scanner(System.in);
        log.info("Digite o código e a quantidade dos itens do pedido separados por um espaço: ");
        var code = scan.nextInt();
        var amount = scan.nextInt();
        var price = 0.0;
        switch (code) {
            case 1:
                price = amount * 4;
                break;
            case 2:
                price = amount * 4.50;
                break;
            case 3:
                price = amount * 5.00;
                break;
            case 4:
                price = amount * 2.00;
                break;
            case 5:
                price = amount * 1.50;
                break;
            default:
                log.info("Item inválido!");
        }
        var value = "Total: R$ " + price;
        log.info(value);

        scan.close();
    }
}
