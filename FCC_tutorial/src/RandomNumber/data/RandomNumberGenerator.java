package RandomNumber.data;

import java.util.Random;

public class RandomNumberGenerator {
    private int  randomNumber;
    Random random = new Random();

    public int getRandomNumber() {
        return randomNumber;
    }


    public RandomNumberGenerator() {
        int number = random.nextInt(9999);
        this.randomNumber = number;


        if (randomNumber < 5000) {
            System.out.println(this.getRandomNumber() + " jest mniejsze od 5000");
        }
        if (randomNumber == 5000) {
            System.out.println(this.getRandomNumber() + " jest równe 5000");
        }
        if (randomNumber > 5000) {
            System.out.println(this.getRandomNumber() + " jest większe od 5000");
        }

        if (randomNumber %2 == 1) {
            System.out.println(this.getRandomNumber() + " jest nieparzysta");
            return;
        }

        System.out.println(this.getRandomNumber() + " jest parzysta");
    }


}
