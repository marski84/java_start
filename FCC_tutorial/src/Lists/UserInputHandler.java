package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputHandler {
    List<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public List<Integer> getInput() {
        System.out.println("Please enter a number- in order to finish and add all number input exit");
        String userInput = scanner.nextLine();
        if (userInput.equals("exit")) {
            System.out.println("ok");
            return list;
        } else {
            if (!validateInput(userInput)) {
                System.out.println("invalid input- please try again");
                return getInput();
            }
            list.add(Integer.valueOf(userInput));
            System.out.println(list);
            return getInput();
        }
    }


    public List<Integer> getNonNegativeInput() {
        System.out.println("Please enter a non negative number which is dividable by 5");
        String input = scanner.nextLine();
        if (!validateIfInputNonNegativeAndDivididable(input)) {
            System.out.println("ok");
            return list;
        } else {
            list.add(Integer.valueOf(input));
            System.out.println(list);
            return getNonNegativeInput();
        }
    }


    private boolean validateInput(String input) {
        String regex = "\\d+";
        return input.matches(regex);
    }

    private boolean validateIfInputNonNegativeAndDivididable(String input) {
        validateInput(input);
        System.out.println(input + " " + (Integer.valueOf(input) < 0));
        return Integer.valueOf(input) > 0 &&  Integer.valueOf(input) % 5 == 0;
    }
}
