package Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EndlessCalculator {
    UserInputHandler userInputHandler = new UserInputHandler();

    public void init() {
        List<Integer> numbers = userInputHandler.getInput();
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        printResult(numbers, result);
    }

    private String printResult(List<Integer> numbers, int result) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                sb.append(numbers.get(i) + " + ");
            } else {
                sb.append(numbers.get(i) + " = ");
            }
        }
        sb.append(result);

//        numbers.stream().forEach((number) -> sb.append(number).append(" + "));
        System.out.println(sb);
        return sb.toString();
    }
}
