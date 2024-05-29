package ArraysMethods.exc2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayComparator {
    private Scanner scanner = new Scanner(System.in);


    public void compareArrays() {
        System.out.println("First phrase:");
        String firstPhrase = getUserInput();
        System.out.println("Second phrase:");
        String secondPhrase = getUserInput();

        char[] firstWords = firstPhrase.toCharArray();
        char[] secondWords = secondPhrase.toCharArray();
        Arrays.sort(firstWords);
        Arrays.sort(secondWords);

        System.out.println(firstWords);
        System.out.println((secondWords));

        boolean isEqual = Arrays.equals(
                firstWords,
                secondWords);
        System.out.println(isEqual);

    }

    private String getUserInput() {
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
