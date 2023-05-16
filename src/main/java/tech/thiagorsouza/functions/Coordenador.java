package tech.thiagorsouza.functions;
import tech.thiagorsouza.Worker;

public class Coordenador extends Worker {

  public Coordenador(String name, String cpf, double salary, double comission) {
    super(name, cpf, salary, comission);
  }

  @Override
  public double calculateSalary() {
    return this.getSalary() + (this.getSalary() + this.getCommission());
  }
}
