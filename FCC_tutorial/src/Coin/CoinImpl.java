package Coin;

import Coin.logic.CoinController;
import Coin.models.Coin;

public class CoinImpl {
    public static void main(String[] args) {
        CoinController coinController = new CoinController();
        System.out.println(coinController.handleThrowDice());

    }
}
