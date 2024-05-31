package ComparableAndComparator.exc2;

import Files.BufferReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class RealEstateFileHandler {
    private String fileName = "/Users/marcinochmanski/Desktop/java/java_start/java_start/FCC_tutorial/src/ComparableAndComparator/exc2/data.txt";

    public List getData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<RealEstateData> processedData = reader.lines()
                    .skip(1)
                    .map(data -> registerEstateData(data))
                    .collect(Collectors.toList());

            reader.close();
            return processedData;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    private RealEstateData registerEstateData(String data) {
        String[] dataArr = data.split(";");
        return new RealEstateData(dataArr[0], Double.valueOf(dataArr[1]), Double.valueOf(dataArr[2]));
    }

    public void getRealEstateInfo() {
        try {
            List<RealEstateData> data = getData();
            System.out.println("Dostępne nieruchomości:");
            data.sort(RealEstateData::compareTo);
            data.forEach(d -> System.out.println(printData(d)));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private String printData(RealEstateData data) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(data.getCity() + ", ");
        stringBuilder.append(data.getPrice() + "zł, ");
        stringBuilder.append(data.getArea() + "mkw, ");
        stringBuilder.append(data.getPricePerMeter() + "zł/mkw, ");
        return stringBuilder.toString();
    }


}



