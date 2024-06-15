package Records.exc;

import java.time.LocalDate;

enum Units {
        CELSIUS, FAHRENHEIT
}

public record WeatherRecord(LocalDate data, double minTemp, double maxTemp, Enum Units ) {

    public WeatherRecord {
    }
}
