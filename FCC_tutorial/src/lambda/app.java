package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class app {
    public static void main(String[] args) {
        String word = "   WORD   ";

        Function<String, String> formatter = text ->  text.toLowerCase().trim();
        System.out.println(formatter.apply(word));
        Predicate<String> test = text -> text.length() > 0;
        test.test(word);

        Consumer<String> stringConsumer = System.out::println;
//        Consumer<Integer> integerConsumer = number -> ;
        stringConsumer.accept("Hello World");
    }
}
