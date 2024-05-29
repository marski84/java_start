package Typy_opakowujace.exc2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordMapper {

  public void getMapping(String input) {
    List numbersList = new ArrayList();

    Map<String, Long> resultMap =
        input
            .chars()
            .mapToObj(c -> (char) c)
                .peek(c -> {if (Character.isDigit(c) ) {
                  numbersList.add(Character.getNumericValue(c));
                }})
            .collect(
                    Collectors.groupingBy(
                            WordMapper::getType,
                            Collectors.counting()
                    )
            );

    resultMap.remove("others");
    System.out.println(resultMap);
    System.out.println(numbersList);
//    System.out.println(numbersList.stream().mapToInt(number -> (int) number).min().getAsInt());
  }

  private static String getType(char character) {
    if (Character.isLetter(character)) {
      return "letters";
    }
    if (Character.isDigit(character)) {
      return "numbers";
    }
    return "others";
  }




}
