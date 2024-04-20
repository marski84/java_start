package common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {
    static Scanner scanner = new Scanner(System.in);
    public static String getUserInputAsString() {
        System.out.println("Please input sentence");
        String userInput = null;
        boolean error = true;
        while (error) {
            try {
                userInput = scanner.nextLine();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("please use only alpha");
                scanner.nextLine();
            }
        }
        return userInput;
    }
}
