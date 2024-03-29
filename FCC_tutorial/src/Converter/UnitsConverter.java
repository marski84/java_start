package Converter;

public class UnitsConverter {
    public static void main(String[] args) {

        UnitConverter unitConverter = new UnitConverter();
        TimeConverter timeConverter = new TimeConverter();


        double convertedMeters = unitConverter.convertMetersToCentimeters(2.8);
        System.out.println(convertedMeters);

        double converted2 = unitConverter.convertCentimetersToMeters(550);
        System.out.println(converted2);

        int time1 = timeConverter.convertHoursTominutes(5);
        System.out.println(time1);

        int time2 = timeConverter.convertMinutesToSeconds(2);
        System.out.println(time2);

        int time3 = timeConverter.convertSecondsToMiliseconds(1);
        System.out.println(time3);


    }

}
