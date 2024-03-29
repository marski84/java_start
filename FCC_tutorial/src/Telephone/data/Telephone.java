package Telephone.data;

public class Telephone {
    private String brand;
    private String model;

    private int batteryCapacity;
    private int chargeLevel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }



    public Telephone(String brand, String model, int batteryCapacity, int chargeLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    public void printData() {
        System.out.println(this.getBrand()
                + " " + this.getModel()
                + ", bateria: " + this.getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + this.getChargeLevel() + "%");
    }
}