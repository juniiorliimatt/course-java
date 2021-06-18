package curso.application;

import curso.entities.Student;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(ProgramStudent.class.getName());
        var sc = new Scanner(System.in);

        log.info("Name: ");
        var name = sc.nextLine();
        var noteOne = sc.nextDouble();
        var noteTwo = sc.nextDouble();
        var noteThree = sc.nextDouble();

        var student = new Student(name, noteOne, noteTwo, noteThree);

        var s = student.finalGrade();
        log.info(s);

        sc.close();
    }
}
