package Records.exc;

import java.io.*;

public class DataReader {
    private final String fileName = "/Users/marcinochmanski/Desktop/java/java_start/java_start/FCC_tutorial/src/Records/exc/weather.csv";
    private final DataHandler dataHandler;

    public DataReader(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public void readData() {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().forEach( dataHandler::addRecord);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
