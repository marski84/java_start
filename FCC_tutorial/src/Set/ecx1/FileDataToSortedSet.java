package Set.ecx1;
import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class FileDataToSortedSet {

    public void processFileData() {
        Set<String> resultSet = new TreeSet((o1, o2) -> -o1.toString().compareTo(o2.toString()));


        try {
            String fileName = "/Users/marcinochmanski/Desktop/java/java_start/java_start/FCC_tutorial/src/Set/ecx1/namespl.txt";
            Reader reader = new FileReader(fileName);
            BufferedReader fileReader = new BufferedReader(reader);

            fileReader.lines().forEach(line -> resultSet.add(line));
            fileReader.close();

            System.out.println(resultSet);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
