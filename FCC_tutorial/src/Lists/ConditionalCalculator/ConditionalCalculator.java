package Lists.ConditionalCalculator;

import Lists.UserInputHandler;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ConditionalCalculator {
    UserInputHandler userInputHandler = new UserInputHandler();

    public void initCalculation() {
        System.out.println(userInputHandler.getNonNegativeInput());
        List<Integer> resultList = userInputHandler.getNonNegativeInput();
        System.out.println(printResults(resultList));
    }

    @org.jetbrains.annotations.NotNull
    private String printResults(@NotNull List<Integer> resultList) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = resultList.size();
        int sum = resultList.stream().reduce(0, (first, second) -> first + second);
        int avg = sum / size;
        stringBuilder.append("Amount of valid numbers: " + size + "\n");
        stringBuilder.append("Sum of numvers: " + sum + "\n");
        stringBuilder.append("Average of numvers: " + avg + "\n");
        return stringBuilder.toString();

    }
}
