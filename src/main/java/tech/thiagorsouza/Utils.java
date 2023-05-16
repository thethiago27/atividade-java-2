package tech.thiagorsouza;

public class Utils {
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static void showMessage(String message) {
    System.out.println(message);
  }

  public static void showWarning(String message) {
    System.out.println(ANSI_RED + message + ANSI_RESET);
  }

  public static void showSalary(double salary) {
    System.out.println("O salário do funcionário é: " + salary);
  }
}
