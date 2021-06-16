package curso.application;

import curso.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramEmployee2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log = Logger.getLogger(ProgramEmployee2.class.getName());
        var sc = new Scanner(System.in);

        log.info("How many employees will be registered? ");
        var amount = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (var i = 0; i < amount; i++) {
            var em = "\nEmployee #" + (i + 1) + ":";
            log.info(em);

            log.info("Id: ");
            var id = sc.nextInt();

            log.info("Name: ");
            sc.nextLine();
            var name = sc.nextLine();

            log.info("Salary: ");
            var salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        log.info("Enter the employee id that will have salary increase: ");
        var id = sc.nextInt();

        var emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null) {
            log.info("this id does not exists.");
        } else {
            log.info("Enter the percentage: ");
            emp.increaseSalary(sc.nextDouble());
        }

        log.info("\nList of employees:");
        for (Employee e : employees) {
            var employer = e.showInfo();
            log.info(employer);
        }

        sc.close();
    }
}
