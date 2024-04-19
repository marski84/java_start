package StringBuilderExc1;

import java.util.Scanner;

public class StringBuild {
    private int amountOfWords;
    private int counter = 0;
    private Scanner scanner = new Scanner(System.in);


    public String start() {
        amountOfWords = this.getAmountOfWords();
        StringBuilder stringBuilder = new StringBuilder();

        while (counter != amountOfWords) {
            String userInput = this.getUserInfo();
            char lastChar = getLastChar(userInput);
            stringBuilder.append(lastChar);
            counter++;
        }

        String result = stringBuilder.toString();
        return result;
    }

    private char getLastChar(String word) {
        int wordLength = word.length() -1;
        return word.charAt(wordLength);
    }


    private String getUserInfo() {
        System.out.println("Please provide string");
        while (!scanner.hasNextLine() && scanner.nextLine().length() < 2) {
            System.out.println("Please provide string");
            scanner.next();
        }
        return scanner.nextLine();
    }

    private int getAmountOfWords() {
        System.out.println("Input number of words");
        while (!scanner.hasNextInt()) {
            System.out.println("provide a number");
            scanner.next();
        }

        int result = scanner.nextInt();
        scanner.nextLine();
        return result;

    }
}
