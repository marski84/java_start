package AcController;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AcController {
    private double actualTemperature;
    private double targetTemperature;
    private Scanner scanner = new Scanner(System.in);

    AcController() {}

    public void setTemperature() throws InterruptedException {
        System.out.println("What is actual temperature?");
        actualTemperature = this.getTemperatureValue();
        System.out.println("What is target temperature?");
        targetTemperature = this.getTemperatureValue();
        this.validateTemp();
        System.out.println("You selected: actual temp: " + actualTemperature +", target temp: " + targetTemperature);
        System.out.println("if values are correct press 1- else press 0 to provide right values");

        int userInput = scanner.hasNextInt() ? scanner.nextInt() : -1;

        while (userInput !=0 && userInput !=1) {
            System.out.println("if values are correct press 1- else press 0 to provide right values");
            scanner.next();
            userInput = scanner.hasNextInt() ? scanner.nextInt() : -1;
        }

        if (userInput == 0) {
            this.actualTemperature = 0;
            this.targetTemperature = 0;
            this.setTemperature();
        } else if (userInput == 1) {
            System.out.println("start");
            this.adjustTemp();
        }

    }

    private double getTemperatureValue() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Accepted format: 10 or 10,5");
            scanner.next();
        }
        double input = scanner.nextDouble();
        return input;
    }

    private void validateTemp() throws InterruptedException {
        if (this.actualTemperature == this.targetTemperature) {
            this.actualTemperature = 0;
            this.targetTemperature = 0;
            System.out.println("Both values are equal");
            this.setTemperature();
        }
    }

    private void adjustTemp() throws InterruptedException {
        if (this.actualTemperature < this.targetTemperature) {
            while (this.actualTemperature < this.targetTemperature) {
                System.out.println("actual temp: " + actualTemperature);
                actualTemperature += 0.5;
                Thread.sleep(1000);
                if (actualTemperature == targetTemperature) {
                    System.out.println("target temp achieved: " + actualTemperature);
                }
            }
        }

        if (this.actualTemperature > this.targetTemperature) {
            while (this.actualTemperature > this.targetTemperature) {
                System.out.println("actual temp: " + actualTemperature);
                actualTemperature -= 0.5;
                Thread.sleep(1000);
                if (actualTemperature == targetTemperature) {
                    System.out.println("target temp achieved: " + actualTemperature);
                }
            }
        }
    }

}
