package curso.application;

import curso.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(ProgramRectangle.class.getName());
        var sc = new Scanner(System.in);

        log.info("Enter rectangle width and height:");
        var rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());

        var r = rectangle.toString();
        log.info(r);

        sc.close();
    }
}
