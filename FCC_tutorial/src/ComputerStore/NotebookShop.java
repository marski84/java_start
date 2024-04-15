package ComputerStore;

import ComputerStore.logic.DataStore;
import ComputerStore.models.Computer;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Computer computer = new Computer("fsfs", 1214);
        Computer computer2 = new Computer("aaaaa", 666);
        Computer computer3 = new Computer("aaaaa", 666);

        dataStore.add(computer);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer3);
        System.out.println(dataStore.checkAvailability(computer2));

    }
}
