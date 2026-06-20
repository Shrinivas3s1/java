// TODO: Create an class called Employee
class Employee{
  private String name;
  private double salary;

  public Employee(){

  }

  public Employee(String name, double salary){
    this.name = name;
    this.salary = salary;
  }

  public String getName(){
    return name;
  }

  public double getSalary(){
    return salary;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setSalary(double salary){
    this.salary = salary;
  }


  public String getDetails(){
    return "Name: " + name + ", Salary: " + salary + "";
  }
}

// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
  private String department;

  public Manager(String name, double salary, String department){
    super(name, salary);
    this.department = department;
  }

  @Override
  public String getDetails(){
    return "Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + department + "";
  }

}

public class Main {
  public static void main(String[] args) {
    // TODO: Create Employee and Manager objects
    Employee e1 = new Employee("Alice",50000);
    Employee e2 = new Manager("Bob",80000,"IT");
    System.out.println(e1.getDetails());
    System.out.println(e2.getDetails());
    // TODO: Print their details using getDetails()
  }
}
