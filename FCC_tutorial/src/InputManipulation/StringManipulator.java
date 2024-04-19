package InputManipulation;

import common.UserInputHandler;

public class StringManipulator {

    public String getUserInputAndManipulate() {
        String userInput = UserInputHandler.getUserInputAsString();
        String firstLetter = String.valueOf(userInput.charAt(0));
        return firstLetter.equals(firstLetter.toUpperCase()) ? userInput.toUpperCase() : userInput.toLowerCase();
    }


}
