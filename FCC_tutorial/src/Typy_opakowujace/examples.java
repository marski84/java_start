package Typy_opakowujace;

public class examples {
  public static void main(String[] args) {
    int num = 5;
    String value = "5";

    Integer numAsInteger = Integer.valueOf(num);
    System.out.println(numAsInteger.compareTo(Integer.valueOf(4)));
    String numAsString = Integer.toString(num);
    System.out.println(numAsString);
    Integer valueAsInteger = Integer.parseInt(value);
    System.out.println(valueAsInteger);

    int newValue = numAsInteger.intValue();

  }
}
