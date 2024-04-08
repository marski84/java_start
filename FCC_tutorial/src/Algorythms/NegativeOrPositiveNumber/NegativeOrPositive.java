package Algorythms.NegativeOrPositiveNumber;

import java.util.Scanner;

public class NegativeOrPositive {
    private Scanner scanner = new Scanner(System.in);
    private int index = 0;
    private int condition = 5;
    private int multi = 1;
    private int nextNumber = 0;


    public NegativeOrPositive(int index, int multi, int condition) {
        this.index = index;
        this.multi = multi;
        this.condition = condition;
    }

    public NegativeOrPositive() {
    }

    public String start() {
        while (index < condition) {
//            int input = getData();
            multi = multi * getData();
            index++;
        }

        return this.isNegativeOrPositive(multi);
    }

    private String isNegativeOrPositive(int multi) {
        return multi >= 0 ? "Positive" : "Negative";
    }


    private int getData() {
        System.out.println("Input Number");
        while (!scanner.hasNextInt()) {
            System.out.println("Input Number");
            scanner.next();
        }
        return scanner.nextInt();
    }


}
