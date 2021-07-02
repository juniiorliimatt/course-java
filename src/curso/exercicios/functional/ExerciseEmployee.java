package curso.exercicios.functional;

import curso.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseEmployee{
  public static void main(String[] args){

    Locale.setDefault(Locale.US);
    var sc = new Scanner(System.in);

    final var path = "c:\\tmp\\in.txt";

    try(BufferedReader br = new BufferedReader(new FileReader(path))){
      List<Employee> employees = new ArrayList<>();
      String line = br.readLine();
      while(line!=null){
        var fields = line.split(",");
        employees.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
        line = br.readLine();
      }

      System.out.print("Qual o valor do salário para a busca: ");
      var salary = sc.nextDouble();
      employees
          .stream()
          .filter(e->e.getSalary()>=salary)
          .map(Employee::getEmail)
          .sorted()
          .collect(Collectors.toList())
          .forEach(System.out::println);

      System.out.print("Qual a letra inicial da busca: ");
      var letra = sc.next();
      var avg = employees
          .stream()
          .filter(employee->employee.getName().toLowerCase().startsWith(letra.toLowerCase()))
          .map(Employee::getSalary)
          .reduce(0.0,Double::sum);

      System.out.println(avg);

    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
