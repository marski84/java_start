package Set.exc2;

import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public class UserInputHandler {


    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }

        return input;
    }

    public static @Nullable String getModeSelection() {
        System.out.println("0: add new product");
        System.out.println("1: exit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("0") || input.equals("1")) {
            return input;
        } else {
            getModeSelection();
        }

        return null;
    }

    public static @Nullable String getDecision() {
        System.out.println("0: Ignore product");
        System.out.println("1: Add product");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("0") || input.equals("1")) {
            return input;
        } else {
            getModeSelection();
        }

        return null;
    }
}
