package ComparableAndComparator;

import lombok.Data;

@Data
public class Product implements Comparable<Product> {
    private String producer;
    private String name;
    private double price;

    public Product(String producer, String name, double price) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() < o.getPrice()) {
            return -1;
        }
        if (this.getPrice() > o.getPrice()) {
            return 1;
        }
        int producerCompare = this.producer.compareTo(o.producer);
        if (producerCompare != 0) {
            return producerCompare;
        }

        return name.compareTo(o.getName());
    }
}
