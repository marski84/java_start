package CalculatorWithInput;

import java.util.Locale;

public class CalculatorImpl {
    public static void main(String[] args) {
        CalculatorWithInput calculator = new CalculatorWithInput();
        calculator.scanner.useLocale(Locale.UK);
        calculator.calculate();
    }
}
