package Plants;

public class Plant {

    String name;
    String description;
    double waterConsumption;

    public double getDailyWaterConsumption() {
        return this.waterConsumption;
    }
    public double getWeeklyWaterConsumption() {
        return this.waterConsumption * 7;
    }
    public double getYearlyWaterConsumption() {
        return this.waterConsumption * 365;
    }
}
