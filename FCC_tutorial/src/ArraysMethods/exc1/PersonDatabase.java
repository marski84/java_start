package ArraysMethods.exc1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class PersonDatabase {
  private final int INITIAL_SIZE = 1;
  private final int INITIAL_INDEX = -1;
  private Person[] dataBase = new Person[INITIAL_SIZE];

  public void add(Person person) {
    validateInput(person);
    int index = getFreeIndex();
    if (getFreeIndex() == INITIAL_INDEX) {
      dataBase = Arrays.copyOf(dataBase, size() + 1);
      dataBase[getFreeIndex()] = person;
    } else {
      dataBase[index] = person;
    }
  }

  public void remove(Person person) {
    validateInput(person);
    int index = INITIAL_INDEX;
    for (int i = 0; i < dataBase.length; i++) {
      if (dataBase[i].equals(person)) {
        index = i;
      }
    }
    removeRecord(index);
    Arrays.sort(dataBase, new NullsLastComparator());
    System.out.println(dataBase);
  }

  private void removeRecord(int index) {
      if (index != INITIAL_INDEX) {
          System.out.println("removing");
          System.out.println(dataBase[index]);
          dataBase[index] = null;
          System.out.println(dataBase);
      }
  }

  public Person get(int index) {
    if (index > dataBase.length) {
      throw new InputMismatchException("Index out of bounds!");
    }
    validateInput(index);
    return dataBase[index];
  }

  public int size() {
    return dataBase.length;
  }

  private <T> void validateInput(T input) {
    if (input == null) {
      throw new NullPointerException("Illegal value!");
    }
  }

  private int getFreeIndex() {
    int freeIndex = INITIAL_INDEX;
    for (int i = 0; i < dataBase.length; i++) {
      if (dataBase[i] == null) {
        freeIndex = i;
      }
    }
    return freeIndex;
  }

  @Override
  public String toString() {
    return "PersonDatabase{" + "dataBase=" + Arrays.toString(dataBase) + '}';
  }

  private static class NullsLastComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
      if (o1 == null && o2 == null) {
        return 0;
      }
      if (o1 == null) {
        return 1;
      }
      if (o2 == null) {
        return -1;
      }
      return o1.compareTo(o2);
    }
  }
}
