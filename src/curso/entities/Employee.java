package curso.entities;

public class Employee {
    private final String name;
    private double grossSalary;
    private final double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += this.grossSalary * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Employee: " + this.name + ", $ " + this.netSalary();
    }
}
