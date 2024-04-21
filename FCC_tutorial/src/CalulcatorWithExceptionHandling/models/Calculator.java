package CalulcatorWithExceptionHandling.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private final String ADD = "+";
    private final String SUBTRACT = "-";
    private final String MULTIPLY = "*";
    private final String DIVIDE = "/";
    private final String EQUALS = "=";
    private final Scanner scanner = new Scanner(System.in);



    public double calculate() {
        double result = 0;
        boolean calculationInProgress = true;

        while (calculationInProgress) {
            while (calculationInProgress) {
                if (result == 0) {
                    result = getNumber();
                }
                String operator = getOperator();
                if (operator.equals(EQUALS)) {
                    calculationInProgress = false;
                    break;
                }
                double number = getNumber();
                switch (operator) {
                    case ADD -> result += number;
                    case SUBTRACT -> result -= number;
                    case MULTIPLY -> result *= number;
                    case DIVIDE -> result /= number;
                }
            }
            System.out.println("final result");
            System.out.println(result);
        }
        return result;
    }

    private double getNumber() {
        double number = 0;
        boolean error = true;

        while (error) {
            System.out.println("Please input a number");
            try {
                number = scanner.nextDouble();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Please input a number!");
                scanner.nextLine();
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }

    private String getOperator() {
        boolean error = true;

        String operator = "";
        while (error) {
            System.out.println("Please select one of operators: - + * / or = to finish");
            try {
                String input = scanner.nextLine();
                if (
                        !input.equals(ADD)
                        && !input.equals(DIVIDE)
                        && !input.equals(MULTIPLY)
                        && !input.equals(SUBTRACT)
                        && !input.equals(EQUALS)
                ) {
                    throw new UnknownOperatorException("\"Please select one of operators: - + * /\"");
                }
                operator = input;
                error = false;
            } catch (UnknownOperatorException e) {
                System.out.println("Please select one of operators: - + * /");
            }
        }
        return operator;
    }
}
