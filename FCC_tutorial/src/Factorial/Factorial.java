package Factorial;

public class Factorial {
  public static void main(String[] args) {
    System.out.println(getFactorial(4));
  }

  public static int getFactorial(int n) {
    return n > 1 ? n * getFactorial(n - 1) : 1;
  }
}
