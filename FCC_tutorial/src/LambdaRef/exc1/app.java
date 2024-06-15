package LambdaRef.exc1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class app {
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Jan", "Karol", "Piotr", "Andrzej");
        Collections.sort(namesList, String::compareToIgnoreCase);
        System.out.println(namesList);

    }



}
