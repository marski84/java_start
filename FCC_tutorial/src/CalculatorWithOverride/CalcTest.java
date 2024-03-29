package CalculatorWithOverride;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2,10));
        System.out.println(calculator.add(2,10));
        System.out.println(calculator.subtract(2,10));
        System.out.println(calculator.subtract(55,20,30));
        System.out.println(calculator.add(2.0, 9.99));
        System.out.println(calculator.add(2.5, 4.4, 90.5));
        System.out.println(calculator.subtract(90.00,80));


    }
}
