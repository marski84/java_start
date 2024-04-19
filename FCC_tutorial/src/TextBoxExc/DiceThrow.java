package TextBoxExc;

import java.util.Random;
import java.util.Scanner;

public class DiceThrow {
    private Random randomInt = new Random();
    private Scanner scanner = new Scanner(System.in);


    private int throwDice() {
        return randomInt.nextInt(6) + 1;
    }

    public String getResult() {
        String result = "";
        System.out.println("Wciśnij enter");
        String input = scanner.nextLine();
        while (!scanner.hasNextLine() && (scanner.nextLine() != "")) {
            System.out.println("Wciśnij enter 2");
            scanner.next();
        }

        int diceThrowResult = throwDice();
        System.out.println(diceThrowResult);


        if (diceThrowResult == DiceResult.ONE.getId()){
            result = DiceResult.ONE.getValue();
        }
        if (diceThrowResult == DiceResult.TWO.getId()){
            result = DiceResult.TWO.getValue();
        }
        if (diceThrowResult == DiceResult.THREE.getId()){
            result = DiceResult.THREE.getValue();
        }
        if (diceThrowResult == DiceResult.FOUR.getId()){
            result = DiceResult.FOUR.getValue();
        }
        if (diceThrowResult == DiceResult.FIVE.getId()){
            result = DiceResult.FIVE.getValue();
        }
        if (diceThrowResult == DiceResult.SIX.getId()){
            result = DiceResult.SIX.getValue();
        }
        return result;
    }


}
