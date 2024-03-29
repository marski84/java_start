package Dice;

import java.util.Random;

public class Dice {
    int result;

    Random randomNumber = new Random();


    Dice() {
        this.roll();
    }

    Dice(int result) {
        this.result = result;
        this.showResult(this.result);
    }

    void roll() {

        this.result = randomNumber.nextInt(6) + 1;

        showResult(this.result);

    }

    void showResult(int result) {
        System.out.println("Liczba oczek na kostce: " + this.result);
    }
}
