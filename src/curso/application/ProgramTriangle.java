package curso.application;

import curso.entities.Triangle;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramTriangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(ProgramTriangle.class.getName());
        var df = new DecimalFormat("0.##");
        var sc = new Scanner(System.in);

        log.info("Enter the measures of triangle X: ");
        var x = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        log.info("Enter the measures of triangle Y: ");
        var y = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        double areaX = x.getArea();
        double areaY = y.getArea();

        var resultX = "Triangule X area: " + df.format(areaX);
        var resultY = "Triangule Y area: " + df.format(areaY);

        log.info(resultX);
        log.info(resultY);

        if (areaX > areaY) {
            log.info("Larger area: X");
        } else {
            log.info("Larger area Y");
        }

        sc.close();
    }
}
