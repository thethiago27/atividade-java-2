package tech.thiagorsouza;

import tech.thiagorsouza.functions.Analista;
import tech.thiagorsouza.functions.Coordenador;
import tech.thiagorsouza.functions.Gerente;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Utils.showMessage("Digite o nome do funcionário: ");
    String name = sc.nextLine();

    Utils.showMessage("Digite o CPF do funcionário: ");
    String cpf = sc.nextLine();

    Utils.showMessage("Digite o salário do funcionário: ");
    double salary = sc.nextDouble();

    Utils.showMessage("Digite a comissão do funcionário: ");
    double comission = sc.nextDouble();

    Utils.showMessage("Qual o cargo do funcionário: ");
    Utils.showMessage("1 - Analista");
    Utils.showMessage("2 - Gerente");
    Utils.showMessage("3 - Coordenador");
    int option = sc.nextInt();

    Worker worker;
    switch (option) {
      case 1:
        worker = new Analista(name, cpf, salary, comission);
        break;
      case 2:
        worker = new Gerente(name, cpf, salary, comission);
        break;
      case 3:
        worker = new Coordenador(name, cpf, salary, comission);
        break;
      default:
        Utils.showWarning("Opção inválida!");
        main(args);
        return;
    }

    Utils.showSalary(worker.calculateSalary());
  }
}
