package ArraysMethods.exc1;

import java.util.Arrays;

public class app {
  public static void main(String[] args) {
    PersonDatabase database = new PersonDatabase();
    Person person = new Person("pierwszy", "sada", "821083");
    database.add(person);
    Person person1 = new Person("drugi", "sada", "821083");
//    database.add(new Person("kaka", "sada", "821083"));
//    database.add(person1);
//    database.add(new Person("kaka", "sada", "821083"));
//    database.remove(person1);
//    System.out.println(database.toString());
    //    System.out.println(database.size());
//    System.out.println(database.get(1));

  Person[] personTable = {person1, person1, person};
    System.out.println(Arrays.toString(personTable));

    Integer[] integers = {2438166, 1, 2, 87876,909};
    Integer[] sortedIntegers = Arrays.copyOf(integers, integers.length);
  }


}
