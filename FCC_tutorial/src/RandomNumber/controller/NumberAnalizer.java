package RandomNumber.controller;

public class NumberAnalizer {
    public NumberAnalizer() {
    }

    public int formatNumber(int number) {
        if (number / 1000 >= 1 | number == 0) {
            return number;
        } else {
            if (number / 100 >= 1) {
            return number * 10;
            }
            else {
                return number * 100;
            }
        }
    }
}
