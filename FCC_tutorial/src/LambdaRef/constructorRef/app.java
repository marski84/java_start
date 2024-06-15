package LambdaRef.constructorRef;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class app {

    private static String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private static int[] ages = {22, 33, 44, 55};

    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        PersonSupplier personWithParamsSupplier = Person::new;

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
             personList.add(personSupplier.get());
        }

        List<Person> personListOther = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            personListOther.add(personWithParamsSupplier.get(firstNames, lastNames, ages));
        }

        System.out.println(personListOther);


    }

    static <T> void listConsumer(List<T> list, Consumer<T> consumer) {
        for (T record : list) {
            consumer.accept(record);
        }
    }
}
