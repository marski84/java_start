package Algorythms;

import java.util.Scanner;

public class EvenOrOdd {
    private Scanner scanner = new Scanner(System.in);
    private static int TARGET_SUM = 100;
    private int sum = 0;

    public EvenOrOdd(int targetSum) {
        this.TARGET_SUM = targetSum;
    }

    public EvenOrOdd() {
    }

    public String calculate() {
        while (sum <= TARGET_SUM) {
            System.out.println("Input number");
            while (!scanner.hasNextInt()) {
                System.out.println("Please provide a numbber!");
                scanner.next();
            }
            sum += scanner.nextInt();

            if (sum > TARGET_SUM) {
                break;
            }
        }
        return (evenOrOdd(sum));
    }

    private String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
