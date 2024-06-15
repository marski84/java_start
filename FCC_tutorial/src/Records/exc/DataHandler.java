package Records.exc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataHandler {
    private final List<WeatherRecord> data = new ArrayList();

    public void addRecord(Optional<WeatherRecord> record) {
        record.ifPresentOrElse(
                data::add,
                () -> {
                    throw new IllegalArgumentException("no data provided");
                }
        );

    }

}
