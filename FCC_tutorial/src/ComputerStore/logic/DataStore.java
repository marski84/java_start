package ComputerStore.logic;

import ComputerStore.models.Computer;

import java.util.Arrays;

public class DataStore {
    private final int STORAGE_SIZE = 100;
    private Computer[] computerStorage = new Computer[STORAGE_SIZE];

    public void add(Computer computer) {
        if (getFreeStorageSize() == STORAGE_SIZE) {
            return;
        }
        int index = getFreeIndex();
        computerStorage[index] = computer;
    }

    private int getFreeIndex() {
        int freeIndex = 0;
        for (int i = 0; i < computerStorage.length; i++ ) {
            if (computerStorage[i] == null) {
                freeIndex = i;
                break;
            }
            }
        return freeIndex;
    }

    private int getFreeStorageSize() {
        int amountOfStorageTaken= 0;
        for (Computer item : computerStorage) {
            if (item != null) {
                amountOfStorageTaken++;
            }
        }
        return amountOfStorageTaken;
    }

    public int checkAvailability(Computer computerToCheck) {
        int amountOfSameType = 0;
        for (Computer computer : computerStorage) {
            if(computer != null && computer.equals(computerToCheck)) {
                amountOfSameType++;
            }
        }
        return amountOfSameType;
    }
    @Override
    public String toString() {
        return "DataStore{" +
                "computerStorage=" + Arrays.toString(computerStorage) +
                '}';
    }
}

