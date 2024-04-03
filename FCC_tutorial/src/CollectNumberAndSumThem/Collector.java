package CollectNumberAndSumThem;

import java.util.Scanner;

public class Collector {
private Scanner reader = new Scanner(System.in);

private int previousNumber = 0;

private int counter = 0;

public int sumNumbers() {
    System.out.println("How many numbers you want to sum?");
    counter = this.getNumber();
    System.out.println(this.counter);

    while (counter-- > 0) {
        System.out.println("Please input number");
        int userNumber = this.getNumber();
        previousNumber = previousNumber + userNumber;
    }

    System.out.println(previousNumber);
    return previousNumber;
};

private int getNumber() {
  while(!reader.hasNextInt()) {
      System.out.println("Please input a number");
      reader.next();
  }
  int selectedNumber = reader.nextInt();
  reader.nextLine();
  return selectedNumber;

};



}
