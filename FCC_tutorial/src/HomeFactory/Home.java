package HomeFactory;

public class Home {
    double waterAmount;
    double oilAmount;

    Home(double water, double oil) {
        waterAmount = water;
        oilAmount = oil;
    }


    void printInfo(String info) {
        System.out.println(info);
        System.out.println("water: " + waterAmount +  " oil: " + oilAmount);
    }


    void takeShower() {
        if (waterAmount < 48.00) {
            printInfo("Not enough water to take a shower!");
            return;
        }
        waterAmount -= 48;
        printInfo("Shower taken!");
    }

    void takeBath() {
        if (waterAmount < 86.00) {
            printInfo("Not enough water to take a bath!");
            return;
        }
        waterAmount -= 86;
        printInfo("Bath taken!");
    }

    void makeDinner() {
        if (waterAmount < 4 || oilAmount < 0.1) {
            printInfo("Not enough resources!");
            return;
        }
        waterAmount -= 4;
        oilAmount -= 0.1;
        printInfo("Dinner ready!");
    }

    void boilWater() {
        if (waterAmount < 0.5 || oilAmount < 0.05) {
            printInfo("Not enough resources to boil water!");
            return;
        }
        waterAmount -= 0.5;
        oilAmount -= 0.05;
        printInfo("water boiled!");
    }

    void watchTv(int time) {

        if (oilAmount < (time * 0.06)) {
            printInfo("Not enough oil to watch tv!");
            return;
        }
        oilAmount -= (0.06*time);
        printInfo("tv ok");
    }




}
