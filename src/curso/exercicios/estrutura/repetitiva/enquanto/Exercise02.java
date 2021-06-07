package curso.exercicios.estrutura.repetitiva.enquanto;

import curso.exercicios.estrutura.condicional.Exercise07;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise02 {
    public static void main(String[] args) {
        final var log = Logger.getLogger(Exercise02.class.getName());
        var scan = new Scanner(System.in);
        var quadrant = Exercise07.defineQuadrant(scan, log);

        while (quadrant != null) {
            log.info(quadrant);
            quadrant = Exercise07.defineQuadrant(scan, log);
        }

        scan.close();
    }
}

