package Typy_opakowujace.exc1;

import java.math.BigInteger;
import java.util.List;

public class app {
  public static void main(String[] args) {
    DataHandler dataHandler = new DataHandler();
    Calculator calculator = new Calculator();
    try {
      List list = dataHandler.getData();
      List primitivesList = List.of(list.get(0), list.get(1), list.get(2));
      List bigNumbersList =
          List.of(
              new BigInteger(String.valueOf(list.get(3))),
              new BigInteger(String.valueOf(list.get(4))));
      calculator.addListElements(primitivesList);
      calculator.addListElementsWithBigInteger(bigNumbersList);

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
