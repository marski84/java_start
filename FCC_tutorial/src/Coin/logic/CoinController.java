package Coin.logic;

import Coin.models.Coin;

import java.util.Scanner;

public class CoinController {
    private Scanner scanner = new Scanner(System.in);
    private Coin coin = new Coin();

    public CoinController() {
    }

    private int getUserSelection() {
        System.out.println("Eagle- (please input 0) or tails(please input 1)?");

        while (!scanner.hasNextInt()) {
            System.out.println("Not a valid decision");
            scanner.next();
        }
        int userInput = scanner.nextInt();

        while (userInput != 0 && userInput != 1) {
            System.out.println("Not a valid decision. Please enter either 0 or 1.");

            while (!scanner.hasNextInt()) {
                System.out.println("Not a valid decision");
                scanner.next();
            }

            userInput = scanner.nextInt();
        }

        return userInput;
    }

    public String handleThrowDice() {
        int userChoice = this.getUserSelection();
        int coinThrowResult = this.coin.throwCoin();
        System.out.println("Coin throw resul " + coinThrowResult);

        if (userChoice == coinThrowResult) {
            return "You won!";
        } else {
            return "You lose";
        }



    }


}
