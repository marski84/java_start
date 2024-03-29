package Plants;

import java.lang.reflect.Array;

public class Garden {

    public static void main(String[] args) {
        Plant first = new Plant();
        first.name = "First";
        first.description = "big plant";
        first.waterConsumption = 20.0;

        Plant second = new Plant();
        second.name = "Second";
        second.description = "very big plant";
        second.waterConsumption = 40.0;

        Plant third = new Plant();
        third.name = "third";
        third.description = "small plant";
        third.waterConsumption = 5;

        Plant[] plants = {first, second, third};

        double dailyWaterConsumptionSum = 0;
        double weeklyWaterConsumptionSum = 0;
        double yealryWaterConsumptionSum = 0;

        for (Plant plant : plants ) {
            dailyWaterConsumptionSum += plant.getDailyWaterConsumption();
            weeklyWaterConsumptionSum += plant.getWeeklyWaterConsumption();
            yealryWaterConsumptionSum += plant.getYearlyWaterConsumption();
        }



        System.out.println("Zużycie wody przez roślny: \n "
                + "- dziennie: " + dailyWaterConsumptionSum
        + "\n - tygodniowo: " + weeklyWaterConsumptionSum
        + "\n - rocznie: " + yealryWaterConsumptionSum);


    }
}
