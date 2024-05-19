package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

    public static void main(String[] args) {
        String fileName = "janusz.txt";
        Person janusz = null;

        try (
                var fr = new FileInputStream(fileName);
                var or = new ObjectInputStream(fr);
        ) {
            janusz = (Person) or.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        if (janusz != null) {
            System.out.println(janusz.getFirstName());
        }
    }


}
