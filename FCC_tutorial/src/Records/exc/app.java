package Records.exc;

public class app {
    public static void main(String[] args) {
        DataHandler dh = new DataHandler();
        DataReader dataReader = new DataReader(dh);
        dataReader.readData();

    }
}
