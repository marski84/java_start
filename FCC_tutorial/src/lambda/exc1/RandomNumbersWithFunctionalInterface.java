package lambda.exc1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbersWithFunctionalInterface {
    private Random random = new Random();
    private static final int AMOUNT_OF_NUMBERS = 10;

    private Supplier randomNumbersGenerator = () -> random.nextInt(100);
    private Consumer<Integer> randomConsumer = (data) -> System.out.print(data + " ");
    private Predicate<Integer> randomPredicate = number -> number % 2 == 0;


    public void init() {
        List<Integer> randomNumbers = generateNumbers();
        printList(randomNumbers);
        List <Integer> filteredList = filterList(randomNumbers);
//        List <Integer> filteredList2 = c
        printList(filteredList);
    }

    private List<Integer> generateNumbers() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            Integer randomNumber = (Integer) randomNumbersGenerator.get();
           result.add(randomNumber);
        }
        return result;
    }

   private List<Integer> filterList(List<Integer> list) {
       List<Integer> result = new ArrayList<>();
       for (Integer record : list) {
           if (randomPredicate.test(record)) {
               result.add(record);
           }
        }
       return result;
   }

   private void printList(List<Integer> list) {
       for (Integer record : list) {
           randomConsumer.accept(record);
       }
       System.out.println();
   }
}
