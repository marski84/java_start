package Files.CompanyManagment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
  private Scanner scanner = new Scanner(System.in);
  private final double INITIAL_INPUT_VALUE = 0;

  public String getValidStringInput() {
    String input = "";
    boolean isValid = false;

    while (!isValid) {
      try {
        input = scanner.nextLine();
        isValid = true;
      } catch (InputMismatchException e) {
        throw new InputMismatchException("Not valid inout- please provide text value!");
      }
    }
    return input;
  }

  public double getValidDoubleInput() {
    double number = INITIAL_INPUT_VALUE;
    boolean isValid = false;

    while (!isValid) {
      try {
        number = scanner.nextDouble();
        if (number < 0) {
          System.out.println("wyjatek");
          throw new InputMismatchException();
        }
        isValid = true;
      } catch (InputMismatchException e) {
        throw new InputMismatchException("Not valid input- please provide number which is greater than 0!");
      } finally {
                scanner.nextLine();
      }
    }
    return number;
  }
}
