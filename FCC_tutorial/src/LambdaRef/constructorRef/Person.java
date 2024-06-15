package LambdaRef.constructorRef;

import java.util.Random;

public class Person {
    private static String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private static int[] ages = {22, 33, 44, 55};
    Random random = new Random();

    private String firstName;
    private String lastName;
    private int age;

    Person() {
        firstName = firstNames[random.nextInt(firstNames.length)];
        lastName = lastNames[random.nextInt(lastNames.length)];
        age = ages[random.nextInt(ages.length)];
    }

    Person(String[] firstNameList, String[] lastNameList, int[] ageList) {
        firstName = firstNameList[random.nextInt(firstNameList.length)];
        lastName = lastNameList[random.nextInt(lastNameList.length)];
        age = ageList[random.nextInt(ageList.length)];
    }

}
