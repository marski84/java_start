package CalculatorWithInput;

import java.util.Scanner;

public class CalculatorWithInput {
    Scanner scanner = new Scanner(System.in);

    CalculatorWithInput() {}
    
    public int calculate() {
        int firstNum = this.getUserInput();
        String operator = this.getOperator();
        int secondNum = this.getUserInput();
        
        var result = switch (operator) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> firstNum / secondNum;


            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };

        System.out.println("result: " + result);
        return result;
    }


    // Method to get user input for numbers
    private int getUserInput() {
        System.out.println("Please provide a number");

        // If input is not an integer, prompt user again
        while (!scanner.hasNextInt()) {
            System.out.println("You can provide only numbers.");
            scanner.next();
        }

        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber);
        return inputNumber;
    }

    private String getOperator() {
        System.out.println("Please select type of operation");
        System.out.println("+ - / *");

        while (true) {    // Infinite loop will break when a valid operator is given
            String operator = scanner.nextLine();

            // Check if operator is one of the valid operators
            if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
                return operator;
            } else {
                System.out.println("Invalid operator. Please enter again.");
            }
        }
    }



}
