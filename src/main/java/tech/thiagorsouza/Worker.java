package tech.thiagorsouza;

public class Worker {

  public String name;
  public String cpf;
  public double salary;

  private final double commission;

  protected Worker(String name, String cpf, double salary, double commission) {
    this.name = name;
    this.cpf = cpf;
    this.salary = salary;
    this.commission = commission;
  }

  public double getSalary() {
    return this.salary;
  }

  public double getCommission() {
    return this.commission;
  }


  public double calculateSalary() {
    return this.salary + (this.salary * this.commission);
  }
}
