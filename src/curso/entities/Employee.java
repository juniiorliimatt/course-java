package curso.entities;

public class Employee implements Comparable<Employee>{

  private final String name;
  private Integer id;
  private Double grossSalary;
  private Double tax;
  private Double salary;
  private String email;

  public Employee(String name,Double salary){
    this.name = name;
    this.salary = salary;
  }

  public Employee(String name,String email,Double salary){
    this.name = name;
    this.email = email;
    this.salary = salary;
  }

  public Employee(Integer id,String name,Double grossSalary){
    this.id = id;
    this.name = name;
    this.grossSalary = grossSalary;
  }

  public Employee(String name,Double grossSalary,Double tax){
    this.name = name;
    this.grossSalary = grossSalary;
    this.tax = tax;
  }

  public double netSalary(){
    return this.grossSalary-this.tax;
  }

  public void increaseSalary(Double percentage){
    this.grossSalary += this.grossSalary*(percentage/100);
  }

  public int getId(){
    return id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public String getName(){
    return name;
  }

  public double getGrossSalary(){
    return grossSalary;
  }

  public Double getSalary(){
    return salary;
  }

  public void setSalary(Double salary){
    this.salary = salary;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  @Override
  public String toString(){
    return "Employee: "+this.name;
  }

  public String showInfo(){
    return getId()+", "+getName()+", "+String.format("%.2f",getGrossSalary());
  }

  @Override
  public int compareTo(Employee o){
    return salary.compareTo(o.getSalary());
  }
}
