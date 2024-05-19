package Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "janusz.txt";
        Person janusz = new Person("Janusz", "Testowy");


        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
                ) {
            os.writeObject(janusz);
            System.out.println("zapis ok");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
