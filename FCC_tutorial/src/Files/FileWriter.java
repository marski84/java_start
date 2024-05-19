package Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        try (
                var fileWriter = new FileWriter(fileName, true);
                var writer = new BufferedWriter(fileWriter);
        ) {
            writer.write("Bolek");
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}
