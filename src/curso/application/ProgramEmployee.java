package curso.application;

import curso.entities.Employee;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(ProgramEmployee.class.getName());
        var sc = new Scanner(System.in);

        log.info("Name: ");
        var name = sc.nextLine();

        log.info("Gross Salary: ");
        var grossSalary = sc.nextDouble();

        log.info("Tax: ");
        var tax = sc.nextDouble();

        var employee = new Employee(name, grossSalary, tax);
        var e = employee.toString();
        log.info(e);

        log.info("Which percentage to increase salary: ");
        var percentage = sc.nextDouble();

        employee.increaseSalary(percentage);
        e = "Updated data: " + employee.toString();
        log.info(e);

        sc.close();
    }
}
