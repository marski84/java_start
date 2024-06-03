package Lists.EndlessCalculator;

import Lists.UserInputHandler;

public class app {
    public static void main(String[] args) {
        UserInputHandler userInputHandler = new UserInputHandler();
//        System.out.println(userInputHandler.getInput());
        EndlessCalculator calculator = new EndlessCalculator();
        calculator.init();


    }
}
