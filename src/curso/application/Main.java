package curso.application;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Main.class.getName());
        log.info("Digite um numero para a contagem.");
        var scan = getScanner().nextInt();

        var tempo = System.currentTimeMillis();
        for (var i = 0; i < scan; i++) {
            var msg = "" + i;
            log.info(msg);
        }
        tempo = ((System.currentTimeMillis()) - tempo) / 1000;
        var t =
                "" + tempo + " segundos" + ", instruções por segundo: " + (scan / tempo);

        log.info(t);

        getScanner().close();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
