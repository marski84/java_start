package ComparableAndComparator.exc2;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RealEstateData implements Comparable<RealEstateData> {
    private String city;
    private double price;
    private double area;
    private double pricePerMeter;

    public RealEstateData(String city, double price, double area) {
        this.area = area;
        this.city = city;
        this.price = price;
        this.pricePerMeter = price / area;
        this.pricePerMeter = new BigDecimal(pricePerMeter).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    @Override
    public int compareTo(RealEstateData o) {
        return this.getPricePerMeter() < o.getPricePerMeter() ? -1 : 1;
    }
}
