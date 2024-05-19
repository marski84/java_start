package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName ="fileName.txt";
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);

        int lines = 0;

        while (fileReader.hasNextLine()) {
            String content = fileReader.nextLine();
            System.out.println(content);
            lines++;
        }
        fileReader.close();
        System.out.println("linie: " + lines);
    }


}
