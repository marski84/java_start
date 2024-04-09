package inheritance;

import java.util.Random;

public class Part {
    private Random ran = new Random();
    private int id;
    private String manufacturer;
    private String model;
    private int serialNumber;

    Part(String manufacturer, String model, int serialNumber) {
        this.id = ran.nextInt();
        this.manufacturer = manufacturer;
        this.model= model;
        this.serialNumber = serialNumber;
    }

    public Random getRan() {
        return ran;
    }

    public void setRan(Random ran) {
        this.ran = ran;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
