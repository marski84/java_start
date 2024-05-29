package Typy_opakowujace.exc1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataHandler {
  private final String DATA_FILE =
      "/Users/marcinochmanski/Desktop/java/java_start/java_start/FCC_tutorial/src/Typy_opakowujace/exc1/data.txt";

  public List<String> getData() throws IOException {
    var fileReader = new FileReader(DATA_FILE);
    var reader = new BufferedReader(fileReader);
    List list = null;
    try (fileReader;
        reader) {
      list = reader.lines().toList();
    } catch (IOException e) {
      System.out.println(e);
    }
    return list;
  }
}
