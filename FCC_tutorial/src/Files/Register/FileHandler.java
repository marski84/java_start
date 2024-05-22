package Files.Register;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileHandler {
  private String fileName =
      "/Users/marcinochmanski/Desktop/java/java_start/java_start/FCC_tutorial/src/Files/Register/clients.csv";
  private final int INITIAL_LINE_NUMBER = 0;
  private UserInputHandler inputHandler = new UserInputHandler();
  private ClientBase clientBase = new ClientBase();


  public void init() throws IOException {
    var fileReader = new FileReader(fileName);
    var reader = new BufferedReader(fileReader);

    try (fileReader;
        reader) {
      String nextLine = null;
      int lineNumber = INITIAL_LINE_NUMBER;
      while ((nextLine = reader.readLine()) != null) {
        if (lineNumber != INITIAL_LINE_NUMBER) {
          String[] record = nextLine.split(",");
          clientBase.createClientAndAddToBase(
              Integer.valueOf(record[0]),
              record[1],
              record[2],
              record[3],
              Double.valueOf((record[4])));
        }
        lineNumber++;
      }
    }
  }

  public void selectMode() {
    try {
      System.out.println("Pobierz dane z pliku i wyświetl- wybierz 1");
      System.out.println("Pobierz dane i filtruj po kraju- wybierz 2");
      System.out.println("Przerwij- wybierz 3");
      String userSelection = inputHandler.getUserInput();
      while (!userSelection.equals("1")
          && !userSelection.equals("2")
          && !userSelection.equals("3")) {
        throw new Exception("not a valid selection");
      }

      switch (userSelection) {
        case "1" -> handleGetCompleteData();
        case "2" -> handleFilterData();
        case "3" -> handleAbort();
      }

    } catch (Exception e) {
      System.out.println(e);
      selectMode();
    }
  }

  private void handleGetCompleteData() {
    try{
      this.init();
    } catch (IOException e) {
      System.out.println(e);
    }
    clientBase.printFullClientData();
    clientBase.getHighestValueClient();
  }

  private void handleFilterData() {
    try{
      this.init();
    } catch (IOException e) {
      System.out.println(e);
    }
    System.out.println("Provide name of the country for which you wont to filter data");
    String filter = inputHandler.getUserInput();
    try {
      while (filter.length() < 3) {
        throw new Exception("Name too short!");
      }
    } catch (Exception e) {
      System.out.println(e);
      handleFilterData();
    }
    List<Client> clientList = clientBase.filterDataByCountry(filter);
    if (clientList == null) {
      System.out.println("Data for " + filter + " not found");
      return;
    }
    clientList.forEach(client -> System.out.println(client));
    System.out.println("Average value of client: " + clientBase.countriesAverageValue(clientList));
  }

  private void handleAbort() {
    System.out.println("Process aborted");
  }
}
