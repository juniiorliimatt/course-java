package curso.application;

import curso.entities.Triangle;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(Program.class.getName());
        var df = new DecimalFormat("0.##");
        var sc = new Scanner(System.in);


        log.info("Enter the measures of triangle X: ");
        var x = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        log.info("Enter the measures of triangle Y: ");
        var y = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        var p = (x.getA() + x.getB() + x.getC()) / 2.0;
        var areaX =
                Math.sqrt(p * (p - x.getA()) * (p - x.getB()) * (p - x.getC()));

        p = (y.getA() + y.getB() + y.getC()) / 2.0;
        var areaY =
                Math.sqrt(p * (p - y.getA()) * (p - y.getB()) * (p - y.getC()));

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
