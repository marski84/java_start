package CalculatorWithInterface.models;
import java.util.InputMismatchException;
import java.util.Scanner;

import static CalculatorWithInterface.interfaces.PrintData.printInfo;

public class DataReader implements CalculatorWithInterface.interfaces.DataReader {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public double getUserInputAsDouble() {
        double input = 0;
        while (input == 0) {
            try {
                input = scanner.nextDouble();
            } catch (InputMismatchException e) {
                printInfo("please input a number!");
            } finally {
                scanner.nextLine();
            }
        }
        return input;
    }

    public int getUserInputAsInt() {
        int input = 0;
        while (input == 0) {
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                printInfo("please input a number!");
            } finally {
                scanner.nextLine();
            }
        }
        return input;
    }
}
