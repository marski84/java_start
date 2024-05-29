package Typy_opakowujace.exc1;

import java.math.BigInteger;
import java.util.List;

public class Calculator {

  public void addListElements(List<String> input) {
    var result =  input.stream()
            .map(value -> Integer.valueOf(value))
            .reduce(0, (first, next) -> first+ next);

    System.out.println(result);
  }

  public void addListElementsWithBigInteger(List<BigInteger> input) {
    var result =
        input.stream()
            .reduce(new BigInteger("0"), (first, next) -> first.add(next));

    System.out.println(result);
  }


}
