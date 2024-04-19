package common;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scanner = new Scanner(System.in);


     public static String getUserInputAsString() {
         System.out.println("Please input sentence");
         while (!scanner.hasNextLine() || scanner.hasNextInt()) {
             System.out.println("please use only alpha");
             scanner.next();
         }
         String userInput = scanner.nextLine();
         return userInput;

    }
}
