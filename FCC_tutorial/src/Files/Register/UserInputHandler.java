package Files.Register;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        String input = "";
        boolean isValid = false;

        while (!isValid) {
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
                isValid = true;
                return input;
            } else {
                throw new InputMismatchException("Provide string");
            }
        }
        return null;
    }
}
