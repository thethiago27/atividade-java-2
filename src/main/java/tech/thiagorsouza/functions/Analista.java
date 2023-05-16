package tech.thiagorsouza.functions;

import tech.thiagorsouza.Worker;

public class Analista extends Worker {

  public Analista(String name, String cpf, double salary, double comission) {
    super(name, cpf, salary, comission);
  }

  @Override
  public double calculateSalary() {
    return this.getSalary() + (this.getSalary() + this.getCommission());
  }
}
