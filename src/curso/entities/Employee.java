package curso.entities;

public class Employee {
    private Integer id;
    private final String name;
    private Double grossSalary;
    private Double tax;

    public Employee(Integer id, String name, Double grossSalary) {
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public Employee(String name, Double grossSalary, Double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(Double percentage){
        this.grossSalary += this.grossSalary * (percentage / 100);
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    @Override
    public String toString() {
        return "Employee: " + this.name + ", $ " + this.netSalary();
    }

    public String showInfo() { return getId() + ", " + getName() + ", " + String.format("%.2f", getGrossSalary()); }
}
