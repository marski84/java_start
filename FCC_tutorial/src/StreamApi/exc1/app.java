package StreamApi.exc1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class app {
    public static void main(String[] args) {
        IntStream numbersStream = IntStream.rangeClosed(0, 2000);
        numbersStream
                .filter(number-> number > 100 && number < 1000 && number % 5 == 0)
                .limit(10)
                .map(number-> number * 3)
                .forEach(number -> System.out.println(number));


    }
}
