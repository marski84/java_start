package inheritance;

public class Tire extends Part {
    private int tireSize;
    private int tireWidth;

    Tire(String manufacturer, String model, int serialNumber, int tireSize, int tireWidth) {
        super(manufacturer, model, serialNumber);
        this.tireSize = tireSize;
        this.tireWidth = tireWidth;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }
}
