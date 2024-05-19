package Files;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        File file = new File(fileName);


        boolean fileExists = file.exists();
        try {
            if (!fileExists) {
                fileExists = file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (fileExists) {
            System.out.println("File: " + file);
        }

        file.mkdir();
    }
}
