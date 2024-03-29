package Converter;

public class TimeConverter {

    TimeConverter(){}

    int convertHoursTominutes(int amount) {
        return amount * 60;
    }

    int convertMinutesToSeconds(int amount) {
        return amount * 60 * 60;
    }

    int convertSecondsToMiliseconds (int amount) {
        return amount * 1000;
    }
}
