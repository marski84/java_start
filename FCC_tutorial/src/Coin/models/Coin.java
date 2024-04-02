package Coin.models;

import java.util.Random;

public class Coin {

    private Random ran = new Random();

    public Coin() {

    }

    public int throwCoin() {
        return (ran.nextInt(200) + 1) % 2;
    }

}
