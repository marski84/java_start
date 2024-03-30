package RandomNumber.app;

import RandomNumber.controller.NumberAnalizer;
import RandomNumber.data.RandomNumberGenerator;

public class RandomNumberInfo {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        NumberAnalizer numberAnalizer = new NumberAnalizer();
        System.out.println(numberAnalizer.formatNumber(randomNumberGenerator.getRandomNumber()));
    }
}
